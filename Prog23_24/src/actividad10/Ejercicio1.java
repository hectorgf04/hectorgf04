package actividad10;

public class Ejercicio1 {
	public static void tabla(int salarios[][], String empleados[]) {
		int sumatorio = 0;
		for (int k = 0; k < empleados.length;k++) {
			System.out.print(empleados[k]);
			System.out.print("->");
			for (int j = 0; j < salarios[k].length; j++) {
                if(j==2) {
                	System.out.print(salarios[k][j] + "=");
                } else {
                	System.out.print(salarios[k][j] + "+");	
                }
                sumatorio += salarios[k][j];
            }
			System.out.print(sumatorio);
			System.out.println("");
		}	
	}	
	public static void main(String[] args) {
		int salarios[][] = { {700, 900, 1300} , {1000, 950, 1080}, {1300, 930, 1200} };
		String empleados[] = {" Javier Marías"," Antonio Muñoz","Isabel Allende"};
		tabla(salarios, empleados);
	}
}
