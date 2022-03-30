package Uni;

public class LibrettoRegolari extends Libretto{
    private int esamiPrevisti;

    public LibrettoRegolari(int matricola, String cognome, String nome, int esamiPrevisti)
    {
        super(matricola, cognome, nome);
        this.esamiPrevisti = esamiPrevisti;
    }

    public void setEsamiPrevisti(int esamiPrevisti) {this.esamiPrevisti = esamiPrevisti;}
    public int getEsamiPrevisti() {return esamiPrevisti;}

    public Boolean studenteModello()
    {
        return super.esamiDati() >= (int)(Math.round((double)70/100*esamiPrevisti));
    }

    public String toString()
    {
        String s = "Matricola["+ super.getMatricola() +"]: "+ super.getCognome() +" "+ super.getNome() +". Ha sostenuto "+ super.esamiDati()+
        " esami su "+ esamiPrevisti +": ";
        s += super.toString();
        return s +"\n";
    }
}