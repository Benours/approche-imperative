package fr.algorithmie;

public class FirstLast6 {
	public static void main(String[] args) {
//		int[] array = new int[0];     
//		int[] array = { 0, 2, 4, 6};  
//		int[] array = { 6, 5, 4};     
//		int[] array = { 6, 6};        
		int[] array = { 0, 6, 6, 0};

		boolean control = false;

		if(array.length > 0 && array[0] == 6 || array[array.length - 1] == 6) {
			control = true;
		}
		
		System.out.println("Le booléen de contrôle renvoie " + control);
	}
}
