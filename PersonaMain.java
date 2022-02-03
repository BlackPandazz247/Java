import java.util.Scanner;

public class PersonaMain{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int eta;
        String sesso, professione, nome;

        System.out.print("Inserisci il tuo nome completo: ");
        nome = input.nextLine();
        System.out.print("Inserisci la tua professione: ");
        professione = input.nextLine();
        System.out.print("Inserisci il tuo sesso: ");
        sesso = input.nextLine();
        System.out.print("Inserisci la tua età: ");
        eta = input.nextInt();

        Persona p1 = new Persona(eta, nome, sesso, professione);
        Persona p2 = new Persona(p1);

        System.out.println("\nPersona 1:");
        System.out.println(p1.toString());
        System.out.println("\nPersona 2:");
        System.out.println(p2.toString());
        

        input.close();
    }
}