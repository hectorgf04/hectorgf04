package ficheros;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class PruebaEscritura {
	private static void guardarResultadosSinFormato(String nombre) {
		try {
			Formatter salida = new Formatter(nombre);
			salida.format(" x (en grados)     sen(x)     cos(x)\n");
			salida.format("===============   ========   ========\n");
			salida.flush();
			for(int i = 0; i <= 12; i++) {
				double angulo = i*30*Math.PI/180.0;
				salida.format("    " + 30*i + "   " + Math.sin(angulo) + "   " + 
				Math.cos(angulo) + "\n");
			}
			salida.close();
		} catch(FileNotFoundException e) {
			System.out.println("El fichero " + nombre + " no ha podido ser creado.");
		}
	}
	
	private static void guardarResultadosConFormato(String nombre) {
		try {
			Formatter salida = new Formatter(nombre);
			salida.format(" x (en grados)     sen(x)     cos(x)\n");
			salida.format("===============   ========   ========\n");
			salida.flush();
			for(int i = 0; i <= 12; i++) {
				double angulo = i*30*Math.PI/180.0;
				salida.format("%8d    %12.3f   %9.3f\n", 30*i, Math.sin(angulo), Math.cos(angulo));
			}
			salida.close();
		} catch(FileNotFoundException e) {
			System.out.println("El fichero " + nombre + " no ha podido ser creado.");
		}
	}
	
	//C:\Users\Hector\Downloads\notasAlumnos.txt
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Dame la ruta + nombre del fichero (sin formato): ");
		String nombreFichero = entrada.next();
		guardarResultadosSinFormato(nombreFichero);
		System.out.print("Dame la ruta + nombre del fichero (con formato): ");
		nombreFichero = entrada.next();
		guardarResultadosConFormato(nombreFichero);
	}

}
