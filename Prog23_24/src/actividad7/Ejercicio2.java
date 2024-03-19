package actividad7;

public class Ejercicio2 {
	public static void average(double[]tabla) {
		double suma = 0; 
		 for (int i = 0; i < tabla.length; i++) {
	            suma += tabla[i];
	        }
		 System.out.print("\n");
		 double media = suma/tabla.length;
		 System.out.println("La media los elementos de la tabla es: "+media);
		 
	}   
	public static void main (String[] args) {
		double [] tabla = {8,2,3,4,5,6,7,8,9,10};
		for (int j = 0; j < tabla.length; j++) {
			System.out.println(tabla[j]);
        }
		average(tabla);
	}
}
