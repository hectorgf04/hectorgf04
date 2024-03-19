package arraylists;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio7 {
	public static void main(String[] argumentos) {
		ArrayList<String> colores = new ArrayList<String>();
		colores.add("Magenta");
		colores.add("Amarillo");
		colores.add("Cyan");
		colores.add("Rojo");
		colores.add("Verde");
		colores.add("Azul");
		for(int i = colores.size()-1; i >= 0; i--) {
            System.out.println(colores.get(i));
        }
		//Preguntar si esta bien alguno de los dos
		//Collections.reverse(colores);
		//for(int j = 0; j < colores.size(); j++) {
			//System.out.println(colores.get(j));
		//}
	}
}
