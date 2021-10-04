package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Veuillez choisir un nombre entre 1 et 10:");

		int nb = scanner.nextInt();

		while(0 >= nb || nb > 10) {
			System.err.println("NOMBRE INVALIDE! recommencer:");
			nb = scanner.nextInt();
		}

		System.out.println("Voici la table de multiplication de " + nb + ":");
		for(int i = 1; i <= 10; i++) {
			System.out.println(nb + " x " + i + " = " + nb * i);
		}

		scanner.close();

	}

}
