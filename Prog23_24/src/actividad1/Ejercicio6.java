package actividad1;

import java.util.Scanner;

/**
 * 
 */

public class Ejercicio6 {
	
	/**
	 * Pre
	 * Post
	 */
	public static void main(String[] argumentos){
		int x=0;
		int a;
		int b;
		int c;
		int d;
		int f;
		int g;
		int h;
		int i;
		int j;
		int e;
		Scanner teclado = new Scanner( System.in);
		System.out.println("Introduce valor para x");
		x = teclado.nextInt();
		a = 1*x;
		b = 2*x;
		c = 3*x;
		d = 4*x;
		e = 5*x;
		f = 6*x;
		g = 7*x;
		h = 8*x;
		i = 9*x;
		j = 10*x;
		System.out.println("La tabla de multiplicar de"+x+"es la siguiente:");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		System.out.println(j);
	}
}