package practica7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import practicaFicheros.UsuarioBizi;

/**
 * El programa se ejecuta y analiza el fichero para obtener el tipo de dato de cada uno de sus 
 * atributos. Posteriormente, diseña e implementa una clase Java llamada Accidente, y almacena
 * en un vector de dicho tipo todos los accidentes recopilados en el fichero .csv. Una vez tengas
 * toda la información almacenada en dicho vector, obtén la siguiente información: tipos de avión
 * con mayor número de accidentes, localización con mayor número de accidentes, numero de accidentes
 * ocurridos por la mañana, por la tarde y por la noche, y historial de todos los años y su número
 * de accidentes.
 * @author Hector Garcia
 * @since 18-03-2024
 * @version 20-03-2024
 */
public class Aviones {

	/**
	 * Pre: --- 
	 * Post: En el método principal, realiza diferentes operaciones para obtener las estadisticas 
	 * de los aviones que nos pide el enunciado y  luego las muestra llamando al método o mostrando
	 * los arrayList donde estan almacenados resultados .
	 */
	public static void main(String[] args) {
		ArrayList<Accidente> accidentes = leerInformacion();
		ArrayList<Tipo> tiposAvion = buscarTipos(accidentes);
		for (int j = 0; j < 1; j++) {
			System.out.println("Tipo de avión con mayor número de accidentes: " + tiposAvion.get(j));
		}
		ArrayList<Localizacion> localizaciones = buscarLocalizaciones(accidentes);
		for (int k = 0; k < 1; k++) {
			System.out.println("Localización con mayor número de accidentes: " + localizaciones.get(1));
		}
		buscarTiempoAccidente(accidentes);
		System.out.println("Historial de todos los años y su número de accidentes");
		ArrayList<Año> años = buscarAños(accidentes);
		for (int z = 1; z < años.size(); z++) {
			System.out.println(años.get(z));
		}
	}
	
	/**
	 * Pre: --- 
	 * Post: En este método se lee el archivo csv que nos proporcionan y crea los objetos 
	 * accidentes para guardar la información relevante de cada linea del fichero y lo devuelve al
	 * main.
	 * @return Listado de los accidentes de aviones del csv
	 */
	public static ArrayList<Accidente> leerInformacion() {
		File file = new File("C:/Users/Hector/Downloads/Airplane_Crashes_and_Fatalities_Since_1908.csv");
		ArrayList<Accidente> accidentes = new ArrayList<>();
		try {
			Scanner f = new Scanner(file);
			while (f.hasNextLine()) {
				String linea = f.nextLine();
				String[] lineaSeparada = linea.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
				lineaSeparada[2] = lineaSeparada[2].replace("\"", "");
				if (lineaSeparada.length >= 11) {
					Accidente accidente = new Accidente(lineaSeparada[0], lineaSeparada[1], lineaSeparada[2],
							lineaSeparada[6], lineaSeparada[10]);
					accidentes.add(accidente);
				}
			}
			f.close();
		} catch (FileNotFoundException e) {
			System.out.println("El fichero " + file + " no ha podido ser abierto.");
		}
		return accidentes;
	}
	
	/**
	 * Pre: --- 
	 * Post: En este método se recorre la tabla accidentes con un bucle y con otro arrayList se van
	 * almacenando los diferentes tipos de aviones que hay y los fallecidos que se han tenido 
	 * sumandolos y luego ordenando ese arrayList comparando los fallecidos de cada uno.
	 * @param accidentes Listado de los accidentes de aviones del csv
	 * @see #leerInformacion()
	 * @return Listado de los diferentes tipos de aviones 
	 */
	public static ArrayList<Tipo> buscarTipos(ArrayList<Accidente> accidentes) {
		ArrayList<Tipo> tipos = new ArrayList<>();
		for (int i = 0; i < accidentes.size(); i++) {
			Tipo avion = null;
			for (int j = 0; j < tipos.size(); j++) {
				if (tipos.get(j).getNombre().equalsIgnoreCase(accidentes.get(i).getType())) {
					avion = tipos.get(j);
					break;
				}
			}
			if (avion == null) {
				avion = new Tipo();
				avion.setNombre(accidentes.get(i).getType());
				tipos.add(avion);
			}
			avion.setAccidentes(avion.getAccidentes() + 1);
			Collections.sort(tipos, Comparator.comparingInt(Tipo::getAccidentes).reversed());
		}
		return tipos;
	}
	
