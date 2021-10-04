package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Veuillez choisir un nombre:");

		int nb = scanner.nextInt();
		
		System.out.print("Voici la sommes des nombres de 1 à " + nb + ": ");
		
		int sommes = 0;
		
		for(int i = 1; i <= nb; i++)
			sommes += i;
		
		System.out.println(sommes);

		scanner.close();
		
	}

}
