package practica2;

import java.util.Scanner;

public class Operaciones {
	
	/**
	 * Pre: ---
	 * Post: Al tener un método while(true) en Calculadora.java, cuando el usuario mete el 0, imprime
	 * los puntos suspensivos y despues poniendole "break" la calculadora se "apagara", no podiendo
	 * escribir mas.
	 */
	protected static void fin() {
		System.out.println("...");
	}
	
	/**
	 * Pre: ---
	 * Post: Este método imprime la suma de dos enteros introducidos calculandola en el 
	 * println con (y+z).
	 */
	protected static void suma(int y, int z) {
		System.out.println("La suma entre "+y+" y "+z+" es "+(y+z));
		System.out.println("");
		System.out.println("...");
		System.out.println("");
		System.out.println("");
	}
	
	/**
	 * Pre: ---
	 * Post: Este método imprime la resta de dos enteros introducidos calculandola en el
	 * println con (a-b)
	 */
	protected static void resta(int a, int b) {
		System.out.println("La resta entre "+a+" y "+b+" es "+(a-b));
		System.out.println("");
		System.out.println("...");
		System.out.println("");
		System.out.println("");
	}
	
	/**
	 * Pre: ---
	 * Post: Este método imprime la multiplicacion de dos enteros introducidos calculandola en el
	 * println con (c*d)
	 */
	protected static void mult(int c, int d) {
		System.out.println("La multiplicación entre "+c+" y "+d+" es "+(c*d));
		System.out.println("");
		System.out.println("...");
		System.out.println("");
		System.out.println("");
	}
	
	/**
	 * Pre: ---
	 * Post: Este método imprime la división de dos enteros introducidos calculandola en el
	 * println con (e/f)
	 */
	protected static void div(double e, double f) {
		System.out.println("La division entre "+e+" y "+f+" es "+(e/f));
		System.out.println("");
		System.out.println("...");
		System.out.println("");
		System.out.println("");
	}
	
	/**
	 * Pre: ---
	 * Post: Este método imprime el resto de la division de dos enteros introducidos 
	 * calculandola en el println con (g%h)
	 */
	protected static void resto(int g, int h) {
		System.out.println("El resto de la división entre "+g+" y "+h+" es "+(g%h));
		System.out.println("");
		System.out.println("...");
		System.out.println("");
		System.out.println("");
	}
	
	/**
	 * Pre: ---
	 * Post: Dentro de este método creamos la variable "sumaCifras" y "resto", dentro del bucle el resto
	 * pasara a ser la ultima cifra del numero y dividimos nuestro numero entre 10 para quitar la
	 * ultima cifra. Depues sumaremos el resto y la suma de las cifras y se almacenara en sumaCifras.
	 * Asi el bucle hara que mientras i sea mayor de 0 se cogera la ultima cifra y se iran sumando
	 * entre si.
	 */
	protected static void cifras(int i) {
		int sumaCifras = 0;
		int resto = 0;
		while (i>0) {
			resto = i % 10;
			i = i/10;
			sumaCifras = sumaCifras + resto;
		}
		System.out.println("La suma de todas las cifras es "+sumaCifras);
		System.out.println("");
		System.out.println("...");
		System.out.println("");
		System.out.println("");
	}
	
	/**
	 * Pre: ---
	 * Post: Dentro de este método creamos la variable "contador", que junto al bucle, almacena cuantas
	 * cifras tiene el numero. Con la variable "elevado" elevaremos a 10 la resta entre contador y 
	 * la posicion que se quiere eliminar, esto saca lo anterior a la cifra que se quiere eliminar 
	 * y la almacenamos en "primeraPart" siendo el numero dividido entre la variable elevado por 10.
	 * Para lo posterior a la cifra y lo almacenamos en "segundaPart" siendo el resto de la division
	 * entre el numero y la variable elevado. Por ultimo para juntar todas las partes multiplicamos
	 * lo elevado a la primera parte para luego sumarle la segunda. 
	 */
	protected static void extrac(int j, int k) {
		int contador = 1;
	    int x = j;
	    while (x > 10) {
	    	x = x / 10;
	        contador++;
	    }
	    int elevado = (int)Math.pow(10, contador-k);
	    int primeraPart = j / (elevado * 10);
	    int segundaPart = j % elevado;
	    int resultado = primeraPart * elevado + segundaPart;
	    System.out.println("El número que te queda sera "+resultado);
	    System.out.println("");
		System.out.println("...");
		System.out.println("");
		System.out.println("");
	}
	
	/**
	 * Pre: --- 
	 * Post: Dentro de este método para comprobar si un número es primo, a traves del if, mirara si es 
	 * 2, 3 y 5, tambien si es divisible entre estos y tambien si es menor o igual a 1 y con alguna
	 * de estas condiciones no sera primo y si no, lo sera.
	 */
	protected static boolean primo(int l) { 
		boolean b = true; 
		if (l%2==0 && l!=2) {
			return false;
		} else if (l%3==0 && l!=3) {
			return false;  	
		} else if (l%5==0 && l!=5) {
			return false; 
		} else if (l<=1){
			return false;
		} else {
			return true;
		}
	}
	
	/**
	 * Pre: --- 
	 * Post: Dentro de este metodo primero creamos donde se almacena el resultado "factorial", pense
	 * que tiene que ser igual a 1 porque el factorial de 1 es 1 entonces va de 1 hasta x. Luego he
	 * creado una variable x para hacer calculos con ella que no se modifique nuestra variable n. 
	 * Dentro del bucle se multiplicara cada valor de x, luego se decrementara un numero para luego
	 * volver a hacer el bucle con esa x.
	 */
	protected static void factorial(int n) {
		int factorial = 1;
		int x = n;
		while (x>1) {
			factorial *= x;
			x = x - 1;
		}
		System.out.println("El factorial de "+n+" es "+factorial);
		System.out.println("");
		System.out.println("...");
		System.out.println("");
		System.out.println("");
	}
	
	/**
	 * Pre: --- 
	 * Post: Este ejercicio esta resuelto a partir del algoritmo de euclides. Primero en el metodo 
	 * creamos tres variables "maximo" y "minimo", dependiendo de lo que introduzca el usuario se
	 * asignara un numero maximo y minimo, y "mcd" que mostrara el resultado. Dentro del bucle
	 * tendremos un nuevo minimo que sera el resto de maximo entre minimo y un nuevo maximo que
	 * sera x que era nuestro valor original de minimo.
	 */
	protected static void mcd(int m,int o) {
		int maximo = 0;
		int minimo = 0;
		int mcd = 0;
		if (m<o) {
			minimo=m;
			maximo=o;
		} else {
			maximo=m;
			minimo=o;
		}
		while (minimo>0) {
			int x = minimo;
			minimo = maximo % minimo;
			maximo= x;
		}
		mcd = maximo;
		System.out.println("Es MCD entre los numeros "+m+" y "+o+" es "+mcd);
		System.out.println("");
		System.out.println("...");
		System.out.println("");
		System.out.println("");
	}
}
