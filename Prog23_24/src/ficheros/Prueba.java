package ficheros;

import java.io.File;
import java.util.Scanner;

public class Prueba {
	public static void mostrarInformacion(File f) {
		if(f.isFile()) {
			System.out.println();
			System.out.println(" ---------------------");
			System.out.println("| INFORMACIÓN DE FILE |");
			System.out.println(" ---------------------");
			System.out.println("| Nombre del fichero:                             " + f.getName());
			System.out.println("| Ruta relativa del directorio del fichero:       " + f.getParent());
			System.out.println("| Nombre del fichero (ruta relativa):             " + f.getPath());
			System.out.println("| Nombre del fichero (ruta absoluta):             " + f.getAbsolutePath());
			System.out.println("| Tamaño del fichero (en bytes):                  " + f.length());
			System.out.println("| Puede ser leído:                                " + f.canRead());
			System.out.println("| Puede ser escrito:                              " + f.canWrite());
		}
	}
	
	public static void mostrarMenu() {
		System.out.println("Selecciona una opción: ");
		System.out.println("  1) Crear File usando ruta");
		System.out.println("  2) Crear File usando ruta + nombre");
		System.out.println("  3) Eliminar File usando ruta:");
		System.out.print("Opción seleccionada (0 para finalizar): ");
	}
	
	public static void renombrar() {
		
		System.out.println("Selecciona una opción: ");
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		mostrarMenu();
		int opcion = entrada.nextInt();
		while(opcion != 0) {
			File f;
			if(opcion == 1 || opcion == 2 || opcion == 3) {
				if(opcion == 1) {
					//C:\Users\Hector\Downloads\notasAlumnos.txt
					System.out.print("Escriba la ruta para File: ");
					String rutaFinal = entrada.next();
					f = new File(rutaFinal);
				} else if(opcion == 2) {
					//C:\Users\Hector\Downloads
					System.out.print("Escriba la ruta para File (sin nombre): ");
					String ruta = entrada.next();
					//notasAlumnos.txt
					System.out.print("Escriba el nombre para File: ");
					String nombre = entrada.next();
					f = new File(ruta, nombre);
				} else {
					System.out.print("Escriba la ruta para File: ");
					String rutaFinal = entrada.next();
					f = new File(rutaFinal);
					System.out.print("¿Seguro que deseas eliminarlo?: ");
					String decision = entrada.next();
					if (decision.equalsIgnoreCase("SI")) {
						f.delete();
					} else {
						System.out.print("Has elegido el verdadero camino");
					}
				}
				mostrarInformacion(f);
			} else {
				System.out.println("¡Opción incorrecta. Indique un número válido!");
			}
			System.out.println();
			System.out.println("==================================================");
			System.out.println();
			mostrarMenu();
			opcion = entrada.nextInt();
		}
	}
}
