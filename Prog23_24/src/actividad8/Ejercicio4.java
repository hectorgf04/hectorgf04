package actividad8;

public class Ejercicio4 {
	public static void copiarTabla(String[] tabla) {
		String[] tabla2 = new String[tabla.length];
		for (int j = 0; j < tabla.length; j++) {
			tabla2[j] = tabla[j];
		}
		for(int i = tabla.length; i > 0; i--) {
			System.out.println(tabla2[i-1]);
		}
	}
	public static void main(String[] args) {
		String[] tabla = {"hola","como","estas","hector"}; 
		copiarTabla(tabla);
	}
}
