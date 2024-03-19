package actividad11;

public class Ejercicio2 {
	public static void listado(int[]tabla) {
		for (int i = 0; i <= tabla.length; i++) {
			int numero = (int)(Math.random()*(100-1+1)+1);
			System.out.println(numero);
		}
	}
	public static void main(String[] args) {
		int[]tabla = new int[100];
		listado(tabla);	
	}
}
