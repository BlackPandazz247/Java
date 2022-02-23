package car.eccezioni;

public class targaNonValida extends Exception{
    private String targa;

    public targaNonValida(String targa)
    {
        this.targa = targa;
    }

    public String toString()
    {
        return "La targa("+ targa +") è NON valida o inesistente!\n";
    }
}