package practica7a;

import java.io.File;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Diseñar un programa que, dadas las letras que conoce de la palabra que busca, muestre por pantalla
 * todas las posibles palabras del diccionario de la RAE que cumplan con esas condiciones
 * @author Hector Garcia
 */
public class Wordle {
	
	/**
	 * Pre: --- 
	 * Post: En el método principal, se solicita al usuario las letras que desea buscar ultilizando
	 * _ para las letras que no sabe. Luego con los métodos se leera todo el diccionario y se 
	 * realizara una comparación con el patrón que ha escrito el usuario
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Que letra/s quieres buscar(utiliza _ si no las sabes): ");
		String letras = entrada.nextLine();
		ArrayList<String> diccionario5letras = leerInformacion();
		compararLetras(letras, diccionario5letras);
	}

	/**
	 * Pre: --- 
	 * Post: En este método se leera el diccionario español que nos han pasado y se agregara a un 
	 * arrayList que sera enviado al main
	 */
	public static ArrayList<String> leerInformacion() {
		File file = new File("C:/Users/Hector/Downloads/diccionario.txt");
		ArrayList<String> listaPalabras = new ArrayList<>();
		try {
			Scanner f = new Scanner(file);
			while (f.hasNextLine()) {
				String palabra = f.nextLine().trim();
				if (palabra.length() == 5) {
					listaPalabras.add(palabra);
				}
			}
			f.close();
		} catch (FileNotFoundException e) {
			System.out.println("El fichero " + file + " no ha podido ser abierto.");
		}
		return listaPalabras;
	}
	
	/**
	 * Pre: --- 
	 * Post: En este método se compara las letras que ha introducido el usuario con las palabras 
	 * que hemos almacenado del diccionario. Se recorrera el diccionario y se compara cada palabra
	 * con el patrón de letras luego se compara cada letra del patron con la letra que le corresponde
	 * en la palabra y si todas las letras coinciden, se agrega la palabra a la lista para luego mostrarla
	 */
	public static void compararLetras(String letras, ArrayList<String> diccionario) {
		ArrayList<String> lista = new ArrayList<>();
		for (int i = 0; i < diccionario.size(); i++) {
			String palabra = diccionario.get(i);
			boolean coincide = true;
			for (int j = 0; j < letras.length(); j++) {
				String letra = letras.substring(j, j + 1);
				if (!letra.equals("_") && !letra.equalsIgnoreCase(palabra.substring(j, j + 1))) {
					coincide = false;
					break;
				}
			}
			if (coincide) {
				lista.add(palabra);
			}
		}
		System.out.println("Palabras posibles: ");
		for (int k = 0; k < lista.size(); k++) {
			System.out.println(lista.get(k));
		}
	}
}
