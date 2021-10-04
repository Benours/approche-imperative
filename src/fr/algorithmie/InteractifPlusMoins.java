package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusMoins {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("** JEUX DU PLUS OU MOINS **\nVeuillez choisir un nombre entre 1 et 100:");

		int reponse = (int)(Math.random() * 100) + 1;
		int nb = scanner.nextInt();
		int tentative = 1;

		while(nb != reponse) {
			if (nb > reponse) {
				System.out.println("Trop grand!");
			}
			else {
				System.out.println("Trop petit!");
			}
			nb = scanner.nextInt();
			tentative++;
		}

		System.out.println("BIEN JOUÉ!");
		System.out.println(tentative + " tentative(s) effectué");

		scanner.close();
		
	}

}
