package fr.algorithmie;

import java.util.Scanner;

public class Interactif21Batons {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int batons = 21;
		int nb = 0;
		boolean gagne = false;

		while(batons > 0) {
			System.out.println("Tour du joueur :");
			System.out.println("Il y a " + batons + " baton(s).\n"
					+ "Combien souhaitez-vous en enlever ?\n"
					+ "(1, 2 ou 3)");

			nb = scanner.nextInt();

			int ia = nb;

			while(nb < 1 || nb > 3) {
				System.err.println("Veuillez choisir un nombre différent!");
				nb = scanner.nextInt();
			}
			
			batons -= nb;

			if(batons > 2) {
				ia = (int)(Math.random() * 3) + 1;

				System.out.println("Tour de l'IA:\n"
						+ "L'IA a retiré " + ia + " baton(s).");
				batons -= ia;
			}
			else if (batons > 1) {
				ia = 1;
				batons -= ia;
			}
			if(batons <= 0) {
				gagne = true;
			}
		}

		if(gagne) {
			System.out.println("L'humain a gagné!");
		}
		else {
			System.out.println("L'humain a perdu!");
		}

		scanner.close();


	}

}
