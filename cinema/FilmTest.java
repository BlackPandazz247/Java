package cinema;
import java.util.*;

public class FilmTest{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String titolo, regista, genere;
        int sala, menu, posix;
        ArrayList<Film> f = new ArrayList<Film>();  //array che contiene i film dell'utente
        ArrayList<String> g = new ArrayList<String>(); //array che contiene tutti i generi dei vari film
        
        do
        {
            System.out.print("1)Aggiungi un film\n2)Visualizza il catalogo\n3)Ricerca film per genere\n4)Cambia la sala di un film\n0)EXIT\n: ");
            menu = input.nextInt(); input.nextLine(); 
            switch(menu)
            {
                case 1:
                    System.out.print("\nInserisci il titolo del film: ");
                    titolo = input.nextLine();
                    System.out.print("Inserisci il nome del regista: ");
                    regista = input.nextLine();
                    System.out.print("Inserisci il genere del film: ");
                    genere = input.nextLine();
                    System.out.print("Inserisci la sala: ");
                    sala = input.nextInt(); input.nextLine();
                    System.out.println();
                    f.add(new Film(titolo, regista, genere, sala));
                    break;

                case 2:
                    for(int i=0; i<f.size() ;i++)
                        System.out.println(f.get(i));
                    System.out.println();
                    break;

                case 3:
                    for(int i=0; i<f.size() ;i++)
                    {   
                        if(g.contains(f.get(i).getGenere()) == false)  //carico nel vettore "g" un nuovo genere
                            g.add(f.get(i).getGenere());
                    }

                    System.out.println("\nGeneri: ");  //stampo i generi che ho trovato
                    for(int i=0; i<g.size() ;i++)
                        System.out.println((i+1)+")"+g.get(i));

                    System.out.print("Scegli il genere da ricercare: ");  //faccio scegliere all'utente il genere da ricercare
                    posix = input.nextInt(); input.nextLine();
                    for(int i=0; i<f.size() ;i++)
                    {
                        if(f.get(i).getGenere().equals(g.get(posix-1)) == true)  //controllo se nell'array "f" c'è il genere scelto dall'utente 
                            System.out.println(f.get(i));   //stampo il film del genere selezionato se esiste
                    }
                    System.out.println();
                    break;

                case 4:
                    for(int i=0; i<f.size() ;i++)
                        System.out.println(f.get(i)+"\n"+(i+1)+")");  //stampo all'utente tutti i film disponibili
                    System.out.println();   

                    System.out.print("Scegli il film da spostare in un altra sala: ");
                    posix = input.nextInt();
                    System.out.print("Scegli la nuova sala: ");
                    sala = input.nextInt(); input.nextLine();
                    f.get(posix-1).cambiaSala(sala);
                    System.out.println();
                    break;

                case 0:
                    System.out.println("--EXIT--");
                    break;

                default:
                    System.out.println("Scelta invalida\n");
            }
        }while(menu != 0);

        input.close();
    }
}