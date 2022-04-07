package Gerarchia;

public class Conservati extends Alimentari{
    private String marca;

    public Conservati(String codice, double prezzo, String descrizione, double peso, double calorieUnitarie, String marca)
    {
        super(codice, prezzo, descrizione, peso, calorieUnitarie);
        this.marca = marca;
    }

    public void setMarca(String marca) {this.marca = marca;}
    public String getMarca() {return marca;}

    public String toString()
    {
        return super.toString() +"\n\tMarca: "+ marca +"\n";
    }

    public Conservati clone()
    {
        Conservati prodotto = new Conservati(super.getCodice(), super.prezzoUnitario, super.getDescrizione(), super.getPeso(), super.getcalorieUnitarie(), marca);
        return prodotto;
    }
}
