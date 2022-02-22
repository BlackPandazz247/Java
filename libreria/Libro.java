package libreria;

public class Libro{
    private String titolo, autore;
    private int numeroPagine;
    private static double costoPagine = 0.05;
    final  double COSTO_FISSO = 5.5;

    public Libro(String titolo, String autore, int numeroPagine)
    {
        this.titolo = titolo;
        this.autore = autore;
        this.numeroPagine = numeroPagine;
    }

    public Libro(Libro libro)
    {
        setTitolo(libro.getTitolo());
        setAutore(libro.getAutore());
        setNumeroPagine(libro.getNumeroPagine());
    }

    public void setTitolo(String titolo) {this.titolo = titolo;}
    private void setAutore(String autore) {this.autore = autore;}
    private void setNumeroPagine(int numeroPagine) {this.numeroPagine = numeroPagine;}
    public static void setCostoPagine(double costo) {costoPagine = costo;}
    public String getTitolo() {return titolo;}
    public String getAutore() {return autore;}
    public int getNumeroPagine() {return numeroPagine;}
    
    public double prezzo() {return COSTO_FISSO + numeroPagine*costoPagine;}

    public String toString()
    {
        return "'"+ titolo +"' di "+  autore +"; "+ numeroPagine +" pagine, "+ prezzo() +" euro";
    }
}