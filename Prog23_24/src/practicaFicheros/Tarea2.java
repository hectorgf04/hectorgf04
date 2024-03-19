package practicaFicheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

/**
 * Desarrolla un programa Java que solicite al usuario un fichero de usos de Bizi Zaragoza, y a 
 * continuación, muestre un resumen del contenido del fichero en el que se indique el número de usos
 * totales recogidos en el documento, distinguiendo cuántos de ellos se corresponde a traslados y
 * cuántos de ellos son circulares (estación de origen y destino son idénticas).
 * @author Hector Garcia
 */
public class Tarea2 {
	
	/**
	 * Pre: --- 
	 * Post: En este método se muestra información sobre los usos de Bici Zaragoza. Primero se crea
	 * un File para representar el archivo que nuestro usuario escriba en el main, luego un bloque
	 * try-catch para controlar el posible error que puede dar si no encuentra el archivo. Dentro,
	 * tenemos el scanner para leer el file y las variables que nos piden y que se mostraran al 
	 * final. Luego iria el bucle while para mirar cada línea del archivo, cada línea se dividide
	 * utilizando ";", con esto miraremos lo que se ha pedido la estacion de origen y de destino y
	 * se creara una instancia Usobici donde se guardaran. Mediante contador no se tendra en cuenta
	 * a la cabecera y con los metodos que tiene Usobici se ira incrementando cada variable segun el
	 * if en el que se meta  
	 */
	public static void mostrarInformacion(String ruta, String nombreFichero) {
		File file = new File(ruta, nombreFichero);
		try {
			Scanner f = new Scanner(file);
			int usos = 0;
			int translado = 0;
			int circulares = 0;
			int contador = 0;
			while (f.hasNextLine()) {
				String linea = f.nextLine();
				String[] lineaSeparada = linea.split(";");
				if (contador > 0) {
					Usobici biciUsada = new Usobici(lineaSeparada[2], lineaSeparada[4]);
					if (biciUsada.esCircular()) {
						circulares++;
					} else {
						translado++;
					}
					usos++;
				}
				contador++;
			}
			f.close();
			System.out.println("");
			System.out.println("Número total de usos como translado: " + translado);
			System.out.println("Número total de usos circulares: " + circulares);
			System.out.println("Número total de usos: " + usos);
		} catch (FileNotFoundException e) {
			System.out.println("El fichero " + file + " no ha podido ser abierto.");
		}
	}
	
	/**
	 * Pre: --- 
	 * Post: En el método principal, le solicita al usuario la ruta donde se encuentra el archivo y
	 * el nombre del archivo de usos de Bizi Zaragoza y luego se llamara al método mostrarInformación 
	 * con la ruta y el nombre del archivo que nos ha escrito el usuario.
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Escriba la ruta donde esta su fichero: ");
		String ruta = entrada.nextLine();
		System.out.print("Escriba el nombre de un fichero de usos del sistema Bizi: ");
		String nombreFichero = entrada.nextLine();
		mostrarInformacion(ruta, nombreFichero);
	}
}