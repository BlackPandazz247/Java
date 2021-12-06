import java.util.Scanner;

public class PotenzaMain{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        potenza num1;

        System.out.print("Inserisci un numero: ");
        num1 = new potenza(input.nextInt());
        
        num1.pow();
        num1.cambioBase();
        num1.pow();

        input.close();
    }
}