package tarea2;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main (String[] argumentos) {
		Scanner teclado = new Scanner( System.in);
		System.out.println("Introduce 10 números enteros");
		int i = 0;
		int minimo = 0;
		int maximo = 0;
		while (i < 10) {
			int numero = teclado.nextInt();
			if (i==0) {
				maximo=numero; 
				minimo=numero;
			}
			if (numero<minimo) {
				minimo=numero;
			}
			else if (numero>maximo){
				maximo=numero;
			} 
			i++;
		}
		System.out.println("El numero mayor es "+maximo);
		System.out.println("El numero menor es "+minimo);
	}
}
