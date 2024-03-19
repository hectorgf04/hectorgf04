package practicaFicheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import practica5.Objeto;

/**
 * Desarrollar un programa Java que, al igual que el anterior, solicite al usuario la ruta de un
 * fichero de datos de Bizi Zaragoza, y a continuación, escriba en la pantalla el número de usuarios
 * distintos que aparecen en el fichero y un listado de los 15 usuarios que más usos han hecho del 
 * sistema según el contenido del fichero. Para cada uno de estos usuarios indicará el número de 
 * usos entre estaciones distintas, el número de usos entre la misma estación y el número de usos
 * totales. Este listado de los 15 usuarios más activos deberá aparecer ordenado de mayor a menor 
 * según el número de usos totales.
 * @author Hector Garcia
 */
public class Tarea3 {
	
	/**
	 * Pre: --- 
	 * Post: En este método se muestra la información del uso de Bizi. Se crea un File para 
	 * representar el archivo de datos y un ArrayList que almacenara instacias de tipo UsuarioBizi
	 * que sean únicos. Luego esta el bloque try-catch para manejar las excepciones, dentro estará
	 * el scanner para leer nuestro File, un contador para no tener en cuenta la cabecera, un 
	 * contador de usuarios unicos que tiene nuestro csv y por ultimo el while. Dentro del while
	 * mirará cada línea del archivo, cada línea se dividide utilizando ";". Se contarán los
	 * usuarios distintos y se incrementán los contadores según el uso que se le ha dado a la bici.
	 * Por último utilizo esa función collections para ordenar en función de usos de cada usuario, 
	 * de mayor a menor y luego sólo se mostrarán los 15 primeros también de mayor a menor.
	 */
	public static void mostrarInformacion(String ruta, String nombreFichero) {
		File file = new File(ruta, nombreFichero);
		ArrayList<UsuarioBizi> ids = new ArrayList<>();
		try {
			Scanner f = new Scanner(file);
			int contador = 0;
			int usuariosDistintos = 0;
			while (f.hasNextLine()) {
				String linea = f.nextLine();
				String[] lineaSeparada = linea.split(";");
				if (contador > 0) {
					UsuarioBizi usuarioExistente = buscar(ids, lineaSeparada[0]);
			        if (usuarioExistente == null) {
			            usuariosDistintos++;
			            usuarioExistente = new UsuarioBizi(lineaSeparada[0]);
			            ids.add(usuarioExistente);
			        }
                    if (lineaSeparada[2].equals(lineaSeparada[4])) {
						usuarioExistente.incrementarCircular();
						usuarioExistente.incrementarUsos();
					} else {
						usuarioExistente.incrementarTranslados();
						usuarioExistente.incrementarUsos();
					}
				}
				contador++;
			}
			f.close();
			Collections.sort(ids, Comparator.comparingInt(UsuarioBizi::getUsos).reversed());
			System.out.println("");
			System.out.println("Número usuario distintos: " + usuariosDistintos);
			System.out.println("");
			System.out.println("Usuario  Translado  Circular  Total");
	        System.out.println("=======  =========  ========  =====");
			System.out.println("");
			for(int j = 0; j < Math.min(ids.size(), 15); j++){
				System.out.println(ids.get(j));
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("El fichero " + file + " no ha podido ser abierto.");
		}
	}
	
	/**
	 * Pre: --- 
	 * Post: En este método se busca un usuario del ArrayList usuarios para ver si ese usuario ya 
	 * existe en el array o no. Se utilizará un bucle for que compará el identificador de cada 
	 * usuario del array con el que se proporciona, si encuentra el mismo id devuelve el usuario,
	 * de lo contrario devuelve null.
	 */
	public static UsuarioBizi buscar(ArrayList<UsuarioBizi> usuarios, String idUsuario) {
		for (int i = 0; i < usuarios.size(); i++) {
	        UsuarioBizi usuario = usuarios.get(i);
	        if (usuario.getIdUsuario().equals(idUsuario)) {
	            return usuario;
	        }
	    }
	    return null;
	}
	
	/**
	 * Pre: --- 
	 * Post: En el método principal, le solicita al usuario la ruta donde se encuentra el archivo y
	 * el nombre del archivo de usos de Bizi Zaragoza y luego se llamará al método 
	 * mostrarInformación con la ruta y el nombre del archivo que nos ha escrito el usuario.
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