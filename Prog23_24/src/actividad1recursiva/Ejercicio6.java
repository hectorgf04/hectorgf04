package actividad1recursiva;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[]args) {
		Scanner teclado = new Scanner( System.in);
		System.out.print("Introduce M y en que numero N, su sumatorio de sus numero anteriores es superior a M: ");
		int eme = teclado.nextInt();
		System.out.println(sumatorio(eme,0,0));	
	}
	
	public static int sumatorio(int eme, int ene, int sumatorio) {
		if(sumatorio > eme) {
			return ene - 1;
		} else {
			return sumatorio(eme,ene + 1 ,sumatorio + ene);
		}
	}
}
