package libreria;

public class Scaffale{
    final int MAX_RIPIANI = 5;
    private Mensola ripiani[];

    //costruttore
    public Scaffale()
    {
        ripiani = new Mensola[MAX_RIPIANI];
        for(int i=0; i<MAX_RIPIANI; i++)
        {
            ripiani[i] = new Mensola();
        }
    }

    //costruttore di copia
    public Scaffale(Scaffale scaffale) throws PosizioneNonValida
    {
        Libro libro;

        ripiani = new Mensola[MAX_RIPIANI];
        for(int i=0; i<MAX_RIPIANI; i++)
        {
            ripiani[i] = new Mensola();
            for(int y=0; y<ripiani[i].getNumMaxVolumi(); y++)
            {
                libro = scaffale.getLibro(i, y);
                if(libro != null)
                    ripiani[i].setVolume(libro, y);
            }
        }
    }

    public Libro getLibro(int ripiano, int posizione) throws PosizioneNonValida
    {
        try
        {
            return ripiani[ripiano].getVolume(posizione);
        }
        catch(ArrayIndexOutOfBoundsException exception)
        {
            throw new PosizioneNonValida(posizione, ripiano);
        }
    }

    public void setLibro(Libro libro, int posizione, int ripiano) throws PosizioneNonVuota, PosizioneNonValida
    {
        try 
        {
            if(ripiani[ripiano].setVolume(libro, posizione) < 0)
            {
                if(ripiani[ripiano].setVolume(libro, posizione) == -1)
                    throw new PosizioneNonValida(posizione, ripiano);
                else
                    throw new PosizioneNonVuota(posizione, ripiano);
            }
        }
        catch(ArrayIndexOutOfBoundsException exception)
        {
            throw new PosizioneNonValida(posizione, ripiano);
        }
    }

    public void rimuoviLibro(int  ripiano, int posizione) throws PosizioneNonValida
    {
        try
        {
            if(ripiani[ripiano].rimuoviVolume(posizione) < 0)  
                throw new PosizioneNonValida(posizione, ripiano); 
        }
        catch(ArrayIndexOutOfBoundsException exception)
        {
            throw new PosizioneNonValida(posizione, ripiano);
        }
    }

    public int getNumRipiani() {return MAX_RIPIANI;}

    public int getNumMaxLibri()
    {
        int contatore = 0;
        for(int i=0; i<MAX_RIPIANI; i++)
        {
            contatore += ripiani[i].getNumMaxVolumi();
        }
        return contatore;
    }

    public int getNumLibriRipiano(int ripiano) throws PosizioneNonValida
    {
        try
        {
            return ripiani[ripiano].getNumVolumi();
        }
        catch(ArrayIndexOutOfBoundsException exception)
        {
            throw new PosizioneNonValida(0, ripiano);
        }
    }

    public int getNumLibri()
    {
        int contatore = 0;
        for(int i=0; i<MAX_RIPIANI; i++)
        {
            contatore += ripiani[i].getNumVolumi();
        }
        return contatore;
    }

    public int getNumMaxLibriRipiano(int posizione)
    {
        return ripiani[posizione].getNumMaxVolumi();
    }
}