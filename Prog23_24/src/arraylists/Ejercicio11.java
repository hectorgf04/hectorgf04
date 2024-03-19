package arraylists;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio11 {
	public static void main(String[] argumentos) {
		ArrayList<String> colores = new ArrayList<String>();
		colores.add("Magenta");
		colores.add("Amarillo");
		colores.add("Cyan");
		colores.add("Rojo");
		colores.add("Verde");
		colores.add("Azul");
		Collections.sort(colores);
		for(int i = 0; i < colores.size(); i++) {
            System.out.println(colores.get(i));
        }
	}
}
