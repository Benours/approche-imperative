package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Veuillez saisir 10 chiffres:\n(touche entrée pour valider un chiffre)");
		
		int nb;
		int max = 0;

		for(int i = 0; i < 10; i++) {
			nb  = scanner.nextInt();
			if (nb > max) {
				max = nb;
			}
		}
		
		System.out.println("Le chiffre le plus grand que vous ayez saisi est " + max);

		scanner.close();
		
	}

}
