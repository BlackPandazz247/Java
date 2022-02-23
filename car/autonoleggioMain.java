package car;
import java.util.Scanner;
import car.eccezioni.*;

public class autonoleggioMain{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Autonoleggio autonoleggio = new Autonoleggio();
        Furgone furgone;
        String targa, marca, modello;
        int nPosti, x, codice;

        do
        {
            System.out.print("1)Inserisci un veicolo\n2)Visualizza i veicoli nel garage\n3)Ricerca veicolo per codice\n4)Ricerca veicolo per targa\n5)Ricerca veicoli per posti");
            System.out.println("\n6)Ricerca veicoli per marca\n7)Rimuovi veicolo per codice\n8)Rimuovi veicolo per targa\n0)EXIT");
            System.out.print(": ");
            x = input.nextInt(); input.nextLine();
            
            switch(x)
            {
                case 0:
                    break;
                case 1:
                    System.out.print("Inserisci la targa: ");
                    targa = input.nextLine();
                    System.out.print("Inserisci la marca: ");
                    marca = input.nextLine();
                    System.out.print("Inserisci il modello: ");
                    modello = input.nextLine();
                    System.out.print("Inserisci il numero di posti: ");
                    nPosti = input.nextInt(); input.nextLine();
                    System.out.println();
                    
                    furgone = new Furgone(targa, marca, modello, nPosti);
                    autonoleggio.setFurgone(furgone);
                    break;
                case 2:
                    for(int i=0; i<autonoleggio.getNumVeicoli(); i++)
                        System.out.println(autonoleggio.getFurgone(i));
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Inserisci il codice: ");
                    codice = input.nextInt(); input.nextLine(); 
                    try
                    {
                        System.out.println(autonoleggio.getFurgoneCodice(codice));
                        System.out.println();
                    }
                    catch(codiceNonValido exception) 
                    {
                        System.out.println(exception);
                    }
                    break;
                case 4:
                    System.out.print("Inserisci la targa: ");
                    targa = input.nextLine();
                    try
                    {
                        System.out.println(autonoleggio.getFurgoneTarga(targa));
                        System.out.println();
                    }
                    catch (targaNonValida exception)
                    {
                        System.out.println(exception);
                    }
                    break;
                case 5:
                    System.out.print("Inserisci il numero di posti: ");
                    nPosti = input.nextInt(); input.nextLine();
                    String s = autonoleggio.getFurgoniPosti(nPosti);
                    if(s.isEmpty())
                        System.out.println("Non ci sono veicoli che hanno "+ nPosti +" posti");
                    System.out.println(s);
                    break;
                case 6:
                    System.out.print("Inserisci la marca: ");
                    marca = input.nextLine();
                    System.out.println(marca.toUpperCase() +": "+ autonoleggio.getFurgoniMarca(marca) +" veicoli");
                    System.out.println();
                    break;
                case 7:
                    System.out.print("Inserisci il codice: ");
                    codice = input.nextInt(); input.nextLine(); 
                    try
                    {
                        autonoleggio.rimuoviFurgone(codice);
                        System.out.println();
                    }
                    catch (codiceNonValido exception)
                    {
                        System.out.println(exception);
                    }
                    break;
                case 8:
                    System.out.print("Inserisci la targa: ");
                    targa = input.nextLine();
                    try
                    {
                        autonoleggio.rimuoviFurgoneTarga(targa);
                        System.out.println();
                    }
                    catch(targaNonValida exception)
                    {
                        System.out.println(exception);
                    }
                    break;
                default:
                    System.out.println("Scelta invalida\n");
                    break;
            }
        }while(x != 0);
        input.close();
    }
}