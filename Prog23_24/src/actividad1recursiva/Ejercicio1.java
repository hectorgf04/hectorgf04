package actividad1recursiva;

import java.util.Scanner;

/**
 *Implementa un programa Java que sume los números naturales hasta N (introducido por el usuario) 
 *de forma recursiva..
 */
public class Ejercicio1 {
	public static void main(String[]args) {
		Scanner teclado = new Scanner( System.in);
		System.out.print("Introduce N y se sumara los numeros naturales hasta N: ");
		int ene = teclado.nextInt();
		System.out.println("La suma sera" + sumatorio(ene));
	}
	
	public static int sumatorio(int ene) {
		if (ene == 0) return 0;
		else return ene + (sumatorio(ene - 1));
	}
}
