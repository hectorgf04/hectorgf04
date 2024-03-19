package practica3;

import java.util.Scanner;

/**
 * El programa solicita al usuario el número de preguntas en un test, luego pide las respuestas 
 * correctas para cada pregunta, donde cada respuesta correcta es un entero. Posteriormente, 
 * solicita al usuario las respuestas de un alumno y muestra en pantalla el número de respuestas
 * correctas y el porcentaje total de preguntas acertadas, teniendo en cuenta todos los tests 
 * corregidos.
 * @author Hector Garcia
 */
public class Ejercicio5 {
	
	/**
	 * Pre: ---
	 * Post: En este método coge las dos tablas,rAlumnos y rCorrectas, y la cantidad de preguntas 
	 * del examen ,nPreguntas. Luego el bucle recorre las dos tablas a la misma vez, si coincide 
	 * la cifra de las tablas sumara uno a la variable correcto y así hasta que recorra todo.
	 */
	public static int correct(int[] rAlumnos, int[] rCorrectas, int nPreguntas) {
		Scanner teclado = new Scanner(System.in);
		int correcto = 0;
		for (int k = 0; k < rAlumnos.length; k++) {
			if (rAlumnos[k] == rCorrectas[k]) {
				correcto++;
			}
		}
		return correcto;
	}

	/**
	 * Pre: ---
	 * Post: En el método principal, se creara un bucle infinito, dentro preguntara si quieres 
	 * corregir un examen, al escribir "si", pedira el número de preguntas del examen, las 
	 * respuestas correctas y las respuestas que ha introducido el alumno. Volvera a preguntar si 
	 * quieres corregir un examen, si seleccionas "no" te dara los resultados del examen de ese 
	 * alumno, diciendo el número de respuestas correctas y el porcentaje de acierto. Si quieres 
	 * seguir corregiendo 2,3... examenes más, al darle que no quieres corregir más te dara el 
	 * número de respuestas correctas entre todos los examenes y el porcentaje total de preguntas
	 * acertadas.
	 */
	public static void main(String[] args) {
		int tCorrecto = 0;
		int tPreguntas = 0;
		while (true) {
			Scanner teclado = new Scanner(System.in);
			System.out.print("Quieres corregir un examen(SI/NO): ");
			String siOno = teclado.nextLine();
			if (siOno.equalsIgnoreCase("SI")) {
				System.out.print("Introduce el numero de preguntas del examen: ");
				int nPreguntas = teclado.nextInt();
				int[] rCorrectas = new int[nPreguntas];
				int[] rAlumnos = new int[nPreguntas];
				System.out.print("Introduce las respuestas correctas: ");
				for (int i = 0; i < rCorrectas.length; i++) {
					int rCorrecta = teclado.nextInt();
					rCorrectas[i] = rCorrecta;
				}
				System.out.print("Introduce las respuestas del alumno: ");
				for (int i = 0; i < rAlumnos.length; i++) {
					int rAlumno = teclado.nextInt();
					rAlumnos[i] = rAlumno;
					
				}
				tCorrecto = correct(rAlumnos,rCorrectas,nPreguntas) + tCorrecto;
				tPreguntas = nPreguntas + tPreguntas;
				
			} else {
				System.out.println("El alumno tiene " + tCorrecto + " respuestas correctas y tiene "
						+ "un porcentaje de preguntas acertadas del "
				        + ((double) tCorrecto / tPreguntas) * 100 + "%");
				break;
			}
		}

	}
}