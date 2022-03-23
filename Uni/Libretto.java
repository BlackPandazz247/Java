package Uni;
import java.util.*;

public class Libretto{
    //attributi
    private int matricola;
    private String cognome,nome;
    private int n_esami;
    private ArrayList<Esame> e = new ArrayList<Esame>();  //array dinamico che salva gli esami sostenuti con relativa data e voto


    //costruttore
    public Libretto(int matricola, String cognome, String nome)
    {
        setMatricola(matricola);
        setCognome(cognome);
        setNome(nome);
        n_esami = 0;
    }

    //get/set
    public void setMatricola(int matricola) {this.matricola = matricola;}
    public int getMatricola() {return matricola;}
    private void setCognome(String cognome) {this.cognome = cognome;}
    public String getCognome() {return cognome;}
    private void setNome(String nome) {this.nome = nome;}
    public String getNome() {return nome;}
    public int esamiDati() {return n_esami;}

    //toString
    public String toString()
    {
        String s = "Matricola["+ matricola +"]: "+ cognome +" "+ nome +". Ha sostenuto "+ n_esami +" esami: ";
        for(int i=0; i<e.size(); i++)
        {
            s += "\n\t"+ e.get(i).toString();
        }
        return s +"\n";
    }

    //metodo che inserisce nell'array un esame e incrementa il numero di esami di 1
    public void scrivi(String esame, String data, int voto)
    {
        e.add(new Esame(esame, data, voto));
        n_esami++;
    }

    //metodo che dato in input il nome di un esame ritorna il relativo voto
    public int getVoto(String esame)
    {
        try
        {
            for(int i=0; i<e.size(); i++)
            {
                if(e.get(i).getEsame().equalsIgnoreCase(esame))
                    return e.get(i).getV();
            }
            return 0;
        }
        catch(ArrayIndexOutOfBoundsException|NullPointerException exception)
        {
            System.out.println("ERRORE!");
            return 0;
        }
    }

    //metodo che dato in input il nome di un esame ritorna la relativa data di svolgimento
    public String dataEsame(String esame)
    {
        try
        {
            for(int i=0; i<e.size(); i++)
            {
                if(e.get(i).getEsame().equalsIgnoreCase(esame))
                    return e.get(i).getData();
            }
            return "0";
        }
        catch(ArrayIndexOutOfBoundsException|NullPointerException exception)
        {
            System.out.println("ERRORE!");
            return "0";
        }
    }
} 