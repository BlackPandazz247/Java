import java.util.Scanner;

public class potenza{
    private int num;

    public potenza(int base){
        num = base;
    }

    public void pow()
    {
        System.out.printf("La potenza del numero %d e' %d\n", num, (num * num));
    }

    public void cambioBase()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("\nInserisci un nuovo numero: ");
        num = input.nextInt();

        input.close();
    }
}