package car;
import car.eccezioni.*;

public class Autonoleggio{
    private final int MAX_FURGONI = 1000;
    private int codice;
    private Furgone garage[];
    private int veicoli;

    public Autonoleggio()
    {
        garage = new Furgone[MAX_FURGONI];
        codice = 0;
        veicoli = 0;
    }

    public Autonoleggio(Autonoleggio a)
    {
        garage = new Furgone[MAX_FURGONI];
        for(int i=0; i<veicoli; i++)
        {
            garage[i] = new Furgone(a.getFurgone(a.garage[i].getCodice()));
        }
    }

    public int getPosizioneFurgone(int codice)
    {
        for(int i=0; i<veicoli; i++)
        {
            if(garage[i].getCodice() == codice)
                return i;
        }
        return -1;  //veicolo non trovato
    }
    public int getPosizioneFurgoneTarga(String targa)
    {
        for(int i=0; i<veicoli; i++)
        {
            if(garage[i].getTarga().equalsIgnoreCase(targa))
                return i;
        }
        return -1;  //veicolo non trovato
    }

    public Furgone getFurgoneCodice(int codice) throws codiceNonValido
    {
        try
        {
            int i = getPosizioneFurgone(codice);
            return garage[i];
        }
        catch(ArrayIndexOutOfBoundsException exception)
        {
            throw new codiceNonValido(codice);
        }
    }
    public Furgone getFurgoneTarga(String targa) throws targaNonValida
    {
        try 
        {
            int i=getPosizioneFurgoneTarga(targa);
            return garage[i];
        }
        catch(ArrayIndexOutOfBoundsException exception)
        {
            throw new targaNonValida(targa);
        }
    }

    public Furgone getFurgone(int i)
    {
        return garage[i];
    }

    public void setFurgone(Furgone furgone)
    {
        codice++;
        furgone.setCodice(codice);
        garage[veicoli] = new Furgone(furgone);
        veicoli++;
    }

    public void rimuoviFurgone(int codice) throws codiceNonValido
    {   
        int pos = getPosizioneFurgone(codice);
        try
        {
            garage[pos] = null;
            Furgone[] v = new Furgone[MAX_FURGONI];
            int j = 0;
            for(int i=0; i<veicoli; i++)
            {
                if(i != pos)
                {
                    v[j] = garage[i];
                    j++;
                }
            }
            garage = v;
            veicoli = j;
        }
        catch(ArrayIndexOutOfBoundsException exception)
        {
            throw new codiceNonValido(codice);
        }
    }
    public void rimuoviFurgoneTarga(String targa) throws targaNonValida
    {
        int pos = getPosizioneFurgoneTarga(targa);
        try
        {
            garage[pos] = null;
            Furgone[] v = new Furgone[MAX_FURGONI];
            int j = 0;
            for(int i=0; i<veicoli; i++)
            {
                if(i != pos)
                {
                    v[j] = garage[i];
                    j++;
                }
            }
            garage = v;
            veicoli = j;
        }
        catch(ArrayIndexOutOfBoundsException exception)
        {
            throw new targaNonValida(targa);
        }
    }

    public String getFurgoniPosti(int posti)
    {
        String s = "";
        for(int i=0; i<veicoli; i++)
        {
            if(garage[i].getPosti() == posti)
                s += garage[i].toString() + "\n";
        }
        return s;
    }

    public int getMaxFurgoni() {return MAX_FURGONI;}
    public int getNumVeicoli() {return veicoli;}

    public int getFurgoniMarca(String marca)
    {
        int contatore = 0;
        for(int i=0; i<veicoli; i++)
        {
            if(garage[i].getMarca().equalsIgnoreCase(marca))
                contatore++;
        }
        return contatore;
    }
}