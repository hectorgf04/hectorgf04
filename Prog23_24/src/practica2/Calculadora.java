package practica2;

import java.util.Scanner;

public class Calculadora {
	
	/**
	 * Pre: ---
	 * Post: En este metodo principal, empezamos con un bucle que muestra el menú de operaciones
	 * de la calculadora y espera que el usuario elija y se almacene en x. Luego dependiendo de
	 * que elija el usuario tenemos las 10 opciones metidas dentro de if, dentro de cada una tenemos
	 * el escaner de las variables que precisa la operacion y despues tenemos la llamada al metodo 
	 * que ira a operaciones a realizarla.
	 */
	public static void main(String[] args){
		while (true) {
			Scanner teclado = new Scanner( System.in);
			System.out.println("MENÚ DE OPERACIONES");
			System.out.println("===================");
			System.out.println("0 - Finalizar");
			System.out.println("1 - Sumar dos enteros");
			System.out.println("2 - Restar dos enteros");
			System.out.println("3 - Multiplicar dos enteros");
			System.out.println("4 - Dividir dos enteros");
			System.out.println("5 - Calcular el resto de dos enteros");
			System.out.println("6 - Sumar las cifras de un entero");
			System.out.println("7 - Extraer una cifra de un entero: ");
			System.out.println("8 - Comprobar si un entero es primo");
			System.out.println("9 - Calcular el factorial de un número");
			System.out.println("10 - Calcular el máximo común divisor de dos números");
			System.out.println("");
			System.out.print("Seleccione una operación [0-10]: ");
			int x = teclado.nextInt();
			if (x == 0) {
				Operaciones.fin();
				break;
			} else if(x == 1) {
				System.out.print("Escribe dos numeros enteros: ");
				int y = teclado.nextInt();
				int z = teclado.nextInt();
				Operaciones.suma(y,z);
			} else if(x == 2) {
				System.out.print("Escribe dos numeros enteros: ");
				int a = teclado.nextInt();
				int b = teclado.nextInt();
				Operaciones.resta(a,b);
			} else if(x == 3) {
				System.out.print("Escribe dos numeros enteros: ");
				int c = teclado.nextInt();
				int d = teclado.nextInt();
				Operaciones.mult(c,d);
			} else if(x == 4) {
				System.out.print("Escribe dos numeros enteros: ");
				double e = teclado.nextInt();
				double f = teclado.nextInt();
				Operaciones.div(e,f);
			} else if(x == 5) {
				System.out.print("Escribe dos numeros enteros: ");
				int g = teclado.nextInt();
				int h = teclado.nextInt();
				Operaciones.resto(g,h);
			} else if(x == 6) {
				System.out.print("Escribe un numero entero: ");
				int i = teclado.nextInt();
				Operaciones.cifras(i);
			} else if(x == 7) {
				System.out.print("Escribe un numero entero: ");
				int j = teclado.nextInt();
				System.out.print("Escribe la posición que quieres eliminar:");
				int k = teclado.nextInt();
				Operaciones.extrac(j,k);
			} else if(x == 8) {
				System.out.print("Escribe un numero entero: ");
				int l = teclado.nextInt();
				if (Operaciones.primo(l)) {
		            System.out.println("El número "+l+" es primo");
		            System.out.println("");
		    		System.out.println("...");
		    		System.out.println("");
		    		System.out.println("");
		        } else{
		            System.out.println("El número "+l+" no es primo");
		            System.out.println("");
		    		System.out.println("...");
		    		System.out.println("");
		    		System.out.println("");
		        }
			} else if(x == 9) {
				System.out.print("Escribe un numero entero: ");
				int n = teclado.nextInt();
				Operaciones.factorial(n);
			} else {
				System.out.print("Escribe 2 numeros enteros: ");
				int m = teclado.nextInt();
				int o = teclado.nextInt();
				Operaciones.mcd(m,o);
			}
		}
	}
}
