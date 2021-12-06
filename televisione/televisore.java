package televisione;

public class televisore{
    private int pollici;  //attributi
    private String schermo;
    private int canale;
    private int volume;
    private int luminosita;
    private Boolean acceso;
  
    private void setPollici(int p) {pollici = p;}  //getter/setter
    public int getPollici() {return pollici;}
    private void setSchermo(String pannello) {schermo = pannello;}
    public String getSchermo() {return schermo;}
    public int getCanale() {return canale;}
    public int getVolume() {return volume;}
    public int getLuminosita() {return luminosita;}
    public Boolean getAcceso() {return acceso;}

    public void setCanale(int n)  //metodi
    {
        if(n > 0 && n < 100)
            canale = n;
    }
    public void canaleNext()
    {
        if(canale < 100)
            canale++;
    }
    public void canalePrev()
    {
        if(canale > 0)
            canale--;
    }

    public void volumeNext()
    {
        if(volume < 100)
            volume++;
    }
    public void volumePrev()
    {
        if(volume > 0)
           volume--;
    }

    public void luminositaNext()
    {
        if(luminosita < 100)
            luminosita++;
    }
    public void luminositaPrev()
    {
        if(luminosita > 0)
            luminosita--;
    }

    public void accendi()
    {
        acceso = true;
        System.out.println("\nLa TV e' accesa\n");
    }
    public void spegni()
    {
        acceso = false;
        System.out.println("\nLa TV e' spenta\n");
    }

    public televisore(int pollici, String schermo){  //costruttore
        setPollici(pollici);
        setSchermo(schermo);
        canale = 1;
        volume = 10;
        luminosita = 50;
        acceso = false;
    }
}