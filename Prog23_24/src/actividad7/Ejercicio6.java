package actividad7;

public class Ejercicio6 {
	public static void insertElement(int[] tabla, int num, int index) {
		int[] tabla2 = new int[tabla.length];
		for (int i = 0; i < tabla.length; i++) {
			tabla2[i] = tabla[i];
		}
		tabla[index] = num;
		for (int j = 0; j <= index; j++) {
			System.out.println(tabla[j]);
		}
		for (int i = index; i < tabla.length - 1; i++) {
			System.out.println(tabla2[i]);
		}
	}

	public static void main(String[] args) {
		int[] tabla = { 200, 214, 29, 43, 1007 };
		int num = 2;
		int index = 3;
		insertElement(tabla, num, index);
	}
}
