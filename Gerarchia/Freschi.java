package Gerarchia;

public class Freschi extends Alimentari{
    private static double costoSacchetto = 0.05;
    private boolean confezionato;

    public Freschi(String codice, double prezzo, String descrizione, double peso, double calorie, boolean confezionato)
    {
        super(codice, prezzo, descrizione, peso, calorie);
        this.confezionato = confezionato;
    }

    //get
    public double getCostoSacchetto() {return costoSacchetto;}
    public boolean getConfezzionato() {return confezionato;}

    public String toString()
    {
        String s;

        if(confezionato)
            s = "preconfezionato";
        else
            s = "sfuso";
        
        return super.toString() +"\n\tTipo confezione: "+ s +"\n";
    }

    public double calcolaImporto()
    {
        double importo = super.calcolaImporto();

        if(!confezionato)
            importo +=  costoSacchetto;
        
        return importo;
    }

    public Freschi clone()
    {
        Freschi prodotto = new Freschi(super.getCodice(), super.prezzoUnitario, super.getDescrizione(), super.getPeso(), super.getcalorieUnitarie(), confezionato);
        return prodotto;
    }
}
