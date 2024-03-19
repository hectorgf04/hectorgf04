package repaso1;

import java.util.Scanner;

public class Final1 {
	public static void tabla(String serie) {
		String[] parte = serie.split(" ");
		for (int i = 0; i < parte.length - 1; i++) {
			if (parte[i].compareTo(parte[i + 1]) > 0) {
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
		System.out.print("Introduce dos strings para compararlos lexicograficamente: ");
		String serie = teclado.nextLine();
		tabla(serie);
	}
}