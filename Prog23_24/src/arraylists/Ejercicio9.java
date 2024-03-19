package arraylists;

import java.util.ArrayList;


public class Ejercicio9 {
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
		if (colores.equals(colores2) != false) {
		      System.out.println("Son iguales");
		    } else {
		      System.out.println("No so iguales");
		    }
	}
}
