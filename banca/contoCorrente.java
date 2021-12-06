package banca;

public class contoCorrente{
    private int saldo;
    private int movimenti[] = new int[5];

    public void v(int n)
    {
        saldo += n;

        for(int i = 0; i < 4; i++)
            movimenti[i] = movimenti[i+1];

        movimenti[4] = n;
    }

    public void p(int n)
    {
        saldo -= n;

        for(int i = 0; i < 4; i++)
            movimenti[i] = movimenti[i+1];

        movimenti[4] = -n;
    }

    public int s() {return saldo;}

    public void l()
    {
        for(int i = 0; i < 5; i++)
            
        if(movimenti[i] != 0)
        {
            if(movimenti[i] > 0)
                System.out.println("versamento: +" + movimenti[i]);
            else 
                System.out.println("prelievo: " + movimenti[i]);
        }
    }
}