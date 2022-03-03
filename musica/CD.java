package musica;

public class CD{
    private final static int DIMENSIONE = 24;
    private Canzone disco[];
    private final static double COSTO = 11;
    private String titoloCD;

    //costruttore
    public CD(String titoloCD)
    {
        this.titoloCD = titoloCD;
        disco = new Canzone[DIMENSIONE];
    }
    //costruttore di copia
    public CD(CD cd)
    {
        disco = new Canzone[DIMENSIONE];
        titoloCD = cd.getTitoloCD();
        for(int i=0; i<DIMENSIONE; i++)
            disco[i] = new Canzone(cd.getCanzone(i));
    }

    public String getTitoloCD() {return titoloCD;}
    private void setTitoloCD(String titoloCD) {this.titoloCD = titoloCD;}
    public int getDimensione() {return DIMENSIONE;}
    public double getCosto() {return COSTO;}

    public Canzone getCanzone(int posizione)
    {
        try 
        {
            return new Canzone(disco[posizione]);
        }
        catch(ArrayIndexOutOfBoundsException|NullPointerException exception)
        {
            return null;
        }
    }
    public int setCanzone(Canzone canzone, int posizione)
    {
        try
        {
            if(disco[posizione] != null)
                System.out.println("Posizione occupata");

            disco[posizione] = new Canzone(canzone);
            return posizione;
        }
        catch(ArrayIndexOutOfBoundsException exception)
        {
            return -1;
        }
    }

    public Canzone ricercaTitoloCanzone(String titolo)
    {
        for(int i=0; i<DIMENSIONE; i++)
        {
            if(disco[i].getTitolo().equalsIgnoreCase(titolo))
            {
                return new Canzone(disco[i]);
            }
        }
        return null;
    }
    public Canzone[] ricercaAutore(String autore)
    {
        Canzone[] vet = new Canzone[DIMENSIONE];
        for(int i=0; i<DIMENSIONE; i++)
        {
            if(disco[i].getAutore().equalsIgnoreCase(autore))
                vet[i] = new Canzone(disco[i]);
        }
        return vet;
    }

    public Canzone[] ricercaPerDurata(double durata)
    {
        double tempo = 0;
        Canzone vet[] = new Canzone[DIMENSIONE];
        for(int i=0; i<DIMENSIONE; i++)
        {
            tempo += disco[i].getDurata();
            vet[i] = new Canzone(disco[i]);
            if(tempo >= durata)
                break;
        }
        return vet;
    }

    public int rimuoviCanzone(int posizione)
    {
        try
        {
            disco[posizione] = null;
            return posizione;
        }
        catch(ArrayIndexOutOfBoundsException exception)
        {
            return -1;
        }
    }
}