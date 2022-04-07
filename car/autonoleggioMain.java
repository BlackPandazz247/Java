package car;
import java.util.Scanner;
import car.eccezioni.*;  //cartella con le eccezioni codice non valido e targa non valida

public class autonoleggioMain{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Autonoleggio autonoleggio = new Autonoleggio();
        Furgone furgone;
        String targa, marca, modello;
        int nPosti, x, codice;  //x è la variabile dello switch

        do
        {
            System.out.print("1)Inserisci un veicolo\n2)Visualizza i veicoli nel garage\n3)Ricerca veicolo per codice\n4)Ricerca veicolo per targa\n5)Ricerca veicoli per posti");
            System.out.println("\n6)Ricerca veicoli per marca\n7)Rimuovi veicolo per codice\n8)Rimuovi veicolo per targa\n0)EXIT");
            System.out.print(": ");
            x = input.nextInt(); input.nextLine();  //il nextline subito dopo il nextInt debugga il buffer di input 
            
            switch(x)
            {
                case 0:
                    break;  //il case 0 serve per uscire dal programma
                case 1:  //case 1 inserisci un veicolo da tastiera
                    System.out.print("Inserisci la targa: ");
                    targa = input.nextLine();
                    System.out.print("Inserisci la marca: ");
                    marca = input.nextLine();
                    System.out.print("Inserisci il modello: ");
                    modello = input.nextLine();
                    System.out.print("Inserisci il numero di posti: ");
                    nPosti = input.nextInt(); input.nextLine();
                    System.out.println();
                    
                    furgone = new Furgone(targa, marca, modello, nPosti);  //creiamo il furgone con i dati presi dall'utente
                    autonoleggio.setFurgone(furgone);  //inseriamo il furgone nell'autonoleggio
                    break;
                case 2:  //stampa di tutti i veicoli nell'autonoleggio
                    for(int i=0; i<autonoleggio.getNumVeicoli(); i++)
                        System.out.println(autonoleggio.getFurgone(i));
                    System.out.println();
                    break;
                case 3:  //ricerca di un veicolo per codice identificativo
                    System.out.print("Inserisci il codice: ");
                    codice = input.nextInt(); input.nextLine(); 
                    try
                    {
                        System.out.println(autonoleggio.getFurgoneCodice(codice));
                        System.out.println();
                    }
                    catch(codiceNonValido exception) //in caso l'utente inserisce un codice che non è valido (non esiste) stampiamo exception che contiene i dati sull'errore
                    {
                        System.out.println(exception);
                    }
                    break;
                case 4:   //ricerca di un veiccolo per targa
                    System.out.print("Inserisci la targa: ");
                    targa = input.nextLine();
                    try
                    {
                        System.out.println(autonoleggio.getFurgoneTarga(targa));
                        System.out.println();
                    }
                    catch (targaNonValida exception) //in caso l'utente inserisce una targa che non è valida (non esiste) stampiamo exception che contiene i dati sull'errore
                    {
                        System.out.println(exception);
                    }
                    break;
                case 5: //ricerca dei veicoli che hanno un determinato numero di posti 
                    System.out.print("Inserisci il numero di posti: ");
                    nPosti = input.nextInt(); input.nextLine();
                    String s = autonoleggio.getFurgoniPosti(nPosti);  //il metodo getFurgoniPosti ritona una string che contiene tutti i toString dei veicoli che hanno un determinato numero di posti
                    if(s.isEmpty())  //se la stringa del metoto getFurgoniPosti è vuota vuol dire che non esisto veicoli che hanno quel numero di posti
                        System.out.println("Non ci sono veicoli che hanno "+ nPosti +" posti");
                    System.out.println(s); //se la stringa s non è vuota la stampiamo
                    break;
                case 6: //ricerca del numero di veicoli di una determinata marca data dall'utente
                    System.out.print("Inserisci la marca: ");
                    marca = input.nextLine();
                    System.out.println(marca.toUpperCase() +": "+ autonoleggio.getFurgoniMarca(marca) +" veicoli");
                    System.out.println();
                    break;
                case 7: //rimozione di un veicolo da un codice inserito dall'utente
                    System.out.print("Inserisci il codice: ");
                    codice = input.nextInt(); input.nextLine(); 
                    try
                    {
                        autonoleggio.rimuoviFurgone(codice);
                        System.out.println();
                    }
                    catch (codiceNonValido exception) //se il codice inserito è invalido(non esiste) si stampa exception che contiene tutte le informazioni sull'errore di codice non valido
                    {
                        System.out.println(exception);
                    }
                    break;
                case 8:  //rimozione di un veicolo dalla targa inserita dall'utente
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