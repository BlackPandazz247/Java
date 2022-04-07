package Gerarchia;

public class Abbigliamento extends Merce{
    private static double scontoDonna = 10.0;
    private static double scontoUomo = 5.0;
    private char sesso;
    private String taglia;
    private String tipologia;

    public Abbigliamento(String codice, double prezzo, char sesso, String taglia, String tipologia)
    {
        super(codice, prezzo);
        this.sesso = sesso;
        this.taglia = taglia;
        this.tipologia = tipologia;
    }

    //set
    public void setScontoUomo(double percentuale) {scontoUomo = percentuale;}
    public void setScontoDonna(double percentuale) {scontoDonna = percentuale;}
    public void setTaglia(String taglia) {this.taglia = taglia;}
    public void setTipologia(String tipologia) {this.tipologia = tipologia;}
    //get
    public double getScontoUomo() {return scontoUomo;}
    public double getScontoDonna() {return scontoDonna;}
    public String getTaglia() {return taglia;}
    public String getTipologia() {return tipologia;}
    public char getSesso() {return sesso;}

    public double calcolaImporto()
    {
        if(sesso == 'F' || sesso == 'f')
            return prezzoUnitario-prezzoUnitario*scontoDonna/100.0;
        if(sesso == 'M' || sesso == 'm')
         return prezzoUnitario-prezzoUnitario*scontoUomo/100.0;
        
        return prezzoUnitario;
    }

    public String toString()
    {
        return super.toString() +"\n\tTipologia: "+ tipologia +"\n\tSesso: "+ sesso +"\n\tTaglia: "+ taglia +"\n\tPrezzo: "+ calcolaImporto() +"\n";
    }

    public Abbigliamento clone()
    {
        Abbigliamento prodotto = new Abbigliamento(super.getCodice(), super.prezzoUnitario, this.sesso, this.taglia, this.tipologia);
        return prodotto;
    }
}