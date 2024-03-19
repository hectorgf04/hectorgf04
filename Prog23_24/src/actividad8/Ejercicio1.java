package actividad8;

public class Ejercicio1 {
	public static void calcularModa(int[] tabla, int moda) {
		int rMaximas  = 0;
		for (int i = 0; i < tabla.length; i++) {
			int repeticiones = 0;
			for (int j = 0; j < tabla.length; j++) {
				if (tabla[i] == tabla[j]) {
					repeticiones++;
				}
				if (repeticiones > rMaximas) {
					rMaximas = repeticiones;
					moda = tabla[i];	
				}
			}
		}
		System.out.println("La moda es "+moda);
	}
	public static void main(String[] args) {
		int[] tabla = {2,2,2,2,44,7,12,1,65}; 
		int moda = 0;
		calcularModa(tabla, moda);
		
	}
}
