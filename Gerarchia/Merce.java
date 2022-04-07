package Gerarchia;

abstract public class Merce{
    private String codice;
    protected double prezzoUnitario;

    public Merce(String codice, double prezzoUnitario)
    {
        this.codice = codice;
        this.prezzoUnitario = prezzoUnitario;
    }

    public void setCodice(String codice) {this.codice = codice;}
    public void setPrezzoUnitario(double prezzoUnitario) {this.prezzoUnitario = prezzoUnitario;}
    public String getCodice() {return codice;}
    public double getPrezzoUnitario() {return prezzoUnitario;}

    abstract public double calcolaImporto();

    public String toString()
    {
        String s = "Prodotto("+ codice +"), prezzo unitario:"+ prezzoUnitario +" euro";
        return s;
    }

    abstract public Merce clone();
}