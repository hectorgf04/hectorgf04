package actividad1recursiva;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[]args) {
		int[] tabla = {1,2,3,4};
		int i = 0;
		tablaRecursiva(tabla,i);
	}
	
	public static void tablaRecursiva(int[]tabla, int i) {
		if (i != tabla.length) {
			System.out.println(tabla[i]);
			tablaRecursiva(tabla,i+1);
		}
		
	}
}
