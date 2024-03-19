package actividad8;

public class Ejercicio2 {
	public static void incrementarValores(int[] tabla, int valor) {
		int[] tabla2 = new int[tabla.length];
		for (int j = 0; j < 1; j++) {
			System.out.println(tabla[j]);
		}
		for (int i = 1; i < tabla.length-1; i++) {
			tabla2[i] = tabla[i]*valor;
			System.out.println(tabla2[i]);
		}
		for (int k = tabla.length - 1; k < tabla.length; k++) {
			System.out.println(tabla[k]);
		}
	}
	public static void main(String[] args) {
		int[] tabla = {20,1,2,3,4,5,100}; 
		int valor = 2;
		incrementarValores(tabla, valor);
	}
}
