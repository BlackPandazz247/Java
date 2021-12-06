package geometria;

public class Triangolo{
    private Punto a, b, c;
    private final double error = 0.00000001;

    public Triangolo(Punto a, Punto b, Punto c) //costruttore
    {
        setA(a);
        setB(b);
        setC(c);
    }

    public Triangolo(Triangolo t)  //costruttore di copia
    {
        setA(t.getA());
        setB(t.getB());
        setC(t.getC());
    }

    public Triangolo() {} //costruttore vuoto

    public boolean isValid() //controllo se un ogetto è vuoto
    {
        return (a != null && b != null && c != null);
    }

    //getter/setter
    public void setA(Punto a) {this.a = new Punto(a);}
    public void setB(Punto b) {this.b = new Punto(b);}
    public void setC(Punto c) {this.c = new Punto(c);}
    public Punto getA() {return a;}
    public Punto getB() {return b;}
    public Punto getC() {return c;}

    public double area()
    {
        double p = perimetro() / 2;

        return Math.sqrt(p * (p - a.distanza(b)) * (p - b.distanza(c)) * (p - c.distanza(a)));
    }

    public double perimetro()
    {
        return a.distanza(b) + b.distanza(c) + c.distanza(a);
    }

    public String toString()
    {
        if(area() <= error)
            return "Non e' un triangolo";
        else 
            return "A: " + a.toString() + "\n\tB: " + b.toString() + "\n\tC: " + c.toString();
    }

    public boolean equals(Triangolo t)
    {
        return (a.equals(t.getA()) && b.equals(t.getB()) && c.equals(t.getC()));
    }

    public boolean equivale(Triangolo t)
    {
        return (this.area() == t.area()); 
    }
}