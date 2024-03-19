package arraylists;

import java.util.ArrayList;

public class Ejercicio6 {
	public static void main(String[] argumentos) {
		ArrayList<String> colores = new ArrayList<String>();
		colores.add("Magenta");
		colores.add("Amarillo");
		colores.add("Cyan");
		colores.add("Rojo");
		colores.add("Verde");
		colores.add("Azul");
		ArrayList<Integer> colores2 = (ArrayList<Integer>) colores.clone();
		for (int i = 0; i < colores2.size(); i++) {
            System.out.println(colores2.get(i));
        }
	}
}
