package fr.algorithmie;

public class RechercheMax {
	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		
		int max = array[0];

		for(int i = 0; i < array.length - 1; i++) {
			if(array[i] < array[i + 1] && max < array[i + 1]) {
				max = array[i + 1];
			}
		}
		
		System.out.println("Le max est " + max);
	}
}
