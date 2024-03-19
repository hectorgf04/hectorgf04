package actividad6;

import java.util.Scanner;

public class EjercicioPersonal {
	public static void nLetra() {
		int x = 1;
		int y = 0;
		for (int i = 7; i > 0; i--) {
			y=y+1;
			for(int j = 0; j<y ; j++) {
				System.out.print("*");
			} 
		System.out.println();
		}	
	}
	public static void main (String[] args) {
		nLetra();
	}
}