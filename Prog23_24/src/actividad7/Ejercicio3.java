package actividad7;

public class Ejercicio3 {
	public static boolean contains(String[]tabla, String cadena) {
		for (int j = 0; j < tabla.length; j++) {
			if (tabla[j].contains(cadena)){
				return true;
			} 
		}
		return false;
	}
	public static void main (String[] args) {
		String [] tabla = {"hola","que","tal","estas","hector"};
		String cadena = "hector";
		for (int j = 0; j < tabla.length; j++) {
			System.out.println(tabla[j]);
        }
		System.out.print("\n");
		if (contains(tabla,cadena)) {
			System.out.println("Alguno de los elementos de la tabla es igual al valor de la variable "+cadena);
		} else {
			System.out.println("Ninguno de los elementos de la tabla es igual al valor de la variable "+cadena);
		}

	}
}
