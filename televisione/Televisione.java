package televisione;

public class Televisione{
    public static void main(String asrgs[]){
        televisore t1 = new televisore(50,"LED");

        t1.accendi();
        t1.setCanale(59);
        t1.volumeNext();
        t1.luminositaNext();
        
        System.out.printf("Lo schermo e' di %d pollici\n", t1.getPollici());
        System.out.printf("Ha un pannello %s\n", t1.getSchermo());
        System.out.printf("\nTi trovi sul canale %d\n", t1.getCanale());
        System.out.printf("Volume = %d\t", t1.getVolume());
        System.out.printf("Luminosita = %d\n", t1.getLuminosita());

        t1.canalePrev();
        t1.luminositaNext();
        t1.volumeNext();

        System.out.printf("\nTi trovi sul canale %d\n", t1.getCanale());
        System.out.printf("Volume = %d\t", t1.getVolume());
        System.out.printf("Luminosita = %d\n", t1.getLuminosita());

        t1.spegni();
    }
}