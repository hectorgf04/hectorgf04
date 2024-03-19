package arraylists;

import java.util.ArrayList;

public class Ejercicio3 {
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
		System.out.print("El color seleccionado se encuentra en la posición: ");
		System.out.println(colores.indexOf("Cyan"));
	}
}