	/**
	 * Pre: --- 
	 * Post: Método parecido al anterior donde se recorre la tabla accidentes y se van almacenando
	 * los diferentes tipos de ubicaciones que hay y se va sumando cuantas veces ha habido accidentes
	 * en ese lugar, luego se ordenaran dependiendo del número de accidentes ocurridos.
	 * @param accidentes Listado de los accidentes de aviones del csv
	 * @return Listado de las diferentes localizaciones que hay en los accidentes
	 */
	public static ArrayList<Localizacion> buscarLocalizaciones(ArrayList<Accidente> accidentes) {
		ArrayList<Localizacion> localizaciones = new ArrayList<>();
		for (int i = 0; i < accidentes.size(); i++) {
			Localizacion sitio = null;
			for (int j = 0; j < localizaciones.size(); j++) {
				if (localizaciones.get(j).getNombre().equalsIgnoreCase(accidentes.get(i).getLocation())) {
					sitio = localizaciones.get(j);
					break;
				}
			}
			if (sitio == null) {
				sitio = new Localizacion();
				sitio.setNombre(accidentes.get(i).getLocation());
				localizaciones.add(sitio);
			}
			sitio.setAccidentes(sitio.getAccidentes() + 1);
			Collections.sort(localizaciones, Comparator.comparingInt(Localizacion::getAccidentes).reversed());
		}
		return localizaciones;
	}
	
	/**
	 * Pre: --- 
	 * Post: En este método tambien se recorrera accidentes y almacenaremos en variables cuando ha 
	 * ocurrido cada accidente, puede ser que la hora este escrita de diferentes formas y por eso
	 * tenemos tantos if, me he dejado dos casos porque no entendia que hora significaban. Y como 
	 * ultimo printeara cada uno de los casos, mañana tarde o noche.
	 * @param accidentes Listado de los accidentes de aviones del csv
	 */
	public static void buscarTiempoAccidente(ArrayList<Accidente> accidentes) {
		int mañana = 0;
		int tarde = 0;
		int noche = 0;
		for (int i = 1; i < accidentes.size(); i++) {
			String horaMinutos = accidentes.get(i).getTime();
			String[] horaSeparada = horaMinutos.split("\\s*[:'\\.]\\s*");
			
			if(horaSeparada[0].contains("c") && horaSeparada[0].length() == 3) {
				horaSeparada[0] = horaSeparada[0].substring(1);
			}
			if(horaSeparada[0].equalsIgnoreCase("c")) {
				horaSeparada[0] = horaSeparada[1];
			}
			
			horaSeparada[0] = horaSeparada[0].trim();
			if (!horaSeparada[0].equalsIgnoreCase("") ) {
				try {
					int hora = Integer.parseInt(horaSeparada[0]);
					if (hora >= 6 && hora < 13) {
						mañana++;
					} else if (hora >= 13 && hora < 20) {
						tarde++;
					} else if (hora >= 20 || hora < 6) {
						noche++;
					}
				} catch (NumberFormatException ex) {
					ex.printStackTrace();
				}
			}
		}
		System.out.println("Número de accidentes por la mañana: " + mañana);
		System.out.println("Número de accidentes por la tarde: " + tarde);
		System.out.println("Número de accidentes por la noche: " + noche);
	}

	/**
	 * Pre: --- 
	 * Post: En este método tambien se recorrera accidentes y almacenaremos en un arrayList los
	 * diferentes años que tenemos en nuestro archivo guardando en un objeto el año y cuantos 
	 * accidentes han ocurrido en ese año.
	 * @param accidentes Listado de los accidentes de aviones del csv
	 * @return Listado de los diferentes años que hay en los accidentes
	 */
	public static ArrayList<Año> buscarAños(ArrayList<Accidente> accidentes) {
		ArrayList<Año> años = new ArrayList<>();
		for (int i = 0; i < accidentes.size(); i++) {
			String fecha = accidentes.get(i).getDate();
			String añoFecha = fecha.substring(fecha.length() - 4);
			Año año = null;
			for (int j = 0; j < años.size(); j++) {
				if (años.get(j).getAño().equalsIgnoreCase(añoFecha)) {
					año = años.get(j);
					break;
				}
			}
			if (año == null) {
				año = new Año();
				año.setAño(añoFecha);
				años.add(año);
			}
			año.setAccidentes(año.getAccidentes() + 1);
		}
		return años;
	}

}
