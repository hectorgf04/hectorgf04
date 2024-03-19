package arraylists;

import java.util.ArrayList;

public class Ejercicio5 {
	public static void main(String[] argumentos) {
		ArrayList<String> colores = new ArrayList<String>();
		colores.add("Magenta");
		colores.add("Amarillo");
		colores.add("Cyan");
		colores.add("Rojo");
		colores.add("Verde");
		colores.add("Azul");
		for (int i = 0; i < colores.size(); i++) {
            System.out.println(colores.get(i));
        }
		System.out.println("");
		colores.remove(0);
		for (int i = 0; i < colores.size(); i++) {
            System.out.println(colores.get(i));
        }
	}
}
