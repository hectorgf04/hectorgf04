package practicaFicheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

/**
 * El programa se ejecuta y tiene como objetivo abordar el problema de manejar grandes volúmenes de
 * información en archivos CSV.Se busca crear dos programas Java no interactivos que generen 
 * documentos más pequeños(uno de 10 línas y otro de 2000) para facilitar las pruebas de un algoritmo
 * en desarrollo.
 * @author Hector Garcia
 */
public class Tarea1 {
	
	/**
	 * Pre: --- 
	 * Post: En este método se crea un archivo llamado pruebas-10.csv con las primeras 2000 lineas 
	 * de usos-16.csv. Para ello primero se crean las dos File para representar los archivos. 
	 * Abrimos un bloque try-catch en caso de que de error, en el try se lee el archivo original y
	 * el formatter para escribir en el nuevo archivo. Luego abriremos un while para leer las líneas,
	 * con la variable contador el bucle parara una vez se alcance las 10 líneas.
	 */
    public static void cambiar10() {
        File file = new File("C:/Users/Hector/Downloads/usos-16.csv");
        File file10 = new File("C:/Users/Hector/Downloads/pruebas-10.csv");
        try {
            Scanner f = new Scanner(file);
            int contador = 0;
            Formatter salida = new Formatter(file10);
            while (f.hasNextLine() && contador < 10) {
                String linea = f.nextLine();
                contador++;
                salida.format(linea + "%n");
            }
            f.close();
            salida.close();
            System.out.println("Se han creado las 10 primeras líneas en el archivo 'pruebas-10.csv'.");
        } catch (FileNotFoundException e) {
            System.out.println("El fichero " + file + " no ha podido ser abierto.");
        }
    }
    
    /**
	 * Pre: ---
	 * Post: Este método sigue la misma estructura que el método cambiar10(), pero con ajustes en 
	 * las rutas de los archivos, el original es usos-17.csv y el nuevo es pruebas-2000.csv, y en
	 * límite de líenas a procesar que seran las primeras 2000 líneas.
	 */
    public static void cambiar2000() {
    	File file = new File("C:/Users/Hector/Downloads/usos-17.csv");
    	File file2000 = new File("C:/Users/Hector/Downloads/pruebas-2000.csv");
    	try {
            Scanner f = new Scanner(file);
            int contador = 0;
            Formatter salida = new Formatter(file2000);
            while (f.hasNextLine() && contador < 2000) {
                String linea = f.nextLine();
                contador++;
                salida.format(linea + "%n");
            }
            f.close();
            salida.close();
            System.out.println("Se han creado las 2000 primeras líneas en el archivo 'pruebas-10.csv'.");
        } catch (FileNotFoundException e) {
            System.out.println("El fichero " + file + " no ha podido ser abierto.");
        }
    }
    
    /**
	 * Pre: --- 
	 * Post: En el método principal, solamente se ejecutaran los metodos que nos pide el enunciado,
	 * no interactua de ninguna manera con el usuario solamente diciendo lo que ha hecho cada método.
	 */
    public static void main(String[] args) {
        cambiar10();
        cambiar2000();
    }
}