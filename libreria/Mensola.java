package libreria;

public class Mensola{
    final int MAX_VOLUMI = 15;
    private Libro mensola[];

    //costruttore, inizializza il vettore
    public Mensola() {mensola = new Libro[MAX_VOLUMI];}
    
    //costruttore di copia
    public Mensola(Mensola m)
    {
        mensola = new Libro[MAX_VOLUMI]; //inizializzo il vettore
        for(int i=0; i<MAX_VOLUMI; i++)
        {
            if(m.getVolume(i) != null)
                mensola[i] = new Libro(m.getVolume(i));
        }
    }

    public int setVolume(Libro libro, int posizione)
    {
        try
        {
            if(mensola[posizione] != null)
                return -2; //posizione non vuota
            mensola[posizione] = new Libro(libro);
            return posizione;
        }
        catch(ArrayIndexOutOfBoundsException exception)
        {
            return -1; //posizione non valida
        }
    }

    public Libro getVolume(int posizione)
    {
        try
        {
            return mensola[posizione];
        }
        catch(ArrayIndexOutOfBoundsException|NullPointerException exception)
        {
            return null; //posizione non valida o poszione vuota
        }
    }

    public int rimuoviVolume(int posizione)
    {
        try
        {
            mensola[posizione] = null;
            return posizione;
        }
        catch(ArrayIndexOutOfBoundsException exception)
        {
            return -1; //posizione non valida
        }
    }

    public int getNumVolumi()
    {
        int conta = 0;
        for(int i=0; i<MAX_VOLUMI; i++)
        {
            if(mensola[i] != null)
                conta++;
        }
        return conta;
    }

    public int getNumMaxVolumi() {return MAX_VOLUMI;}
}