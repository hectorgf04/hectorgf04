package actividad11;

public class Ejercicio3 {
	public static void listado(int[]tabla1,int[]tabla2) {
		boolean iguales = true;
		if (tabla1.length == tabla2.length) {
			for (int i = 0; i < tabla1.length; i++) {
				if (tabla1[i] != tabla2[i]) {
					iguales = false;
					break;
				} 
			}
			if (iguales) {
				System.out.println("Son exactamente iguales");
			} else {
				System.out.println("No son exactamente iguales");
			}
		} else {
			System.out.println("No tienen la misma longitud, por lo tanto no son iguales");
		}
	}
	public static void main(String[] args) {
		int[]tabla1 = {1,2,1};
		int[]tabla2 = {1,2,1};
		listado(tabla1,tabla2);
	}
}
