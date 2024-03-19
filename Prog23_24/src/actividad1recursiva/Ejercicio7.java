package actividad1recursiva;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce un numero y se invertira: ");
		double ene = teclado.nextInt();
		invertir(ene);
	}

	public static void invertir(double ene) {
		if(ene / 10 != 0) {
			ene = ene / 10;
			String numeros = String.valueOf(ene);
			String[] numeroSeparado = numeros.split("\\.");
			int numero = Integer.parseInt(numeroSeparado[1]);
			double restoNumero = Double.parseDouble(numeroSeparado[0]);
			System.out.print(numero);
			invertir(restoNumero);
		}
		
	}
}
