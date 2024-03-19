package actividad1recursiva;

public class Ejercicio9 {
	public static void main(String[] args) {
		int tabla[][] = { {1, 2, 1} , {3, 1, 1}, {1, 1, 1} };
		sumatorioMatriz(tabla,0,0,0);
	}
	
	public static void sumatorioMatriz(int[][]tabla, int sumatorio, int i, int j) {
		if (i != tabla.length) {
			if(j != tabla[i].length) {
				sumatorioMatriz(tabla,sumatorio+tabla[i][j],i,j+1);
			} else {
				sumatorioMatriz(tabla,sumatorio,i+1,0);
			}
		} else {
			System.out.println(sumatorio);
		}
	}
}
