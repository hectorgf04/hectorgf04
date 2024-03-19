package actividad7;

public class Ejercicio4 {
	public static int indexContains(String[] tabla, String cadena) {
		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i].equalsIgnoreCase(cadena)){
				return i;
			} 
		} return -1;
	}
	public static void main (String[] args) {
		String [] tabla = {"hola","que","tal","estas","hector"};
		String cadena = "tal";
		for (int j = 0; j < tabla.length; j++) {
			System.out.println(tabla[j]);
		}
		System.out.print("\n");
		System.out.println(indexContains(tabla,cadena));
	}
}
