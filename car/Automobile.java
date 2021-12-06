package car;
import java.util.Scanner;

public class Automobile{
    Scanner input = new Scanner(System.in);
    private boolean stato;
    private double velocita, serbatoio, consumi;
    private String modello, casaAutomobilistica, colore, targa;
    private String paintjob;

    //costruttore
    public Automobile(String modello, String casaAutomobilistica, String colore, String targa, double consumi, String paintjob)
    {   
        stato = false;
        velocita = 0;
        setModello(modello);
        setCasa_automobilistica(casaAutomobilistica);
        setColore(colore);
        setCarburante(0);
        setTarga(targa);
        setConsumi(consumi);
        setPaintjob(paintjob);
    }

    //costruttore vuoto
    public Automobile() {}

    //getter/setter 
    public void setModello(String modello) {this.modello = modello;}
    public void setCasa_automobilistica(String casaAutomobilistica) {this.casaAutomobilistica = casaAutomobilistica;}
    public void setColore(String colore) {this.colore = colore;}
    public void setTarga(String targa) {this.targa = targa;}
    public void setConsumi(double consumi) {this.consumi = consumi;}
    public void setPaintjob(String paintjob) {this.paintjob = paintjob;}
    public boolean getStato() {return stato;}
    public double getVelocita() {return velocita;}
    public String getModello() {return modello;}
    public String getCasa_automobilistica() {return casaAutomobilistica;}
    public String getColore() {return colore;}
    public double getSerbatoio() {return serbatoio;}
    public double getConsumi() {return consumi;}
    public String getTarga() {return targa;}
    public String getPaintjob() {return paintjob;}

    public void setCarburante(double litri) 
    {
        serbatoio += litri;
    }
        
    public void accendi()
    {
        if(getStato())
            System.out.println("L'automobile e' gia' accesa\n");
        else
        {
            stato = true; 
            System.out.println("L'auto e' stata accesa correttamente\n");
        }
    }
    public void spegni()
    {
        char scelta;

        if(velocita >= 10)
        {
            System.out.print("L'auto e' ancora in movimento, sicuro di volerla spegnere?(y/n): ");
            scelta = input.next().charAt(0);

            if(scelta == 'y')
            {
                stato = false;
                System.out.println("L'auto e' stata spenta\n");
            }
            else 
                System.out.println();
        }else{
            if(!getStato())
                System.out.println("L'auto e' gia spenta\n");
            else 
            {
                stato = false;
                System.out.println("L'auto e' stata spenta correttamente\n");  
            }  
        }
    }

    public void accellera(double kmh)
    {
        if(getStato() && velocita <= 420)
        {
           for(int i = 0; i<kmh ; i++)
           {
                velocita++;
           }
           
           if(velocita > 420)
                velocita = 420;

           System.out.println("Velocita attuale: " + getVelocita() + "\n");
        }
        else if(!getStato())
            System.out.println("L'auto e' spenta, accendila prima\n");
        else
            System.out.println("L'auto ha raggiunto la sua velocita massima e non può accelerare oltre\n");

    }
    public void frena()
    {
        if(velocita > 0)
        {
            for(int i = 0; i<5 ; i++)
            {
                velocita--;
            }

            if(velocita < 0)
                velocita = 0;
            
            System.out.println("Velocita attuale: " + getVelocita() + "\n");
        }
        else
            System.out.println("L'auto e' gia' ferma\n");
    }

    public void viaggio(double km)
    {
        if(serbatoio - km/consumi <= 0)
            System.out.println("Benzina insufficente per arrivare a destinazione, fai rifornimento prima");

        System.out.println("Hai benzina a sufficienza per arrivare a destinazione");
    }

    public String toString()
    {
        return "\n\t---informazioni auto---\n\tMarca: " + casaAutomobilistica + "\n\tModello: " + modello + "\n\tColore: " + colore + "\n\tTipo di verniciatura: " + paintjob + "\n\tTarga: " + targa 
        + "\n\tConsumi: " + consumi + "\n\t-----------------------\n";
    }

    public boolean isValid() //controllo se un ogetto è vuoto
    {
        return (modello != null && casaAutomobilistica != null && colore != null && targa != null);
    }
}