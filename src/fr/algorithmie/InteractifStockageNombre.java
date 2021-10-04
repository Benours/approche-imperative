package fr.algorithmie;

import java.util.Scanner;
import java.util.Arrays;

public class InteractifStockageNombre {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int[] array = new int[1];

		int nb = 0;
		int index = 0;

		while(nb != 3) {
			System.out.println("Veuillez choisir une option entre :\n"
					+ "1 - Ajouter un nombre au tableau\n"
					+ "2 - Voir le tableau\n"
					+ "3 - Fin");
			
			nb = scanner.nextInt();
			
			if(nb > 3 || nb < 1) {
				System.err.println("Veuillez choisir une option correct!");
			}
			else if(nb == 2) {
				System.out.print("Tableau = [");
				for(int i = 0; i < array.length - 1; i++) {
					System.out.print(array[i]);
					if(i < array.length - 2)
						System.out.print(", ");
				}
				System.out.println("]");
			}
			else if(nb == 1) {
				if(index == array.length - 1) {
					array = Arrays.copyOf(array, array.length + 1);
				}
				System.out.println("Quel chiffre souhaiter vous ajouter?");
				int ajout = scanner.nextInt();
				array[index] = ajout;
				index++;
			}
			

		}

		scanner.close();


	}

}
