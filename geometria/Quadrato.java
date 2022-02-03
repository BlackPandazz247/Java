package geometria;

public class Quadrato{
    //attributi
    private Punto p1; //angolo alto destro
    private Punto p2; //angolo alto sinistro
    private Punto p3; //angolo basso sinistro
    private Punto p4; //angolo basso destro
    private double lato;

    //costruttore
    public Quadrato(Punto p1, double lato)
    {
        setP1(p1);
        setLato(lato);
        setP2();
        setP3();
        setP4();
    }

    //costruttore di copia
    public Quadrato(Quadrato a)
    {
        p1 = new Punto(a.getP1());
        p2 = new Punto(a.getP2());
        p3 = new Punto(a.getP3());
        p4 = new Punto(a.getP4());
        lato = a.getLato();
    }

    //set
    public void setP1(Punto p1) {this.p1 = new Punto(p1);}
    private void setP2() { p2 = new Punto( (p1.getX() - lato) , p1.getY() ) ;}
    private void setP3() { p3 = new Punto( p2.getX() , (p2.getY() - lato) ) ;}
    private void setP4() { p4 = new Punto( p1.getX() , p3.getY() ) ;}
    public void setLato(double lato) {this.lato = lato;}
    //get
    public Punto getP1() {return p1;}
    public Punto getP2() {return p2;}
    public Punto getP3() {return p3;}
    public Punto getP4() {return p4;}
    public double getLato() {return lato;}

    //toString
    public String toString()
    {
        return "\nP2: "+ p2 +"\tP1: "+ p1 +"\nP3: "+ p3 +"\tP4: "+ p4;
    }

    //metodo che sposta di un valore dato in input la x
    public void shiftX(double spostamento)
    {
        p1.setX( p1.getX() + spostamento );
        setP2();
        setP3();
        setP4();
    }
    //metodo che sposta di un valore dato in input la y
    public void shiftY(double spostamento)
    {
        p1.setY( p1.getY() + spostamento );
        setP2();
        setP3();
        setP4();
    }
} 