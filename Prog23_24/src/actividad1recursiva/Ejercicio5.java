package actividad1recursiva;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[]args) {
		int[][] tabla = {{1,2,3,4},{5,6,7,8}};
		tablaRecursiva(tabla,0,0);
	}
	
	public static void tablaRecursiva(int[][]tabla, int i, int j) {
		if (i != tabla.length) {
			if(j != tabla[i].length) {
				System.out.println(tabla[i][j]);
				tablaRecursiva(tabla,i,j+1);
			} else {
				tablaRecursiva(tabla,i+1,0);
			}
		}
		
	}
}
