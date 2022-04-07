package Gerarchia;

public class Main{
    public static void main(String[] args){
        Carrello carrello = new Carrello();

        Abbigliamento abbigliamento1 = new Abbigliamento("PU01", 50.00, 'M', "XL", "pantaloni");
        Abbigliamento abbigliamento2 = new Abbigliamento("CD22", 35.00, 'f', "Xs", "Camicia");
        Abbigliamento abbigliamento3 = new Abbigliamento("GD46", 29.00, 'F', "s", "giacca");
        Freschi freschi1 = new Freschi("OR044", 1.50, "Peperoni", 1.4, 170, true);
        Freschi freschi2 = new Freschi("FR012", 1.90, "mele", 0.5, 730, false);
        Conservati conservati = new Conservati("BSOO3", 2.00, "biscotti", 0.37, 1200, "Porco di dio");

        carrello.inserisciProdotto(abbigliamento1);
        carrello.inserisciProdotto(abbigliamento2);
        carrello.inserisciProdotto(abbigliamento3);
        carrello.inserisciProdotto(freschi1);
        carrello.inserisciProdotto(freschi2);
        carrello.inserisciProdotto(conservati);

        Merce prodotti[] = carrello.esportaContenuto();
        for(int i=0; i<prodotti.length; i++)
            System.out.println(prodotti[i]);

        System.out.println("Spesa totale: "+ carrello.calcolaPrezzoTotale());
        System.out.println("Calorie totali: "+ carrello.calcolaCalorieTotali());
    }
}