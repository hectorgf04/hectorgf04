	package actividad10;

public class Ejercicio4 {
	public static void tabla(int kilos[][],String frutas[],int precios[]) {
		int sumatorio = 0;
		for (int k = 0; k < frutas.length;k++) {
			System.out.print(frutas[k]);
			System.out.print("->");
			for (int i = 0; i < kilos[k].length; i++) {
				sumatorio += kilos[k][i];
            }
			System.out.print(sumatorio);
			System.out.print("kg x "+precios[k]+"€ = "+sumatorio*precios[k]+"€");
			System.out.println();
			sumatorio = 0;
		}	
	}	
	public static void main(String[] args) {
		int kilos[][] = {{5, 6, 9, 23, 7, 14, 0}, {16, 8, 4, 33, 15, 21, 2}};
		String frutas[] = {"Pera", "Manzana"};
		int precios[] = {6, 7};
		tabla(kilos, frutas, precios);
	}
}
