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

        System.out.print("Inserisci il modello della tua auto: ");
        modello = input.nextLine();
        System.out.print("Inserisci la marca della tua auto: ");
        casaAutomobilistica = input.nextLine();
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
                        System.out.print("1)Accendi\n2)Spegni\n3)Accellera\n4)Frena\n5)Controlla il serbatoio\n6)Fai benzina");
                        System.out.print("\n7)Stampa le informazioni della tua auto\n8)Rivernicia l'auto\n9)Reimmatricola l'auto\n10)Cambia auto");
                        if(!auto2.isValid())
                            System.out.print("\n11)Compra una nuova auto\n0)EXIT");
                        else
                            System.out.print("\n12)Cambia auto su cui lavorare");
                        System.out.print("\n: ");
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
                                double kmh;

                                do 
                                {
                                    System.out.print("A che velocita vuoi viaggiare? :");
                                    kmh = input.nextDouble();

                                    if(kmh > 420)
                                        System.out.println("Non puoi' superare la velocita' massima");
                                }while(kmh > 420 || kmh <= 0);
                                

                                auto.accellera(kmh);
                                break;

                            case 4:
                                auto.frena();
                                break;

                            case 5:
                                System.out.println("L'auto ha " + auto.getSerbatoio() + " litri di benzina nel serbatoio\n");
                                break;

                            case 6:
                                double litri;

                                System.out.print("Quanti litri di benzina vuoi mettere nel serbatoio? :");
                                litri = input.nextDouble();
                                auto.setCarburante(litri);
                                break;

                            case 7:
                                System.out.println(auto);
                                break;

                            case 8:
                                System.out.print("Vuoi applicare un wrap oppure vuoi verniciare l'auto?: ");
                                input.next(); auto.setPaintjob(input.nextLine());

                                System.out.print("Inserisci il nuovo colore: ");
                                auto.setColore(input.nextLine());
                                break;

                            case 9:
                                System.out.print("Inserisci il nuovo numero di targa: ");
                                auto.setTarga(input.nextLine());
                                break;

                            case 10:
                                System.out.print("Inserisci il modello della tua auto: ");
                                input.next(); modello = input.nextLine();
                                System.out.print("Inserisci la marca della tua auto: ");
                                casaAutomobilistica = input.nextLine();
                                System.out.print("Inserisci il colore della tua auto: ");
                                colore = input.nextLine();
                                System.out.print("Inserisci la targa della tua auto: ");
                                targa = input.nextLine();
                                System.out.print("Inserisci i consumi (km/L) della tua auto: ");
                                consumi = input.nextDouble();
                                System.out.print("Inserisci tipo di verniciatura della tua auto (wrap/vernice): ");
                                paintjob = input.nextLine();
                                auto = new Automobile(modello, casaAutomobilistica, colore, targa, consumi, paintjob);

                                System.out.println();
                                break;
                            
                            case 11:
                                System.out.print("Inserisci il modello della tua auto: ");
                                modello = input.nextLine();
                                System.out.print("Inserisci la marca della tua auto: ");
                                casaAutomobilistica = input.nextLine();
                                System.out.print("Inserisci il colore della tua auto: ");
                                colore = input.nextLine();
                                System.out.print("Inserisci la targa della tua auto: ");
                                targa = input.nextLine();
                                System.out.print("Inserisci i consumi (km/L) della tua auto: ");
                                consumi = input.nextDouble();
                                System.out.print("Inserisci tipo di verniciatura della tua auto (wrap/vernice): ");
                                input.next(); paintjob = input.nextLine();
                                auto2 = new Automobile(modello, casaAutomobilistica, colore, targa, consumi, paintjob);
                                break;

                            case 12:
                                restart = 0;
                                break;

                            case 0:
                                System.out.println("\n--EXIT--\n");
                                break;

                            default:
                                System.out.println("SCELTA INVALIDA");
                                break;
                        }
                    }while(restart != 0);
                    break;  //fine menu per lavorare sulla prima auto

                case 2:
                    do 
                    {
                        System.out.println("1)Stampa le informazioni della tua auto\n2)Controlla il serbatoio\n3)Rivernicia l'auto\n4)Reimmatricola l'auto\n5)Cambia auto\n6)Cambia auto su cui lavorare");
                        System.out.print("0)EXIT\n: ");
                        restart = input.nextInt();

                        switch(restart)
                        {
                            case 1:
                                System.out.println(auto2);
                                break;

                            case 2:
                                System.out.println("L'auto ha " + auto2.getSerbatoio() + " litri di benzina nel serbatoio");
                                break;

                            case 3:
                                System.out.print("Vuoi applicare un wrap oppure vuoi verniciare l'auto?: ");
                                input.next(); auto2.setPaintjob(input.nextLine());

                                System.out.print("Inserisci il nuovo colore: ");
                                auto2.setColore(input.nextLine());
                                break;

                            case 4:
                                System.out.print("Inserisci il nuovo numero di targa: ");
                                auto2.setTarga(input.nextLine());
                                break;
                            
                            case 5:
                                System.out.print("Inserisci il modello della tua auto: ");
                                modello = input.nextLine();
                                System.out.print("Inserisci la marca della tua auto: ");
                                casaAutomobilistica = input.nextLine();
                                System.out.print("Inserisci il colore della tua auto: ");
                                colore = input.nextLine();
                                System.out.print("Inserisci la targa della tua auto: ");
                                targa = input.nextLine();
                                System.out.print("Inserisci i consumi (km/L) della tua auto: ");
                                consumi = input.nextDouble();
                                System.out.print("Inserisci tipo di verniciatura della tua auto (wrap/vernice): ");
                                input.next(); paintjob = input.nextLine();
                                auto2 = new Automobile(modello, casaAutomobilistica, colore, targa, consumi, paintjob);
                                break;

                            case 6:
                                break;

                            case 0:
                                System.out.println("\n--EXIT--\n");
                                break;
                        }
                    }while(restart != 6 || restart != 0);
                    break;  //fine menu per lavorare sulla seconda auto     
            }
        }while(restart != 0);

        input.close();
    }
}