package practica1;

import java.util.Scanner;

/**
 * Se debe desarrollar un programa en Java que interaccione con el usuario mostrando el
 * siguiente comportamiento: El programa informa al usuario del numero de billetes que
 * devolver ́a un cajero al retirar la cantidad de dinero especificada, que ser ́a siempre
 * positiva y múltiplo de 10. El cajero solo dispone de billetes de diez, veinte y de 
 * cincuenta euros, y siempre minimizará el numero de billetes a entregar.
 */
public class Ejercicio4 {
	
	/**
	 * Pre: ---
	 * PostEn el método principal, creamos un scanner, solicitamos que introduzca una cantidad
	 * de euros y lo almacena en "dinero". Con sus respectivas operaciones se sacaran las 
	 * variables "bCincuenta","bVeinte" y "bDiez" que se mostraran en su respectivo orden.
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner( System.in);
		System.out.print("Cantidad a retirar en euros [positiva y múltiplo de 10]: ");
		int dinero = teclado.nextInt();
		int bCincuenta = dinero/50;
		int bVeinte = dinero%50/20;
		int bDiez = ((dinero%50)%20)/10;
		System.out.println("Billetes    Euros");
		System.out.println("=================");
		System.out.println(bDiez+"         "+"10");
		System.out.println(bVeinte+"         "+"20");
		System.out.println(bCincuenta+"         "+"50");
	}
}