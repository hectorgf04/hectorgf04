package practica4;

import java.util.ArrayList;
import java.util.Random;

/**
 * El programa inicia un tablero aleatorio con un 20 % de celdas vivas y un 80 % de celdas vacías. 
 * Muestra el estado inicial del tablero con "Generación 0".Luego, presenta las generaciones 
 * sucesivas indicando el número de iteración y el estado del tablero. Este proceso refleja la 
 * evolución del juego de la vida a lo largo del tiempo.
 * @author Hector Garcia
 */
public class JuegoDeLaVida {
	private int numero_filas;
	private int numero_columnas;
	private int numero_generaciones;
	private ArrayList<ArrayList<Boolean>> tablero;
	private ArrayList<Tripleta> tripletas = new ArrayList<>();
	private int vCelulas = 0;
	private int nCelulas = 0;

	// Constructores
	public JuegoDeLaVida() {
	}
	public JuegoDeLaVida(int numero_filas, int numero_columnas, int numero_generaciones) {
		this.numero_filas = numero_filas;
		this.numero_columnas = numero_columnas;
		this.numero_generaciones = numero_generaciones;
	}

	// getters
	public int getNumero_filas() {
		return numero_filas;
	}
	public int getNumero_columnas() {
		return numero_columnas;
	}
	public int getNumero_generaciones() {
		return numero_generaciones;
	}

	// setters
	public void setNumero_filas(int numero_filas) {
		this.numero_filas = numero_filas;
	}
	public void setNumero_columnas(int numero_columnas) {
		this.numero_columnas = numero_columnas;
	}
	public void setNumero_generaciones(int numero_generaciones) {
		this.numero_generaciones = numero_generaciones;
	}

	// metodos

	/**
	 * Pre: --- 
	 * Post: En este método se inicia el tablero en un arraylist, para
	 * crear una matriz tiene que haber dos bucles anidados, esta el primero que crea la fila y el 
	 * segundo la columna y todo se añadira al arraylist. A cada espacio de la lista le daremos una
	 * posibilidad del 20% para más tarde si se cumple este porcentaje aparezca una célula/*. Con
	 * el método generación dependiendo del método contador se van imprimiendo las generaciones segun
	 * las instrucciones del juego. Tambien se van guardando los datos de cuantas celulas estan vivas
	 * y cuantas nacen para luego mostrarlo cuando se termine el programa.
	 */
	public void tablero() {
		Random random = new Random();
		this.tablero = new ArrayList<>();
		
		// Inicia el tablero con células vivas y vacías de manera aleatoria
		for (int i = 0; i < this.numero_filas; i++) {
			ArrayList<Boolean> fila = new ArrayList<>();
			for (int j = 0; j < this.numero_columnas; j++) {
				fila.add(random.nextDouble() < 0.2);
			}
			this.tablero.add(fila);
		}
		System.out.println("Generación 0");
		generacion(0);
		actTripleta(0);
		for (int c = 1; c < this.numero_generaciones; c++) {

			// Hago una copia profunda del tablero directamente en el bucle
			ArrayList<ArrayList<Boolean>> copiaTablero = new ArrayList<>();
			
			for (int i = 0; i < this.tablero.size(); i++) {
				ArrayList<Boolean> original = this.tablero.get(i);
				ArrayList<Boolean> copia = new ArrayList<>();

				for (int j = 0; j < original.size(); j++) {
					copia.add(original.get(j));
				}

				copiaTablero.add(copia);
			}

			// Creo una variable para cuando no se pueda seguir con el juego que ponga que
			// se termina
			boolean extincion = true;

			// En este bucle se recorrera la tabla y aplicara el método contador para contar
			// los vecinos y aplicar las reglas del juego, si tiene menos de 2 o más de 3
			// vecinos se muere y si tiene 3 vecinos se creara una nueva célula
			for (int d = 0; d < this.numero_filas; d++) {
				for (int e = 0; e < this.numero_columnas; e++) {
					int vecino = contador(d, e, copiaTablero);
					if (copiaTablero.get(d).get(e)) {
						if (vecino < 2 || vecino > 3) {
							this.tablero.get(d).set(e, false);
						} else {
							extincion = false;
						}
					} else {
						if (vecino == 3) {
							this.tablero.get(d).set(e, true);
							extincion = false;
							nCelulas++;
						}
					}
				}
			}
			System.out.println("Generación " + c + ":");
			generacion(c);
			actTripleta(c);
			
			// Termina el juego porque no hay más células
			if (extincion) {
				System.out.println("Colonia extinguida");
				break;
			}
		}
		System.out.println("Sobreviven " + vCelulas + " células");
		System.out.println("Estadisticas");
		
		// Almacena las estadiscticas de la generación
		for (int i = 0; i < tripletas.size(); i++) {
			Tripleta tripleta = tripletas.get(i);
			System.out.println(tripleta);
		}
	}

	/**
	 * Pre: --- 
	 * Post: En este método se calcula el número de células vecinas que tiene la celda que se esta 
	 * mirando en el bucle del tablero. Creo dos arrays con las posibles direcciones que puede tener
	 * una célula y asi verifica si las hay, tambien se mira si la celda que tiene a los lados esta
	 * en los limites del tablero.
	 */
	public int contador(int fila, int columna, ArrayList<ArrayList<Boolean>> copiaTablero) {
		int vecinos = 0;
		int[] dFila = { -1, +1, 0, 0, -1, +1, -1, +1 };
		int[] dColumna = { 0, 0, -1, +1, -1, +1, +1, -1 };
		for (int f = 0; f < dFila.length; f++) {
			int nFila = fila + dFila[f];
			int nColumna = columna + dColumna[f];
			if (nFila >= 0 && nFila < this.numero_filas && nColumna >= 0 && nColumna < this.numero_columnas
					&& this.tablero.get(nFila).get(nColumna)) {
				vecinos++;
			}
		}
		return vecinos;
	}

	/**
	 * Pre: --- 
	 * Post: En este método muestra la generación que toca, viendo si el 20% se cumple y poniendo un
	 * asterisco o no si lo hace. Aqui tambien se calculan los datos que se guardan en nuestra
	 * tripleta, vCelulas, nCelulas.
	 */
	public void generacion(int c) {
		vCelulas = 0;
		nCelulas = 0;
		int antiguasCelulas = nCelulas;
		for (int a = 0; a < this.numero_filas; a++) {
			for (int b = 0; b < this.numero_columnas; b++) {
				if (this.tablero.get(a).get(b)) {
					System.out.print(" * ");
					vCelulas++;
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		nCelulas = vCelulas - antiguasCelulas;
		actTripleta(c);
	}
	
	/**
	 * Pre: --- 
	 * Post: En este método se actualiza la lista de tripletas con la informacion que nos piden.
	 * Lo hace con la generación actual que es c (bucle de arriba) y con el primer if mira si esta
	 * vacio la lista para agregar una nueva o si no esta vacia que calcule las celulas nuevas 
	 * rescpecto a la tripleta anterior.
	 */
	public void actTripleta(int c) {
		if (tripletas.size() == 0) {
	        tripletas.add(new Tripleta(c, nCelulas, vCelulas));
	    } else {
	        tripletas.add(new Tripleta(c, nCelulas - tripletas.get(tripletas.size() - 1).getvCelulas(), vCelulas));
	    }
	}
}
