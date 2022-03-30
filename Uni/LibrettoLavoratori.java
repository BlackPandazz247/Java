package Uni;

public class LibrettoLavoratori extends Libretto{
    private int annoLavoro, esamiPrevisti;

    public LibrettoLavoratori(int matricola, String cognome, String nome, int annoLavoro, int esamiPrevisti)
    {
        super(matricola, cognome, nome);
        this.annoLavoro = annoLavoro;
        this.esamiPrevisti = esamiPrevisti;
    }

    public void setEsamiPrevisti(int esamiPrevisti) {this.esamiPrevisti = esamiPrevisti;}
    public int getAnnoLavoro() {return annoLavoro;}
    public int getEsamiPrevisti() {return esamiPrevisti;}

    public Boolean studenteModello()
    {
        return super.esamiDati() >= (int)(Math.round((double)70/100*esamiPrevisti));
    }

    public String toString()
    {
        String s = "Matricola["+ super.getMatricola() +"]: "+ super.getCognome() +" "+ super.getNome() +", lavoratore dal "+ annoLavoro +". Ha sostenuto "+ super.esamiDati()+
        " esami su "+ esamiPrevisti +": ";
        s += super.toString();
        return s +"\n";
    }
}