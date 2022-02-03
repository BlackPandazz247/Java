package geometria;
import java.util.Scanner;

public class geometriaMain{
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
            double x, y, lato;
            Punto p1, p2, p3;
            Triangolo[] t = new Triangolo[2]; 
            Triangolo t3 = new Triangolo();
            Quadrato q;
            int i, menu;

            for(i=0; i<2 ; i++)
            {
                System.out.println("Inserisci i valori del " + (i+1) + " triangolo: ");
                System.out.print("\tInserisci la x del primo punto: ");
                x = input.nextDouble();
                System.out.print("\tInserisci la y del primo punto: ");
                y = input.nextDouble();
                p1 = new Punto(x, y);
                System.out.print("\n\tInserisci la x del secondo punto: ");
                x = input.nextDouble();
                System.out.print("\tInserisci la y del secondo punto: ");
                y = input.nextDouble();
                p2 = new Punto(x, y);
                System.out.print("\n\tInserisci la x del terzo punto: ");
                x = input.nextDouble();
                System.out.print("\tInserisci la y del terzo punto: ");
                y = input.nextDouble();
                System.out.println();
                p3 = new Punto(x, y);
                t[i] = new Triangolo(p1, p2, p3);
            }

            do
            {
                System.out.println("1)Copia un triangolo\n2)Stampa le informazioni del triangolo\n3)sovrascrivi un triangolo\n4)Confronta i triangoli\n0)EXIT");
                System.out.print(": ");
                menu = input.nextInt();

                switch(menu)
                {
                    case 1:  //copy
                        System.out.print("Quale triangolo vuoi copiare? (1/2): ");
                        i = input.nextInt();
                        System.out.println();
                        
                        t3 = new Triangolo(t[i-1]);
                        break;

                    case 2:  //print
                        for(i=0; i<2 ; i++)
                        {
                            System.out.println("Triangolo " + (i+1) + "*: "); System.out.println("\t" + t[i]); //stampo i punti
                            System.out.print("\tArea: "); System.out.printf("%.3f\n", t[i].area());  //stampo l'area
                            System.out.print("\tPerimetro: "); System.out.printf("%.3f\n\n", t[i].perimetro()); //stampo il perimetro
                        }    

                        if(t3.isValid() == true)
                        {
                            System.out.println("Triangolo 3*: "); System.out.println("\t" + t3);
                            System.out.print("\tArea: "); System.out.printf("%.3f\n", t3.area());  
                            System.out.print("\tPerimetro : "); System.out.printf("%.3f\n", t3.perimetro()); 
                        }
                        break;

                    case 3:  //cambio dei valori di un triangolo
                        System.out.print("Quale triangolo vuoi cambiare ? (1/2): ");
                        i = input.nextInt();

                        System.out.println("Inserisci i valori del " + i + "* triangolo: ");
                        System.out.print("\tInserisci la x del primo punto: ");
                        x = input.nextDouble();
                        System.out.print("\tInserisci la y del primo punto: ");
                        y = input.nextDouble();
                        p1 = new Punto(x, y);
                        System.out.print("\n\tInserisci la x del secondo punto: ");
                        x = input.nextDouble();
                        System.out.print("\tInserisci la y del secondo punto: ");
                        y = input.nextDouble();
                        p2 = new Punto(x, y);
                        System.out.print("\n\tInserisci la x del terzo punto: ");
                        x = input.nextDouble();
                        System.out.print("\tInserisci la y del terzo punto: ");
                        y = input.nextDouble();
                        System.out.println();
                        p3 = new Punto(x, y);
                        t[i-1] = new Triangolo(p1, p2, p3);
                        break;

                    case 4:
                        if(t[0].equals(t[1]) == true)  //check se i triangoli 1 e 2 hanno punti e area uguale
                        {  
                            System.out.println("I triangoli 1 e 2 sono uguali");
                        }else{                                                      //1 e 2 uguali punti
                            System.out.println("I triangoli 1 e 2 NON sono uguali");
                        }

                        if(t[0].equivale(t[1]) == true)
                        {
                            System.out.println("I triangoli 1 e 2 hanno la stessa area");
                        }else{                                                      //1 e 2 ugale area
                            System.out.println("I triangoli 1 e 2 NON hanno la stessa area");
                        }

                        //check se i triangoli 1 e 2 hanno punti e area uguale al terzo triangolo, in caso esiste
                        if(t3.isValid() == true)
                        {
                            if(t[0].equals(t3) == true)  
                            {  
                                System.out.println("\nI triangoli 1 e 3 sono uguali");
                            }else{                                                  //1 e 3 uguali punti
                                System.out.println("\nI triangoli 1 e 3 NON sono uguali");
                            }
                            if(t[0].equivale(t3) == true)  
                            {  
                                System.out.println("I triangoli 1 e 3 hanno la stessa area");
                            }else{                                                  //1 e 3 uguale area
                                System.out.println("I triangoli 1 e 3 NON hanno la stessa area");
                            }

                            if(t[1].equals(t3) == true)
                            {
                                System.out.println("\nI triangoli 2 e 3 sono uguali");
                            }else{                                                  //2 e 3 uguali punti
                                System.out.println("\nI triangoli 2 e 3 NON sono uguali");
                            }
                            if(t[1].equivale(t3) == true)
                            {
                                System.out.println("I triangoli 2 e 3 hanno la stessa area\n");
                            }else{                                                  //2 e 3 uguale area
                                System.out.println("I triangoli 2 e 3 NON hanno la stessa area\n");
                            }
                        }
                        break;
                        
                    case 0:
                        System.out.println("--EXIT--");
                        break;

                    default:
                        System.out.println("!!!SCELTA INVALIDA!!!\n");
                        break;
                }
            }while(menu != 0);

            System.out.println("\nInserisci il punto in alto a destra del tuo quadrato: ");
            System.out.print("\tInserisci x: "); x = input.nextDouble();
            System.out.print("\tInserisci y: "); y = input.nextDouble();
            System.out.print("\tInserisci la lunghezza dei lati: "); lato = input.nextDouble();
            
            p1 = new Punto(x , y);
            q = new Quadrato(p1 , lato);
            System.out.println(q);

            q.shiftX(2);
            System.out.println(q);
            q.shiftX(-2);
            q.shiftY(2);
            System.out.println(q);
 
            input.close();
        }
    }
}