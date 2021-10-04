package fr.algorithmie;

public class AffichageSuite {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			System.out.print(i + 1 + " ");
		}
		System.out.println();
		for(int i = 0; i < 11; i = i + 2) {
			System.out.print(i + " ");
		}
		System.out.println();
		for(int i = 1; i < 10; i = i + 2) {
			System.out.print(i + " ");
		}
		System.out.println();
		int i = 1;
		while(i <= 10) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println();
		i = 0;
		while(i <= 10) {
			System.out.print(i + " ");
			i = i + 2;
		}
		System.out.println();
		i = 1;
		while(i < 10) {
			System.out.print(i + " ");
			i = i + 2;
		}
		System.out.println();
	}
}
