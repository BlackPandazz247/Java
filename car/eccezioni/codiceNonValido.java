package car.eccezioni;

public class codiceNonValido extends Exception{
    private int codice;

    public codiceNonValido(int codice)
    {
        this.codice = codice;
    }

    public String toString()
    {
        return "Codice["+ codice +"] NON valido!\n";
    }
}