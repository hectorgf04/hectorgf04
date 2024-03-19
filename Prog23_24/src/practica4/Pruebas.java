package practica4;

import java.util.ArrayList;

/**
 * Se debe desarrollar un programa de pruebas que no requiera interacción con el usuario y su 
 * objetivo es simular el Juego de la Vida con determinadas configuraciones iniciales 
 * predeterminadas.
 * @author Hector Garcia
 */
public class Pruebas {
	private int numero_filas;
	private int numero_columnas;
	private int numero_generaciones;
	private ArrayList<ArrayList<Boolean>> tablero;
	private ArrayList<Tripleta> tripletas = new ArrayList<>();
	private int vCelulas = 0;
	private int nCelulas = 0;

	// Constructores
	public Pruebas() {
	}
	public Pruebas(int numero_filas, int numero_columnas, int numero_generaciones) {
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
	 * Post: Toda la lógica de esta clase es la misma que en el objeto del JuegoDeLaVida salvo que 
	 * en este yo mismo defino donde se van a poner los asteriscos sin tener ningun porcentaje de 
	 * que aparezcan. Dependiendo de lo que elija el usuario se mostrara una prueba u otra con sus
	 * diferentes caracteristicas.
	 */
	public void configuracion(int prueba) {
		this.tablero = new ArrayList<>();
		for (int i = 0; i < this.numero_filas; i++) {
			ArrayList<Boolean> fila = new ArrayList<>();
			for (int j = 0; j < this.numero_columnas; j++) {
				fila.add(false);
			}
			this.tablero.add(fila);
		}
		if (prueba == 1) {
			this.tablero.get(1).set(1, true);
			this.tablero.get(1).set(2, true);
			this.tablero.get(2).set(1, true);
			this.tablero.get(2).set(2, true);
		} else if (prueba == 2) {
			this.tablero.get(2).set(1, true);
			this.tablero.get(2).set(2, true);
			this.tablero.get(2).set(3, true);
		} else {
			this.tablero.get(1).set(1, true);
			this.tablero.get(1).set(2, true);
			this.tablero.get(2).set(1, true);
			this.tablero.get(2).set(2, true);
			this.tablero.get(3).set(3, true);
			this.tablero.get(3).set(4, true);
			this.tablero.get(4).set(3, true);
			this.tablero.get(4).set(4, true);
		}
		System.out.println("Generación 0");
		generacion(0);
		actTripleta(0);
		for (int c = 1; c < this.numero_generaciones; c++) {
			ArrayList<ArrayList<Boolean>> copiaTablero = new ArrayList<>();
			for (int i = 0; i < this.tablero.size(); i++) {
				ArrayList<Boolean> original = this.tablero.get(i);
				ArrayList<Boolean> copia = new ArrayList<>(original);
				copiaTablero.add(copia);
			}
			boolean extincion = true;
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
			if (extincion) {
				System.out.println("Colonia extinguida");
				break;
			}
		}
		System.out.println("Sobreviven " + vCelulas + " células");
		System.out.println("Estadisticas");
		for (int i = 0; i < tripletas.size(); i++) {
			Tripleta tripleta = tripletas.get(i);
			System.out.println(tripleta);
		}
	}
	public int contador(int fila, int columna, ArrayList<ArrayList<Boolean>> copiaTablero) {
		int vecinos = 0;
		int[] dFila = { -1, +1, 0, 0, -1, +1, -1, +1 };
		int[] dColumna = { 0, 0, -1, +1, -1, +1, +1, -1 };
		for (int f = 0; f < dFila.length; f++) {
			int nFila = fila + dFila[f];
			int nColumna = columna + dColumna[f];
			if (nFila >= 0 && nFila < this.numero_filas && nColumna >= 0 && nColumna < this.numero_columnas
					&& copiaTablero.get(nFila).get(nColumna)) {
				vecinos++;
			}
		}
		return vecinos;
	}
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
	public void actTripleta(int c) {
		if (tripletas.size() == 0) {
			tripletas.add(new Tripleta(c, nCelulas, vCelulas));
		} else {
			tripletas.add(new Tripleta(c, nCelulas - tripletas.get(tripletas.size() - 1).getvCelulas(), vCelulas));
		}
	}
}