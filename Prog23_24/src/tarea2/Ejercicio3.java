package tarea2;

/**
 * Comentario clase
 * 
 * @author hector
 */
public class Ejercicio3 {
	
	/**
	* Pre: ---
	* Post: comentario metodo
	*/
	public static void main(String[] args) {
		int i=50;
		int suma = 0;
		while(i <= 100) {
			suma += i;
			i++;
		}
		System.out.println("La suma entre los numeros 50 y 100 es: "+suma);
	}
}