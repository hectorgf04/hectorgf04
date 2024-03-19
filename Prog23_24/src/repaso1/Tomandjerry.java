package repaso1;

import java.util.Scanner;

public class Tomandjerry {
	public static void tomandjerry(int n) {
		Scanner teclado = new Scanner(System.in);
		int tom1 = (int)(Math.random()*n);
		int tom2 = (int)(Math.random()*n);
		int jerry1 = (int)(Math.random()*n);
		int jerry2 = (int)(Math.random()*n);
		int jerry3 = jerry1;
		int jerry4 = jerry2;
		while (jerry1 == tom1 && jerry2 == tom2) {
	        jerry1 = (int) (Math.random() * n);
	        jerry2 = (int) (Math.random() * n);
	    }
		int turno = 1;
		while (true) {
		    for (int i = 0; i < n; i++) {
		        for (int j = 0; j < n; j++) {
		            if (i == tom1 && j == tom2) {
		                System.out.print("T  ");
		            } else if (i == jerry1 && j == jerry2) {
		                System.out.print("J  ");
		            } else {
		                System.out.print("*  ");
		            }
		        }
		        System.out.println("");
		    }

		    System.out.println("TURN " + turno + " HAS STARTED!");
		    System.out.print("Select movement (A, W, S, D): ");
		    String movimiento = teclado.nextLine();
		    jerry1 = jerry3 + (int) (Math.floor(Math.random() * 3) - 1);
		    jerry2 = jerry4 + (int) (Math.floor(Math.random() * 3) - 1);
		    jerry1 = Math.max(0, Math.min(n - 1, jerry1));
		    jerry2 = Math.max(0, Math.min(n - 1, jerry2));
		    if (tom1 == jerry1 && tom2 == jerry2) {
		        System.out.println("ENHORABUENA!! Has tardado " + turno + " turnos");
		        break;
		    }
		    if (movimiento.equalsIgnoreCase("A")) {
		        tom2 = tom2 - 1;
		    } else if (movimiento.equalsIgnoreCase("W")) {
		        tom1 = tom1 - 1;
		    } else if (movimiento.equalsIgnoreCase("S")) {
		        tom1 = tom1 + 1;
		    } else if (movimiento.equalsIgnoreCase("D")) {
		        tom2 = tom2 + 1;
		    }
		    turno = turno + 1;
		}
	}
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("---Welcome to Tom&Jerry's game!---");
		System.out.print("Select number of rows and columns (1-10): ");
		int n = teclado.nextInt();
		tomandjerry(n);
	}
}
