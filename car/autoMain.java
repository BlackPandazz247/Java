package car;
import java.util.Scanner;

public class autoMain{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Automobile auto;
        Automobile auto2 = new Automobile();
        String modello, casaAutomobilistica, colore, targa;
        double consumi;
        int restart = 1, scelta;
        String paintjob;

        System.out.print("Inserisci la marca della tua auto: ");
        casaAutomobilistica = input.nextLine();
        System.out.print("Inserisci il modello della tua auto: ");
        modello = input.nextLine();
        System.out.print("Inserisci il colore della tua auto: ");
        colore = input.nextLine();
        System.out.print("Inserisci la targa della tua auto: ");
        targa = input.nextLine();
        System.out.print("Inserisci i consumi (km/L) della tua auto: ");
        consumi = input.nextDouble();
        System.out.print("Inserisci il tipo di verniciatura della tua auto (wrap/vernice): ");
        input.nextLine(); paintjob = input.nextLine();
        System.out.println();
        auto = new Automobile(modello, casaAutomobilistica, colore, targa, consumi, paintjob);

        do
        {
            if(auto2.isValid())
            {
                System.out.print("Su quale auto vuoi lavorare? (1/2): ");
                scelta = input.nextInt();
            }else 
                scelta = 1;
            
            switch(scelta)
            {
                case 1:
                    do 
                    {
                        System.out.print("1)Accendi\n2)Spegni\n3)Accellera\n4)Frena\n5)freno a mano\n6)Controlla il serbatoio\n7)Fai benzina");
                        System.out.print("\n8)Stampa le informazioni della tua auto\n9)Rivernicia l'auto\n10)Reimmatricola l'auto\n11)Cambia auto\n12)Modalita' viaggio");
                        if(!auto2.isValid())
                            System.out.print("\n13)Compra una nuova auto\n0)EXIT\n: ");
                        else
                            System.out.print("\n14)Cambia auto su cui lavorare\n0)EXIT\n: ");
                        restart = input.nextInt();

                        switch(restart)
                        {
                            case 1:
                                auto.accendi();
                                break;
                            
                            case 2:
                                auto.spegni();
                                break;
                            
                            case 3:
                                auto.accellera();
                                break;

                            case 4:
                                auto.frena();
                                break;

                            case 5:
                                auto.stop();
                                break;

                            case 6:
                                System.out.println("L'auto ha " + auto.getSerbatoio() + " litri di benzina nel serbatoio\n");
                                break;

                            case 7:
                                double litri;

                                System.out.print("Quanti litri di benzina vuoi mettere nel serbatoio? :");
                                litri = input.nextDouble();
                                System.out.println();
                                auto.setCarburante(litri);
                                break;

                            case 8:
                                System.out.println(auto);
                                break;

                            case 9:
                                System.out.print("Vuoi applicare un wrap oppure vuoi verniciare l'auto?: ");
                                paintjob = input.nextLine();
                                if(paintjob.isEmpty())
                                    paintjob = input.nextLine();
                                
                                auto.setPaintjob(paintjob);

                                System.out.print("Inserisci il nuovo colore: "); 
                                auto.setColore(input.nextLine());
                                System.out.println();
                                break;

                            case 10:
                                System.out.print("Inserisci il nuovo numero di targa: ");
                                targa = input.nextLine();
                                if(targa.isEmpty())
                                    targa = input.nextLine();

                                auto.setTarga(targa);
                                System.out.println();
                                break;

                            case 11:
                                System.out.print("Inserisci la marca della tua auto: ");
                                casaAutomobilistica = input.nextLine();
                                if(casaAutomobilistica.isEmpty())
                                    casaAutomobilistica = input.nextLine();
                                System.out.print("Inserisci il modello della tua auto: ");
                                modello = input.nextLine();
                                System.out.print("Inserisci il colore della tua auto: ");
                                colore = input.nextLine();
                                System.out.print("Inserisci la targa della tua auto: ");
                                targa = input.nextLine();
                                System.out.print("Inserisci i consumi (km/L) della tua auto: ");
                                consumi = input.nextDouble();
                                System.out.print("Inserisci il tipo di verniciatura della tua auto (wrap/vernice): ");
                                input.nextLine(); paintjob = input.nextLine();
                                System.out.println();
                                auto = new Automobile(modello, casaAutomobilistica, colore, targa, consumi, paintjob);
                                break;

                            case 12:
                                double km;

                                System.out.print("Quanto Km dista la tua destinazione? : ");
                                km = input.nextDouble();

                                auto.viaggio(km);
                                break;
                            
                            case 13:
                                System.out.print("Inserisci la marca della tua auto: ");
                                casaAutomobilistica = input.nextLine();
                                if(casaAutomobilistica.isEmpty())
                                    casaAutomobilistica = input.nextLine();
                                System.out.print("Inserisci il modello della tua auto: ");
                                modello = input.nextLine();
                                System.out.print("Inserisci il colore della tua auto: ");
                                colore = input.nextLine();
                                System.out.print("Inserisci la targa della tua auto: ");
                                targa = input.nextLine();
                                System.out.print("Inserisci i consumi (km/L) della tua auto: ");
                                consumi = input.nextDouble();
                                System.out.print("Inserisci il tipo di verniciatura della tua auto (wrap/vernice): ");
                                input.nextLine(); paintjob = input.nextLine();
                                System.out.println();
                                auto2 = new Automobile(modello, casaAutomobilistica, colore, targa, consumi, paintjob);
                                break;

                            case 14:
                                break;

                            case 0:
                                System.out.println("--EXIT--\n");
                                break;

                            default:
                                System.out.println("SCELTA INVALIDA\n");
                                break;
                        }
                    }while(restart != 0 && restart != 14);
                    break;  //fine menu per lavorare sulla prima auto

                case 2:
                    do 
                    {
                        System.out.print("1)Accendi\n2)Spegni\n3)Accellera\n4)Frena\n5)freno a mano\n6)Controlla il serbatoio\n7)Fai benzina");
                        System.out.print("\n8)Stampa le informazioni della tua auto\n9)Rivernicia l'auto\n10)Reimmatricola l'auto\n11)Cambia auto\n12)Modalita' viaggio");
                        System.out.print("\n13)Cambia auto su cui lavorare\n0)EXIT\n: ");
                        restart = input.nextInt();

                        switch(restart)
                        {
                            case 1:
                                auto2.accendi();
                                break;
                            
                            case 2:
                                auto2.spegni();
                                break;
                            
                            case 3:
                                auto2.accellera();
                                break;

                            case 4:
                                auto2.frena();
                                break;

                            case 5:
                                auto2.stop();
                                break;

                            case 6:
                                System.out.println("L'auto ha " + auto2.getSerbatoio() + " litri di benzina nel serbatoio\n");
                                break;

                            case 7:
                                double litri;

                                System.out.print("Quanti litri di benzina vuoi mettere nel serbatoio? :");
                                litri = input.nextDouble();
                                System.out.println();
                                auto2.setCarburante(litri);
                                break;

                            case 8:
                                System.out.println(auto2);
                                break;

                            case 9:
                                System.out.print("Vuoi applicare un wrap oppure vuoi verniciare l'auto?: ");
                                paintjob = input.nextLine();
                                if(paintjob.isEmpty())
                                    paintjob = input.nextLine();
                                
                                auto2.setPaintjob(paintjob);

                                System.out.print("Inserisci il nuovo colore: "); 
                                auto2.setColore(input.nextLine());
                                System.out.println();
                                break;

                            case 10:
                                System.out.print("Inserisci il nuovo numero di targa: ");
                                targa = input.nextLine();
                                if(targa.isEmpty())
                                    targa = input.nextLine();

                                auto2.setTarga(targa);
                                System.out.println();
                                break;

                            case 11:
                                System.out.print("Inserisci la marca della tua auto: ");
                                casaAutomobilistica = input.nextLine();
                                if(casaAutomobilistica.isEmpty())
                                    casaAutomobilistica = input.nextLine();
                                System.out.print("Inserisci il modello della tua auto: ");
                                modello = input.nextLine();
                                System.out.print("Inserisci il colore della tua auto: ");
                                colore = input.nextLine();
                                System.out.print("Inserisci la targa della tua auto: ");
                                targa = input.nextLine();
                                System.out.print("Inserisci i consumi (km/L) della tua auto: ");
                                consumi = input.nextDouble();
                                System.out.print("Inserisci il tipo di verniciatura della tua auto (wrap/vernice): ");
                                input.nextLine(); paintjob = input.nextLine();
                                System.out.println();
                                auto2 = new Automobile(modello, casaAutomobilistica, colore, targa, consumi, paintjob);
                                break;
                            
                            case 12:
                                double km;

                                System.out.print("Quanto Km dista la tua destinazione? : ");
                                km = input.nextDouble();

                                auto.viaggio(km);
                                break;

                            case 13:
                                break;

                            case 0:
                                System.out.println("--EXIT--\n");
                                break;

                            default:
                                System.out.println("SCELTA INVALIDA\n");
                                break;
                        }
                    }while(restart != 0 && restart != 13);
                    break;  //fine menu per lavorare sulla seconda auto     
            }
        }while(restart != 0);

        input.close();
    }
}