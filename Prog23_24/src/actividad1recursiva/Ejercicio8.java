package actividad1recursiva;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce un numero y se sumaran sus cifras: ");
		double ene = teclado.nextInt();
		sumatorioCifras(ene,0);
	}

	public static void sumatorioCifras(double ene, int sumatorio) {
		if(ene / 10 != 0) {
			ene = ene / 10;
			String numeros = String.valueOf(ene);
			String[] numeroSeparado = numeros.split("\\.");
			int numero = Integer.parseInt(numeroSeparado[1]);
			double restoNumero = Double.parseDouble(numeroSeparado[0]);
			sumatorioCifras(restoNumero, sumatorio+numero);
		} else {
			System.out.println(sumatorio);	
		}
	}
}	
