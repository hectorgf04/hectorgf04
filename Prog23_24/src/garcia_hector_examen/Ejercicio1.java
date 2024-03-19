package garcia_hector_examen;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import practica5.Casilla;
import practica5.Objeto;

public class Ejercicio1 {
	public static void main(String[] argumentos) {
		Objeto[][] tablero = new Objeto[10][10];
		campo(tablero);
		imprimirTablero(tablero);
		movimiento()
	}

	public static void campo(Objeto[][] tablero) {
		Random random = new Random();
		int num = random.nextInt(9);
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				if(tablero[9][num] == tablero[i][j]) {
					tablero[9][num] = new Protagoistas("M-D");
				} else {
					tablero[i][j] = new Casilla(" * ");
				}
				
			}
		}
	}
	
	public static void imprimirTablero(Objeto[][] tablero) {
		for (int c = 0; c < tablero.length; c++) {
			for (int d = 0; d < tablero[c].length; d++) {
				System.out.print(String.format("%-5s", tablero[c][d]));
			}
			System.out.println();
		}
	}
	
	movimiento 

}
