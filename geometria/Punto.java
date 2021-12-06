package geometria;

public class Punto{
    private double x, y;

    public Punto(double x, double y) //costruttore
    {
        setX(x);
        setY(y);
    }

    public Punto(Punto p) //costruttore di copia
    {
        setX(p.getX());
        setY(p.getY());
    }

    public void setX(double x) {this.x = x;} //getter/setter
    public void setY(double y) {this.y = y;}
    public double getX() {return x;}
    public double getY() {return y;}

    public boolean equals(Punto p) //controlla se due punti sono uguali
    {
        return (p.x == x && p.y == y);
    }

    public double distanza(Punto p)   //distanza tra due punti
    {
        return Math.sqrt(Math.pow((x-p.getX()), 2) + Math.pow((y-p.getY()), 2));
    }

    public String toString()
    {
        return "(" + x + " ; " + y + ")";
    }
}