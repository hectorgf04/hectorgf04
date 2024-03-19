package arraylists;

import java.util.ArrayList;

public class Ejercicio10 {
	public static void main(String[] argumentos) {
		ArrayList<String> colores = new ArrayList<String>();
		colores.add("Magenta");
		colores.add("Amarillo");
		colores.add("Cyan");
		colores.add("Rojo");
		colores.add("Verde");
		colores.add("Azul");
		ArrayList<String> colores2 = new ArrayList<String>();
		colores2.add("Magenta");
		colores2.add("Amarillo");
		colores2.add("Cyan");
		colores2.add("Rojo");
		colores2.add("Verde");
		colores2.add("Azul");
		ArrayList<String> unionColores = new ArrayList<String>();
		unionColores.addAll(colores);
		unionColores.addAll(colores2);
		for(int i = 0; i < unionColores.size(); i++) {
            System.out.println(unionColores.get(i));
        }
	}
}
