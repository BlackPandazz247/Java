package Uni;
import java.util.*;

public class LibrettoTest{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int menu = 1;
        int matricola, scelta, voto, annoLavoro, esamiPrevisti;
        String cognome, nome, esame, data, paese;
        LibrettoStranieri librettoEsteri;
        LibrettoLavoratori librettoLavoro;
        LibrettoRegolari libretto;

        //inizializzo il librettoStranieri con i dati dello studente presi da tastiera
        System.out.print("Inserisci il numero di matricola: ");
        matricola = input.nextInt(); input.nextLine();
        System.out.print("Inserisci il cognome: ");
        cognome = input.nextLine();
        System.out.print("Inserisci il nome: ");
        nome = input.nextLine();
        System.out.print("Inserisci il paese d'origine: ");
        paese = input.nextLine();
        System.out.print("Inserisci il numero di esami previsti dal corso di studi: ");
        esamiPrevisti = input.nextInt();
        librettoEsteri = new LibrettoStranieri(matricola, cognome, nome, paese, esamiPrevisti);
        System.out.println();
        
        //inizializzo il librettoLavoratori con i dati dello studente presi da tastiera
        System.out.print("Inserisci il numero di matricola: ");
        matricola = input.nextInt(); input.nextLine();
        System.out.print("Inserisci il cognome: ");
        cognome = input.nextLine();
        System.out.print("Inserisci il nome: ");
        nome = input.nextLine();
        System.out.print("Inserisci l'anno in cui hai iniziato a lavorare: ");
        annoLavoro = input.nextInt();
        System.out.print("Inserisci il numero di esami previsti dal corso di studi: ");
        esamiPrevisti = input.nextInt();
        librettoLavoro = new LibrettoLavoratori(matricola, cognome, nome, annoLavoro, esamiPrevisti);
        System.out.println();

        //inizializzo il libretto con i dati dello studente presi da tastiera
        System.out.print("Inserisci il numero di matricola: ");
        matricola = input.nextInt(); input.nextLine();
        System.out.print("Inserisci il cognome: ");
        cognome = input.nextLine();
        System.out.print("Inserisci il nome: ");
        nome = input.nextLine();
        System.out.print("Inserisci il numero di esami previsti dal corso di studi: ");
        esamiPrevisti = input.nextInt(); 
        libretto = new LibrettoRegolari(matricola, cognome, nome, esamiPrevisti);
        System.out.println();

