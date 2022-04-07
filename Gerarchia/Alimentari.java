package Gerarchia;

abstract public class Alimentari extends Merce{
    private String descrizione;
    private double peso;
    private double calorieUnitarie;

    public Alimentari(String codice, double prezzo, String descrizione, double peso, double calorieUnitarie)
    {
        super(codice, prezzo);
        this.descrizione = descrizione;
        this.peso = peso;
        this.calorieUnitarie = calorieUnitarie;
    }

    //Set
    public void setDescrizione(String descrizione) {this.descrizione = descrizione;}
    public void setPeso(double peso) {this.peso = peso;}
    public void setCalorieUnitarie(double calorieUnitarie) {this.calorieUnitarie = calorieUnitarie;}
    //get
    public String getDescrizione() {return descrizione;}
    public double getPeso() {return peso;}
    public double getcalorieUnitarie() {return calorieUnitarie;}

    public double calcolaCalorie()
    {
        return peso*calorieUnitarie;
    }
    public double calcolaImporto()
    {
        return prezzoUnitario*peso;
    }

    public String toString()
    {
        return super.toString() +"\n\tDescrizione:"+ descrizione +"\n\tPeso: "+ peso +"\n\tCalorie: "+ calcolaCalorie() +"\n\tImporto: "+ calcolaImporto();
    }
}