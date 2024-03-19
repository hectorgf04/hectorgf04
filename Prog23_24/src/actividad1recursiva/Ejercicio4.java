package actividad1recursiva;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[]args) {
		Scanner teclado = new Scanner( System.in);
		System.out.print("Introduce N para mirar si esta dentro de la tabla: ");
		int ene = teclado.nextInt();
		int[] tabla = {1,2,3,4};
		System.out.println(tablaRecursiva(tabla,0,ene));
	}
	
	public static boolean tablaRecursiva(int[]tabla, int i, int ene) {
		if (i != tabla.length) {
			if(ene == tabla[i]) {
				return true;
			}
			return tablaRecursiva(tabla,i+1,ene);
		}
		return false;
	}
}
