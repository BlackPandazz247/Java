package Uni;

public class Esame{
    //attributi
    private String esame, data;
    private int voto;

    //costruttore
    public Esame(String esame, String data, int voto)
    {
        setEsame(esame);
        setData(data);
        setVoto(voto);
    }

    //get/set
    private void setEsame(String esame) {this.esame = esame;}
    public String getEsame() {return esame;}
    private void setData(String data) {this.data = data;}
    public String getData() {return data;}
    private void setVoto(int voto) {this.voto = voto;}
    public int getV() {return voto;}

    //toString
    public String toString()
    {
        return esame +" - "+ data +", voto("+ voto +")";
    }
}