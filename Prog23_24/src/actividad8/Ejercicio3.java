package actividad8;

public class Ejercicio3 {
	public static void estadisticasTabla(int[] tabla) {
		int nPositivos = 0;
		int nNegativos = 0;
		int nCeros = 0;
		int nPares = 0; 
		int nImpares = 0;
		for (int j = 0; j < tabla.length; j++) {
			if(tabla[j] > 0) {
				nPositivos++;	
			} else if(tabla[j] < 0) {
				nNegativos++;	
			} else if(tabla[j] == 0) {
				nCeros++;
			} 
			if(tabla[j]%2==0) {
				nPares++;
			} else if(tabla[j]%2!=0) {
				nImpares++;
			}	
		}
		System.out.println("Estadisticas");
		System.out.println("============");
		System.out.println("El numero de enteros positivos es "+nPositivos);
		System.out.println("El numero de enteros negativos es "+nNegativos);
		System.out.println("El numero de ceros es "+nCeros);
		System.out.println("El numero de pares es "+nPares);
		System.out.println("El numero de impares es "+nImpares);
	}
	public static void main(String[] args) {
		int[] tabla = {0,2,3,0,5,6,7,-3,-2,-1}; 
		for (int i = 0; i < tabla.length; i++) {
			System.out.println(tabla[i]);
		}
		System.out.println("");
		estadisticasTabla(tabla);
	}
}
