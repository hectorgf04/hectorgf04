package actividad1;

import java.util.Scanner;

public class Ejercicio4 {
	
	public static void main(String[] argumentos){
		Scanner teclado = new Scanner( System.in);
		
		int x = 0;
		int y = 0;
		int suma;
		
		System.out.println("Introduce valor para x");
		x = teclado.nextInt();
		System.out.println("Introduce valor para y");
		y = teclado.nextInt();
		
		suma = x + y;
		
		System.out.println("La suma de los valores x e y es "+suma);
			
		}
		
	}

