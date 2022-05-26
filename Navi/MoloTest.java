package Navi;
import java.util.*;

public class MoloTest{
	public static void main(String[] args){
		Barca molo[] = new Barca[15];
		Scanner input = new Scanner(System.in);
		int menu, posizione, tipo, cvNominali;
		double stazza, superficieVelica;
		String nomeBarca, nomeProprietario;

		do
		{
			System.out.print("1)Verifica posto libero\n2)Occupa posto barca\n3)Libera posto barca\n4)Verifica posto barca\n0)EXIT\n:");
			menu = input.nextInt();
			System.out.println();

			switch(menu)
			{
				case 1:
					System.out.print("Posti liberi: ");
					for(int i=0; i<15; i++)
					{
						if(molo[i] == null)
							System.out.print(" "+ (i+1));
					}
					System.out.println("\n");
				break;

				case 2:
					System.out.print("Che barca vuoi inserire?\n1)Barca a motore\n2)Barca a vela\n:");
					tipo = input.nextInt();
					if(tipo<1 || tipo>2)
					{
						System.out.println("Tipo non esistente");
						break;
					}
					
					System.out.print("Quale posto vuoi occupare ?: ");
					posizione = input.nextInt();
					posizione--;	
					if(molo[posizione] != null)
					{
						System.out.println("Posizione occupata\n");
						break;
					}
					
					if(tipo == 1)
					{
						System.out.print("Inserisci il nome della barca: ");
						input.nextLine(); nomeBarca = input.nextLine();
						System.out.print("Inserisci la stazza: ");
						stazza = input.nextDouble(); input.nextLine();
						System.out.print("Inserisci il nome del proprietario: ");
						nomeProprietario = input.nextLine();
						System.out.print("Inserisci i cavalli: ");
						cvNominali = input.nextInt(); input.nextLine();
						molo[posizione] = new BarcaMotore(nomeBarca, stazza, nomeProprietario, cvNominali);

						System.out.println();
					}
					else
					{
						System.out.print("Inserisci il nome della barca: ");
						input.nextLine(); nomeBarca = input.nextLine();
						System.out.print("Inserisci la stazza: ");
						stazza = input.nextDouble(); input.nextLine();
						System.out.print("Inserisci il nome del proprietario: ");
						nomeProprietario = input.nextLine();
						System.out.print("Inserisci la superficie della vela: ");
						superficieVelica = input.nextDouble(); input.nextLine();
						molo[posizione] = new BarcaVela(nomeBarca, stazza, nomeProprietario, superficieVelica);

						System.out.println();
					}
				break;

				case 3:
					System.out.println("Che posizione vuole liberare ?: ");
					posizione = input.nextInt();
					posizione--;

					if(molo[posizione] == null)
						System.out.println("Il posto era gia vuoto");

					molo[posizione] = null;
				break;

				case 4:
					System.out.print("Inserisci il nome della barca che vuoi cercare: ");
					input.nextLine(); nomeBarca = input.nextLine();

					try
					{
						for(int i=0; i<15; i++)
						{
							if(molo[i] != null)
							{
								if(molo[i].getNomeBarca().equalsIgnoreCase(nomeBarca))
								{
									System.out.println(molo[i]);
									System.out.println("Si trova nel posto "+ (i+1) +"\n");
								}
							}
						}
					}catch(NullPointerException exception){
					}
				break;
			}
		}while(menu != 0);
		input.close();
	}
}