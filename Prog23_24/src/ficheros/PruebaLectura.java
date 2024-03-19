package ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PruebaLectura {
	private static void mostrarInformacionFichero(String nombre) {
		File file = new File(nombre);
		int numLineas = 0;
		int numCaracteres = 0;
		try {
			Scanner f = new Scanner(file);
			while(f.hasNextLine()) {
				String linea = f.nextLine();
				numLineas++;
				numCaracteres = numCaracteres + linea.length();
			}
			f.close();
			System.out.println("Fichero " + nombre + " analizado con éxito:");
			System.out.println("\t- Número total de líneas = " + numLineas);
			System.out.println("\t- Número total de caracteres = " + numCaracteres);
		} catch(FileNotFoundException e) {
			System.out.println("El fichero " + nombre + " no ha podido ser abierto.");
		}
	}
	
	private static void calcularMedias(String nombre) {
		File file = new File(nombre);
		try {
			Scanner f = new Scanner(file);
			while(f.hasNextLine()) {
				String linea = f.nextLine();
				String[] lineaSeparada = linea.split(";");
				double media = (Integer.parseInt(lineaSeparada[2]) + 
						Integer.parseInt(lineaSeparada[3]) + Integer.parseInt(lineaSeparada[4]))/3;
				System.out.println(lineaSeparada[0] + " tiene una media de: " + media);
			}
			f.close();	
		} catch(FileNotFoundException e) {
			System.out.println("El fichero " + nombre + " no ha podido ser abierto.");
		}
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Dame la ruta + nombre del fichero para mostrar sus lineas y nº caracteres: ");
		String nombreFichero = entrada.nextLine();
		mostrarInformacionFichero(nombreFichero);
		System.out.print("Dame la ruta + nombre del fichero para mostrar la media de los alumnos: ");
		nombreFichero = entrada.nextLine();
		calcularMedias(nombreFichero);
	}
}
