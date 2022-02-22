package libreria;
import java.util.Scanner;

public class mainLibreria{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        Scaffale scaffale = new Scaffale();
        Libro libro;
        String titolo, autore;
        int numeroPagine, x, posizione, ripiano;
        char utente;

        do 
        {
            System.out.println("1)Inserisci un libro\n2)Vedi i libri\n3)Prendi un libro\n4)Cambia il costo delle pagine\n5)Togli un libro\n6)Conta i libri\n0)EXIT");
            System.out.print(": ");
            x = input.nextInt(); input.nextLine();
            switch(x)
            {
                case 1:
                    System.out.print("Inserisci il titolo: ");
                    titolo = input.nextLine();
                    System.out.print("Inserisci l'autore: ");
                    autore = input.nextLine();
                    System.out.print("Inserisci il numero di pagine: ");
                    numeroPagine = input.nextInt();
                    libro = new Libro(titolo, autore, numeroPagine);

                    System.out.print("\nIn che mensola vuoi inserirlo ?: ");
                    ripiano = input.nextInt();
                    System.out.print("In che posizione vuoi inserirlo ?: ");
                    posizione = input.nextInt(); input.nextLine();
                    System.out.println();
                    try
                    {
                        scaffale.setLibro(libro, posizione, ripiano);
                    }
                    catch(PosizioneNonValida|PosizioneNonVuota exception)
                    {
                        System.out.println(exception);
                    }
                    break;
                case 2:
                    try
                    {
                        for(int i=0; i<scaffale.getNumRipiani(); i++)
                        {
                            for(int y=0; y<scaffale.getNumMaxLibriRipiano(i); y++)
                            {
                                libro = scaffale.getLibro(i, y);
                                if(libro != null)
                                    System.out.println("mensola: "+ i +" posizione: "+ y +" --> "+libro);
                            }
                        }
                    }
                    catch(PosizioneNonValida exception)
                    {
                        System.out.println("\n"+ exception);
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.print("In che mensola si trova ?: ");
                    ripiano = input.nextInt();
                    System.out.print("In che posizione si trova ?: ");
                    posizione = input.nextInt(); input.nextLine();
                    try
                    {
                        libro = scaffale.getLibro(ripiano, posizione);
                        if(libro != null)
                        {
                            System.out.print("\nVuoi cambiare titolo al libro?\n(Y/N): ");
                            utente = input.next().toLowerCase().charAt(0);
                            if(utente == 'y')
                            {
                                System.out.print("Inserisci il nuovo titolo: ");
                                input.nextLine(); titolo = input.nextLine();
                                System.out.println();
                                libro.setTitolo(titolo);
                            }
                            else
                                System.out.println();
                        }
                        else
                            System.out.println();
                    }
                    catch(PosizioneNonValida exception)
                    {
                        System.out.println("\n"+ exception);
                    }
                    break;
                case 4:
                    System.out.print("Inserisci il nuovo prezzo: ");
                    Libro.setCostoPagine(input.nextInt());
                    System.out.println();
                    break;
                case 5:
                    System.out.print("In che mensola si trova ?: ");
                    ripiano = input.nextInt();
                    System.out.print("In che posizione si trova ?: ");
                    posizione = input.nextInt(); input.nextLine();
                    try
                    {
                        scaffale.rimuoviLibro(ripiano, posizione);
                        System.out.println();
                    }
                    catch (PosizioneNonValida exception)
                    {
                        System.out.println("\n"+ exception);
                    }
                    break;
                case 6:
                    System.out.println(scaffale.getNumLibri() +" libri\n");
                    break;
                case 0:
                    System.out.println("--EXIT--");
                    break;
                default:
                    System.out.println("SCELTA INVALIDA!\n");
                    break;
            }
        }while(x != 0);
        input.close();
    }
}