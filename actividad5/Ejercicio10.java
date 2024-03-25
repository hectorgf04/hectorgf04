package actividad5;

import java.util.Scanner;

public class Ejercicio10 {
	public static void cifras(int i) {
		int sumaCifras = 0;
		int resto = 0;
		int n = i;
		while (i>0) {
			resto = i % 10;
			i = i/10;
			sumaCifras = sumaCifras + resto;
		}
		System.out.println("La suma de todas las cifras es "+sumaCifras);
		//Preguntar si podemos separar las cifras 
		int contador = 0;
		while (n > 0) {
			n = n / 10;
			contador++;	
	    }
		System.out.println(contador);
	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca un entero: ");
		int i = teclado.nextInt();
		cifras(i);
	}
}