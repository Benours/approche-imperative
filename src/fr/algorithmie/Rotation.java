package fr.algorithmie;

public class Rotation {

	public static void main(String[] args) {
		int[] array = { 0, 1, 2, 3};

		System.out.print("Array = [");

		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if(i < array.length - 1) {
				System.out.print(", ");
			}
		}

		System.out.println("];");

		int echange = array[array.length - 1];

		for(int i = array.length - 1; i > 0; i--) {
			array[i] = array[i - 1];
		}
		array[0] = echange;

		System.out.print("Rotation = [");

		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if(i < array.length - 1) {
				System.out.print(", ");
			}
		}

		System.out.println("];");
	}
}
