package Uni;

public class LibrettoStranieri extends Libretto{
    private String paese;
    private int esamiPrevisti;

    public LibrettoStranieri(int matricola, String cognome, String nome, String paese, int esamiPrevisti)
    {
        super(matricola, cognome, nome);
        this.paese = paese;
        this.esamiPrevisti = esamiPrevisti;
    }

    public void setEsamiPrevisti(int esamiPrevisti) {this.esamiPrevisti = esamiPrevisti;}
    public String getPaese() {return paese;}
    public int getEsamiPrevisti() {return esamiPrevisti;}

    public Boolean studenteModello()
    {
        return super.esamiDati() >= (int)(Math.round((double)70/100*esamiPrevisti));
    }

    public String toString()
    {
        String s = "Matricola["+ super.getMatricola() +"]: "+ super.getCognome() +" "+ super.getNome() +", proveniente da: "+ paese +". Ha sostenuto "+ super.esamiDati()+
        " esami su "+ esamiPrevisti +": ";
        s += super.toString();
        return s +"\n";
    }
}