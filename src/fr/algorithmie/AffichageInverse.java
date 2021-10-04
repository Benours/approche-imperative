package fr.algorithmie;

public class AffichageInverse {
	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		
		System.out.print("Array = [");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if(i < array.length - 1) {
				System.out.print(", ");
			}
		}
		
		System.out.println("];");
		
		System.out.print("InvArray = [");
		for(int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i]);
			if(i > 0) {
				System.out.print(", ");
			}
		}
		
		System.out.println("];");
		
		int[] arrayCopy = new int[array.length];
		
		for(int i = 0; i < array.length; i++) {
			arrayCopy[i] = array[i];
		}
		
		System.out.print("ArrayCopy = [");
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(arrayCopy[i]);
			if(i < arrayCopy.length - 1) {
				System.out.print(", ");
			}
		}
		
		System.out.println("];");
	}
}