        //menu
        do
        {
            System.out.println("Scegli il libretto da aprire");
            System.out.println("1)"+ librettoEsteri +"2)"+ librettoLavoro +"3)"+ libretto +"0)EXIT");
            System.out.print(":");
            scelta = input.nextInt();
            System.out.println();
            switch(scelta)
            {
                //termina il programma
                case 0:
                    System.out.println("--EXIT--");
                    break;

                //operazioni per il librettoEsteri
                case 1:
                    do
                    {
                        System.out.print("1)Inserisci un esame\n2)Visualizza il libretto\n3)Leggi voto esame\n4)Leggi data esame\n5)Studente Modello\n6)Cambia libretto\n0)EXIT\n:");
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
                                librettoEsteri.scrivi(esame, data, voto); //chiamo il metodo scrivi per aggiungere l'esame nel libretto
                                System.out.println(); 
                                break;

                            //visualizza il libretto
                            case 2:
                                System.out.println(librettoEsteri);
                                break;

                            //dato in input il nome di un esame torna il voto dello stesso
                            case 3:
                                System.out.print("Inserisci l'esame di cui vuoi sapere il voto: ");
                                esame = input.nextLine();
                                
                                //se il metodo getVoto ritorna 0 vuol dire che l'esame non è ancora stato sostenuto e lo notifico
                                if(librettoEsteri.getVoto(esame) == 0)
                                    System.out.println("Esame non ancora sostenuto\n");
                                else
                                    System.out.println("Voto("+ librettoEsteri.getVoto(esame) +")\n");
                                break;

                            //dato in input il nome di un esame torna la data dello stesso
                            case 4:
                                System.out.print("Inserisci l'esame di cui vuoi sapere la data: ");
                                data = input.nextLine();

                                //se il metodo dataEsame ritorna la stringa "0" vuol dire che l'esame non è ancora stato sostenuto e lo notifico
                                if(librettoEsteri.dataEsame(data).equals("0"))
                                    System.out.println("Esame non ancora sostenuto\n");
                                else
                                    System.out.println(":"+ librettoEsteri.dataEsame(data) +"\n");
                                break;

                            //controlla se lo studente ha sostentuo gli esami previsti con il metodo studenteModello e stampa il relativo risultato
                            case 5:
                                if(librettoEsteri.studenteModello())
                                    System.out.println("Ha sostenuto tutti gli esami previsti\n");
                                else
                                    System.out.println("Non ha sostenuto gli esami previsti\n");
                                break;

                            //esce dal menu di un libretto per entrare negli altri
                            case 6:
                                break;

                            //se l'utente non inserisce uno dei case viene visualizzato un errore
                            default:
                                System.out.println("ERRORE, scelta invalida!\n");
                                break;
                        }
                    }while(menu!=0 && menu!=6);  //stampo il menu finche l'utente non decide di terminare il programma o cambiare libretto
                    break;
                
                //operazioni per il librettoLavoro
                case 2:
                    do
                    {
                        System.out.print("1)Inserisci un esame\n2)Visualizza il libretto\n3)Leggi voto esame\n4)Leggi data esame\n5)Studente Modello\n6)Cambia libretto\n0)EXIT\n:");
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
                                librettoLavoro.scrivi(esame, data, voto); //chiamo il metodo scrivi per aggiungere l'esame nel libretto
                                System.out.println(); 
                                break;

                            //visualizza il libretto
                            case 2:
                                System.out.println(librettoLavoro);
                                break;

                            //dato in input il nome di un esame torna il voto dello stesso
                            case 3:
                                System.out.print("Inserisci l'esame di cui vuoi sapere il voto: ");
                                esame = input.nextLine();
                                
                                //se il metodo getVoto ritorna 0 vuol dire che l'esame non è ancora stato sostenuto e lo notifico
                                if(librettoLavoro.getVoto(esame) == 0)
                                    System.out.println("Esame non ancora sostenuto\n");
                                else
                                    System.out.println("Voto("+ librettoLavoro.getVoto(esame) +")\n");
                                break;

                            //dato in input il nome di un esame torna la data dello stesso
                            case 4:
                                System.out.print("Inserisci l'esame di cui vuoi sapere la data: ");
                                data = input.nextLine();

                                //se il metodo dataEsame ritorna la stringa "0" vuol dire che l'esame non è ancora stato sostenuto e lo notifico
                                if(librettoLavoro.dataEsame(data).equals("0"))
                                    System.out.println("Esame non ancora sostenuto\n");
                                else
                                    System.out.println(":"+ librettoLavoro.dataEsame(data) +"\n");
                                break;

                            //controlla se lo studente ha sostentuo gli esami previsti con il metodo studenteModello e stampa il relativo risultato
                            case 5:
                                if(librettoLavoro.studenteModello())
                                    System.out.println("Ha sostenuto tutti gli esami previsti\n");
                                else
                                    System.out.println("Non ha sostenuto gli esami previsti\n");
                                break;

                            //esce dal menu di un libretto per entrare negli altri
                            case 6:
                                break;

                            //se l'utente non inserisce uno dei case viene visualizzato un errore
                            default:
                                System.out.println("ERRORE, scelta invalida!\n");
                                break;
                        }
                    }while(menu!=0 && menu!=6);  //stampo il menu finche l'utente non decide di terminare il programma o cambiare libretto
                    break;

                //operazioni per il librettoRegolari
                case 3:
                    do
                    {
                        System.out.print("1)Inserisci un esame\n2)Visualizza il libretto\n3)Leggi voto esame\n4)Leggi data esame\n5)Studente Modello\n6)Cambia libretto\n0)EXIT\n:");
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

                            //controlla se lo studente ha sostentuo gli esami previsti con il metodo studenteModello e stampa il relativo risultato
                            case 5:
                                if(libretto.studenteModello())
                                    System.out.println("Ha sostenuto tutti gli esami previsti\n");
                                else
                                    System.out.println("Non ha sostenuto gli esami previsti\n");
                                break;

                            //esce dal menu di un libretto per entrare negli altri
                            case 6:
                                break;

                            //se l'utente non inserisce uno dei case viene visualizzato un errore
                            default:
                                System.out.println("ERRORE, scelta invalida!\n");
                                break;
                        }
                    }while(menu!=0 && menu!=6);  //stampo il menu finche l'utente non decide di terminare il programma o cambiare libretto
                    break;

                //se l'utente non inserisce uno dei case viene visualizzato un errore
                default:
                    System.out.println("ERRORE, scelta invalida!\n");
                    break;
            }
        }while(scelta!=0 && menu != 0);
                
        input.close();
    }
}