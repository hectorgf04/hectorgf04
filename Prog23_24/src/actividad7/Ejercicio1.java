package actividad7;

public class Ejercicio1 {
	public static void sum(int [] tabla) {
		int suma = 0; 
		 for (int i = 0; i < tabla.length; i++) {
	            suma += tabla[i];
	        }
		 System.out.print("\n");
		 System.out.println("La suma de todos los elementos de la tabla es: "+suma);
		 
	}
	public static void main (String[] args) {
		int [] tabla = {1,2,3,4,5,6,7,8,9,10};
		for (int j = 0; j < tabla.length; j++) {
			System.out.println(tabla[j]);
        }
		sum(tabla);
	}
}
