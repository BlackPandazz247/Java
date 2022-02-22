package libreria;

public class PosizioneNonValida extends Exception{
    private int posizione, ripiano;

    public PosizioneNonValida(int posizione, int ripiano)
    {
        this.posizione = posizione;
        this.ripiano = ripiano;
    }

    public int getPosizione() {return posizione;}
    public int getRipaino() {return ripiano;}

    public String toString()
    {
        return "Posizione ("+ ripiano +","+ posizione +") NON valida\n";
    }
}