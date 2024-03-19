package actividad11;

public class Ejercicio1 {
	public static void mayorYmenor(double[] tabla) {
		for (int i = 0; i < tabla.length - 1; i++) {
			for (int j = i + 1; j < tabla.length; j++) {
				if (tabla[i] < tabla[j]) {
					double temp = tabla[i];
					tabla[i] = tabla[j];
					tabla[j] = temp;
				}
			}
		}
		for (int k = 0; k < tabla.length; k++) {
			System.out.println(tabla[k]);
		}	
		System.out.println("");
		System.out.println("El segundo elemento mayor es "+tabla[1]);
		System.out.println("El segundo elemento mayor es "+tabla[tabla.length-2]);
	}
	public static void main(String[] args) {
		double[] tabla = {0.0000000001,0.000000001,0.00000001,0.0000001,0.000001,0.00001,
		0.0001,0.001,0.01,0.1,1,10,100,1000,10000,100000,1000000,10000000,100000000,1000000000}; 
		mayorYmenor(tabla);	
	}
}
