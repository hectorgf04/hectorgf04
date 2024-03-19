package actividad1recursiva;

import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce un numero y te mostrara los numeros de fibonacci hasta esa posicion: ");
		int ene = teclado.nextInt();
		System.out.print("0,");
		System.out.print("1,");
		fibonacci(ene,0,0,1);
	}
	
	public static void fibonacci(int ene, int contador, int numero1, int numero2) {
		if (contador < ene) {
            int sumatorio = numero1 + numero2;
            System.out.print(sumatorio + ",");
            fibonacci(ene, contador + 1, numero2, sumatorio);
        }
		
	}
}
