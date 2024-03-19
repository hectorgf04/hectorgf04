package actividad6;

import java.util.Scanner;

public class Ejercicio4 {
	public static void nEscalera() {
		int i = 7;
		int x = 1;
		int y = 2;
		while (i>0) {
			x = (x*10);
			int j = 1;
			System.out.print(x/10);
			x = x + y;
			y++;
			while(j<i) {
				System.out.print("*");
				j++;
			} i--;
		System.out.println();
		
		}	
	}
	public static void main (String[] args) {
		nEscalera();
	}
}
