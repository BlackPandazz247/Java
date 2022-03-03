package musica;

public class Canzone{
    private String titolo, autore;
    private double durata;

    public Canzone(String titolo, String autore, double durata)
    {
        this.titolo = titolo;
        this.autore = autore;
        this.durata = durata;
    }

    public Canzone(Canzone canzone)
    {
        titolo = canzone.getTitolo();
        autore = canzone.getAutore();
        durata = canzone.getDurata();      
    }
    
    private void setTitolo(String titolo) {this.titolo = titolo;}
    private void setAutore(String autore) {this.autore = autore;}
    private void setDurata(int durata) {this.durata = durata;}
    public String getTitolo() {return titolo;}
    public String getAutore() {return autore;}
    public double getDurata() {return durata;}

    public String toString()
    {
        return "'"+ titolo +"' di "+ autore +"; "+ durata +" minuti";
    }
}