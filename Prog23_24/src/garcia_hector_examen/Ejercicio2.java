package garcia_hector_examen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 * El programa se ejecuta y primero devuelve un número entero que represente el
 * número total de personas fallecidas en España por Covid19 en el año
 * especificado que de el usuario y luego que devuelva un ArrayList Tupla con el
 * total de fallecidos por año ordenados de menor a mayor. El objeto Tupla está
 * formado por dos enteros: año y número de fallecidos.
 * @author Hector Garcia
 */
public class Ejercicio2 {

	/**
	 * Pre: --- 
	 * Post: En el método principal se creara un arrayList para guardar lo
	 * que nos interesa de cada línea para más tarde hacer calculos con esos datos,
	 * tambien le preguntaremos al usuario que año quiere que se le digan los
	 * fallecimientos se le dire y automaticamente se ordenaran los 4 años que hay
	 * de menor a mayor
	 */
	public static void main(String[] args) {
		ArrayList<Casos> covid19 = leerInformacion();
		Scanner teclado = new Scanner(System.in);
		System.out.print("Año quieres saber el número de fallecidos por covid19: ");
		int anyo = teclado.nextInt();
		calcularFallecidosTotales(anyo, covid19);
	}

	/**
	 * Pre: --- 
	 * Post: En este método se leera la información de nuestro fichero, se dividira para 
	 * almacenarla bien y con esos datos crear el objeto casos para luego mostrar los datos que se
	 * quieren.
	 */
	public static ArrayList<Casos> leerInformacion() {
		File file = new File("C:/Users/Hector/Downloads/owid-covid-data.csv");
		ArrayList<Casos> covid19 = new ArrayList<>();
		try {
			int contador = 0;
			Scanner f = new Scanner(file);
			while (f.hasNextLine()) {
				String linea = f.nextLine();
				String[] lineaSeparada = linea.split(",");
				if (contador > 0) {
					int fallecidos = 0;
					if (!lineaSeparada[8].equalsIgnoreCase("")) {
						String[] numeroSeparado = lineaSeparada[8].split("\\.");
						try {
							fallecidos = Integer.parseInt(numeroSeparado[0]);
						} catch (NumberFormatException ex) {
							ex.printStackTrace();
						}
					}

					String[] fechaSeparada = lineaSeparada[3].split("-");

					Casos caso = new Casos(lineaSeparada[2], fechaSeparada[0], fallecidos);
					covid19.add(caso);
				}
				contador++;
			}
		} catch (FileNotFoundException e) {
			System.out.println("El fichero " + file + " no ha podido ser abierto.");
		}
		return covid19;
	}
	
	/**
	 * Pre: --- 
	 * Post: En este método se calcularan los fallecidos totales de cada año, aprovecho aqui que 
	 * solo hay 4 años para crear solamente variables y no complicarme la vida. Y luego con los 
	 * datos que se han sacado creo los objetos tuplas para el segundo apartado del ejercicio.
	 */
	public static void calcularFallecidosTotales(int anyo, ArrayList<Casos> covid19) {
		int veinte = 0;
		int veinte1 = 0;
		int veinte2 = 0;
		int veinte3 = 0;
		for (int i = 0; i < covid19.size(); i++) {
			if (covid19.get(i).getAnyo().equals("2020")) {
				veinte += covid19.get(i).getFallecidos();
			} else if (covid19.get(i).getAnyo().equals("2021")) {
				veinte1 += covid19.get(i).getFallecidos();
			} else if (covid19.get(i).getAnyo().equals("2022")) {
				veinte2 += covid19.get(i).getFallecidos();
			} else if (covid19.get(i).getAnyo().equals("2023")) {
				veinte3 += covid19.get(i).getFallecidos();
			}
		}
		if (anyo == 2020) {
			System.out.println("La cantidad de personas fallecidad en 2020 es de " + veinte);
		} else if (anyo == 2021) {
			System.out.println("La cantidad de personas fallecidad en 2021 es de " + veinte1);
		} else if (anyo == 2022) {
			System.out.println("La cantidad de personas fallecidad en 2022 es de " + veinte2);
		} else if (anyo == 2023) {
			System.out.println("La cantidad de personas fallecidad en 2023 es de " + veinte3);
		} else {
			System.out.println("No esta registrado ese año");
		}
		ArrayList<Tupla> tuplas = new ArrayList<>();
		Tupla anyoVeinte = new Tupla(2020, veinte);
		tuplas.add(anyoVeinte);
		Tupla anyoVeinte1 = new Tupla(2021, veinte1);
		tuplas.add(anyoVeinte1);
		Tupla anyoVeinte2 = new Tupla(2022, veinte2);
		tuplas.add(anyoVeinte2);
		Tupla anyoVeinte3 = new Tupla(2023, veinte3);
		tuplas.add(anyoVeinte3);
		ordenarAnyosSegunFallecidos(tuplas);
	}

	/**
	 * Pre: --- 
	 * Post: En este método se utilizara el compareTo para ordenar el arrayList de tuplas de los años
	 * y asi ponerlos de menor a mayor como pide el ejercicio
	 */
	public static void ordenarAnyosSegunFallecidos(ArrayList<Tupla> tuplas) {
		System.out.println("");
		System.out.println("Fallecidos por año ordenador de menor a mayor:");
		for (int j = 0; j < tuplas.size() - 1; j++) {
			Tupla o = tuplas.get(j);
			Tupla o2 = tuplas.get(j + 1);
			Comparator<Tupla> menorMayor = new Comparator<Tupla>() {
				public int compare(Tupla o, Tupla o2) {
					if (o.getFallecidos() < o2.getFallecidos())
						return -1;
					else if (o.getFallecidos() < o2.getFallecidos())
						return 0;
					else
						return 1;
				}
			};
			tuplas.sort(menorMayor);
		}
		for (int j = 0; j < tuplas.size(); j++) {
			System.out.println(tuplas.get(j));
		}
	}
}
