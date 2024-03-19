package actividad10;

import java.util.Arrays;

public class Ejercicio5 {
	public static void tabla(String nombres[]) {
		Arrays.sort(nombres);
		for (int k = 0; k < nombres.length;k++) {
			System.out.println(nombres[k]);
		}	
	}	
	public static void main(String[] args) {
		String nombres[] = {"Pepe", "Juan", "María", "Antonio", "Luisa"};
		tabla(nombres);
	}
}
