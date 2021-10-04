package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonnaci {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Veuillez choisir un rang:");
		
		int nb = scanner.nextInt();
		int stockage1 = 0;
		int stockage2 = 1;
		int resultat = 0;
		
		if(nb == 0) {
			resultat = 0;
		}
		if(nb == 1) {
			resultat = 1;
		}
		else {
			for(int i = 1; i < nb; i++) {
				resultat = stockage1 + stockage2;
				stockage1 = stockage2;
				stockage2 = resultat;
			}
		}
		
		System.out.println(resultat);
		scanner.close();
		
	}

}
