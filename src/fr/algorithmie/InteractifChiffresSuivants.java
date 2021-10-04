package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Veuillez choisir un nombre:");

		int nb = scanner.nextInt();
		
		System.out.println("Voici les 10 nombres suivants:");
		
		for(int i = 1; i <= 10; i++)
			System.out.print(nb + i + " ");

		scanner.close();
	}

}
