package practica1;

import java.util.Scanner;

/**
 *Se debe desarrollar un programa en Java que, dada una edad, muestre por pantalla el 
 *mensaje’¡Eres mayor de edad!’ s ́ı y solo s ́ı la edad introducida es mayor o igual a 
 *18. En cualquier otro caso,se deberá mostrar el mensaje ’¡Ohhh eres menor de edad...!’.
 */
public class Ejercicio1 {
	
	/**
	 * Pre: ---
	 * Post: En el método principal, creamos un scanner, solicitamos que introduzca su 
	 * edad, se lee esta edad  y se almacena en la variable "edad", se comparara la edad 
	 * ingresada con 18 y mostrara. Si la edad es 18 o más, imprime un mensaje y si la
	 * edad es menor que 18, imprime otro mensaje. 
	 */
	public static void main(String[]args) {
		Scanner teclado = new Scanner( System.in);
		System.out.print("Introduce tu edad: ");
		int edad = teclado.nextInt();
		if(edad >= 18) {
			System.out.println("¡Eres mayor de edad!");
		} else {
			System.out.println("¡Ohhh eres menor de edad...!");
		}
	}
}