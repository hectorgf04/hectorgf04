package actividad8;

public class Ejercicio5 {
	public static void mayorYmenor(String[] arreglo) {
		for (int i = 0; i < arreglo.length - 1; i++) {
			for (int j = i + 1; j < arreglo.length; j++) {
				if (arreglo[i].length() < arreglo[j].length()) {
					String temp = arreglo[i];
					arreglo[i] = arreglo[j];
					arreglo[j] = temp;
				}
			}
		}
		for (int k = 0; k < arreglo.length; k++) {
			System.out.println(arreglo[k]);
		}	
	}
	public static void main(String[] args) {
		String[] arreglo = { "abcd", "abcde", "ab", "a" };
		mayorYmenor(arreglo);
	}
}
