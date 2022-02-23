package car;

public class Furgone{
    private int codice, nPosti;
    private String targa, marca, modello;

    //costruttore
    public Furgone(String targa, String marca, String modello, int nPosti)
    {
        codice = 0;
        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
        this.nPosti = nPosti;
    }
    //costruttore di copia
    public Furgone(Furgone furgone)
    {
        codice = furgone.getCodice();
        targa = furgone.getTarga();
        marca = furgone.getMarca();
        modello = furgone.getModello();
        nPosti = furgone.getPosti();
    }

    public void setCodice(int codice) {this.codice = codice;}
    private void setTarga(String targa) {this.targa = targa;}
    private void setMarca(String marca) {this.marca = marca;}
    private void setModello(String modello) {this.modello = modello;}
    private void setPosti(int posti) {this.nPosti = posti;}
    public int getCodice() {return codice;}
    public String getTarga() {return targa;}
    public String getMarca() {return marca;}
    public String getModello() {return modello;}
    public int getPosti() {return nPosti;}

    public String toString()
    {
        return "Veicolo["+ codice +"] "+ marca.toUpperCase() +" "+ modello.toUpperCase() +" - "+ nPosti +" posti-targa: "+ targa;
    }
}