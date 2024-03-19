package actividad10;  

public class Ejercicio2 {
	public static void tabla(int salarios[][], String empleados[]) {
		for (int i = 0; i < empleados.length;i++) {
			System.out.print(empleados[i]);
			System.out.print("->");
			for (int j = 0; j < salarios[j].length - 1; j++) {
				for (int k = j + 1; k < salarios.length; k++) {
					if (salarios[i][j] > salarios[i][k]) {
						int temp = salarios[i][k];
						salarios[i][k] = salarios[i][j];
						salarios[i][j] = temp;
					}
				} 
            }
			for (int n = 0; n < salarios.length; n++) {
				System.out.print(salarios[i][n]+"/");
			}	
			System.out.println("");
		}	
	}	
	public static void main(String[] args) {
		int salarios[][] = { {700, 900, 1300} , {1000, 950, 1080}, {1300, 930, 1200} };
		String empleados[] = {" Javier Marías"," Antonio Muñoz","Isabel Allende"};
		tabla(salarios, empleados);
	}
}