package repaso1;

import java.util.Scanner;

public class Ejercicio1 {
	public static void tabla(String serie) {
		String[] parte = serie.split(",");
		for (int i = 0; i < parte.length - 1; i++) {
			for (int j = 0; j < parte.length - i - 1; j++) {
				if (parte[j].compareTo(parte[j + 1]) > 0) {
                    String temp = parte[j];
                    parte[j] = parte[j + 1];
                    parte[j + 1] = temp;
                }
			}
		}	
		for (int k = 0; k < parte.length; k++) {
			System.out.println(parte[k]);
		}
	}	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce una serie de nombres separados por comas: ");
		String serie = teclado.nextLine();
		tabla(serie);
	}
}
