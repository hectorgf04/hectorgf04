package ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Titanic {	
	private static void calcular(String nombre) {
		File file = new File(nombre);
		try {
			Scanner f = new Scanner(file);
			int pasajeros = 0; 
			double mujeres = 0;
			double hombres = 0;
			double hombresFallecidos = 0;
			double mujeresFallecidas = 0;
			while(f.hasNextLine()) {
				String linea = f.nextLine();
				String[] lineaSeparada = linea.split(",");
				pasajeros++;
				if(lineaSeparada[5].equals("female")) {
					mujeres++;
					if(lineaSeparada[1].equals("0")) {
						mujeresFallecidas++;
					}
				} else if(lineaSeparada[5].equals("male")) {
					hombres++;
					if(lineaSeparada[1].equals("0")) {
						hombresFallecidos++;
					}
				}
				
			}
			//-1 porque tambien cuenta la linea donde pone id, survived...
			System.out.println("Número total de pasajeros del Titanic: " + (pasajeros-1));
			System.out.println("Número total de mujeres del Titanic: " + mujeres);
			System.out.println("Número total de hombres del Titanic: " + hombres);
			System.out.println("Número total de hombres fallecidos y su porcentaje: " + hombresFallecidos + ", " + hombresFallecidos/hombres*100);
			System.out.println("Número total de mujeres fallecidos y su porcentaje: " + mujeresFallecidas + ", " + mujeresFallecidas/mujeres*100);
			f.close();	
		} catch(FileNotFoundException e) {
			System.out.println("El fichero " + nombre + " no ha podido ser abierto.");
		}
	}
	
	public static void main(String[] args) {
		String nombreFichero = "C:/Users/Hector/Downloads/titanic.csv";
		calcular(nombreFichero);
	}
}
