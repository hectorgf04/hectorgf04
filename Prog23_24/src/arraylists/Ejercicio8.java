package arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] argumentos) {
		Scanner teclado = new Scanner( System.in);
		ArrayList<String> colores = new ArrayList<String>();
		colores.add("Magenta");
		colores.add("Amarillo");
		colores.add("Cyan");
		colores.add("Rojo");
		colores.add("Verde");
		colores.add("Azul");
		for(int i = 0; i < colores.size(); i++) {
            System.out.println(colores.get(i));
        }
		System.out.print("Escribe entre que posiciones quieres eliminar lo que hay dentro: ");
		int N = teclado.nextInt();
		int M = teclado.nextInt();
		for(int j = M; j >= N; j--) {
			colores.remove(j);
		}
		for(int i = 0; i < colores.size(); i++) {
            System.out.println(colores.get(i));
        }
	}
}
