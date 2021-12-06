import java.util.Scanner;

public class ricursione_fattoriale
{
    public static int fact(int n)
    {
        if(n > 0)
        {
            return n * fact(n-1);
        }
        else
        {
            return 1;
        }
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n;
        
        System.out.print("Inserisci il valore di N: ");
        n=input.nextInt();
        System.out.printf("Il fattoriale di %d e': %d", n , fact(n));

        input.close();
    } 
}