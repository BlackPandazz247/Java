package Uni;
import java.util.*;

public class LibrettoTest{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int matricola, menu, voto;
        String cognome, nome, esame, data;
        Libretto libretto;

        //inizializzo il libretto con i dati dello studente presi da tastiera
        System.out.print("Inserisci il numero di matricola: ");
        matricola = input.nextInt(); input.nextLine();
        System.out.print("Inserisci il cognome: ");
        cognome = input.nextLine();
        System.out.print("Inserisci il nome: ");
        nome = input.nextLine();
        libretto = new Libretto(matricola, cognome, nome);
        System.out.println(); 

        //menu
        do
        {
            System.out.print("1)Inserisci un esame\n2)Visualizza il libretto\n3)Leggi voto esame\n4)Leggi data esame\n0)EXIT\n:");
            menu = input.nextInt(); input.nextLine();
            switch(menu)
            {
                //termina il programma
                case 0:
                    System.out.println("--EXIT--");
                    break;

                //inserisce un esame nell'array all'interno del libretto
                case 1:
                    //faccio inserire i dati dell'esame dall'utente
                    System.out.print("Inserisci l'esame: ");
                    esame = input.nextLine();
                    System.out.print("Inserisci la data di svolgimento: ");
                    data = input.nextLine();
                    System.out.print("Inserisci il voto: ");
                    voto = input.nextInt(); input.nextLine();
                    libretto.scrivi(esame, data, voto); //chiamo il metodo scrivi per aggiungere l'esame nel libretto
                    System.out.println(); 
                    break;

                //visualizza il libretto
                case 2:
                    System.out.println(libretto);
                    break;

                //dato in input il nome di un esame torna il voto dello stesso
                case 3:
                    System.out.print("Inserisci l'esame di cui vuoi sapere il voto: ");
                    esame = input.nextLine();
                    
                    //se il metodo getVoto ritorna 0 vuol dire che l'esame non è ancora stato sostenuto e lo notifico
                    if(libretto.getVoto(esame) == 0)
                        System.out.println("Esame non ancora sostenuto\n");
                    else
                        System.out.println("Voto("+ libretto.getVoto(esame) +")\n");
                    break;

                //dato in input il nome di un esame torna la data dello stesso
                case 4:
                    System.out.print("Inserisci l'esame di cui vuoi sapere la data: ");
                    data = input.nextLine();

                    //se il metodo dataEsame ritorna la stringa "0" vuol dire che l'esame non è ancora stato sostenuto e lo notifico
                    if(libretto.dataEsame(data).equals("0"))
                        System.out.println("Esame non ancora sostenuto\n");
                    else
                        System.out.println(":"+ libretto.dataEsame(data) +"\n");
                    break;
                default:
                    System.out.println("ERRORE, scelta invalida!\n");
                    break;
            }
        }while(menu != 0);    
        input.close();
    }
}