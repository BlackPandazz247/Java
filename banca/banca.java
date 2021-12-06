package banca;
import java.util.Scanner;

public class banca{
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        char scelta;
        int n;
        contoCorrente conto = new contoCorrente();

        do{
            System.out.println("\nv-Versamento");
            System.out.println("p-Prelievo");
            System.out.println("l-Lista movimenti");
            System.out.println("s-Saldo");
            System.out.println("x-Exit");
            System.out.print(": ");
            scelta = input.next().charAt(0);

            switch(scelta)
            {
                case 'v':
                    System.out.print("somma da versare: ");           
                    n = input.nextInt();
                    conto.v(n);
                    break;

                case 'p':
                    System.out.print("somma da prelevare: ");           
                    n = input.nextInt();
                    conto.p(n);
                    break;
                    
                case 'l': conto.l(); break;
                case 's': System.out.println(conto.s()); break;
                case 'x': System.out.println("EXIT"); break;
                default: System.out.println("selezione non valida"); break;
            }
        }while(scelta != 'x');
        
        input.close();
    }
}