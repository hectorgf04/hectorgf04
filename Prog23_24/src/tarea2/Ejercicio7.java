package tarea2;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main (String[] argumentos) {
		Scanner teclado = new Scanner( System.in);
		System.out.println("Introduce un numero entero");
		int x = teclado.nextInt();
		int y = 0; 
		System.out.println("La tabla de multiplicar del numero "+x+" es:");
		while(x >=0 ) {
			while (y <=10) {
				int producto = x*y;
				System.out.println(producto);
				y++;
			}
			
		}
			x++;
	}
}

