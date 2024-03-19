package actividad10;

public class Ejercicio3 {
	public static void modificar(int tabla[][], int n) {
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla.length; j++) {
				tabla[i][j] = n*tabla[i][j];
			} 
		}	
	}	
	public static void main(String[] args) {
		int tabla[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
		int n = 3;
		modificar(tabla, n);
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla.length; j++) {
				System.out.print(tabla[i][j]+"\t");
			} 
			System.out.println();
		}	
	}
}
