package arraylists;

import java.util.ArrayList;

public class Ejercicio2 {
	public static void main(String[] argumentos) {
		ArrayList<String> colores = new ArrayList<String>();
		colores.add(0,"Magenta");
		
		for (int i = 0; i < colores.size(); i++) {
            System.out.println(colores.get(i));
        }
	}
}
