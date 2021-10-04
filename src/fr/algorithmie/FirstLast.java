package fr.algorithmie;

public class FirstLast {

	public static void main(String[] args) {
//		int[] array = new int[0];
//		int[] array = { 6, 6};
		int[] array = { 0, 6, 6, 1};

		boolean control = false;

		if(array.length >= 1 && array[0] ==  array[array.length - 1]) {
			control = true;
		}
		
		System.out.println("Le booléen de contrôle renvoie " + control);
	}

}
