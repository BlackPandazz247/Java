import java.util.Scanner;

public class tassa{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double importo;
        double tassa;
        char scelta;
        
        do
        {
            do
            {
                System.out.print("Inserisci l'importo da tassare: ");
                importo = input.nextInt();

                if(importo <= 0)
                    System.out.println("Importo non valido!\n");

            }while(importo <= 0);

            if(importo <= 10000)
                tassa = importo*10 / 100;
            
            else if(importo <= 20000)
            tassa = 1000 + (importo - 10000)*7 /100;
            
            else if(importo <= 30000)
                tassa = 1700 + (importo - 20000)*5 / 100;

            else
                tassa = 2200 + (importo - 30000)*3 / 100; 
            
            System.out.println("La tassa su " + importo + "$ e' di " + tassa + "$");

            System.out.print("Vuoi inserire un altro valore ? (y / n): ");
            input.nextLine(); scelta = input.next().charAt(0); System.out.println();
        }while(scelta != 'n');

        input.close();
    }
}