package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Veuillez choisir un nombre entre 1 et 10:");

		int nb = scanner.nextInt();

		while(0 >= nb || nb > 10) {
			System.err.println("NOMBRE INVALIDE! recommencer:");
			nb = scanner.nextInt();
		}

		System.out.println("BIEN JOUÉ!");

		scanner.close();
	}

}
