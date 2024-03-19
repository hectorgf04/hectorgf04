package garcia_hector_examen;

import java.util.ArrayList;

/**
 * Diseña un programa principal en el que se crean 2 objetos de cada uno de los animales 
 * implementados, se inserten en un ArrayList y se recorra este llamando al método hacerSonido()
 * para cada animal, lo que mostrará en la consola el sonido específico de cada uno de estos.
 * @author Hector Garcia
 */
public class Ejercicio3 {
	
	/**
	 * Pre: ---
	 * Post: En el método principal se creara un arrayList para guardar los animales para más tarde
	 * ser llamados, luego se creara como dice el enunciado 2 objetos de cada animal y lo meteremos
	 * a esa arrayList. Por ultimo el bucle for recorre el arrayList con los animales y invoca al
	 * metodo hacerSonido con cada uno de ellos lo que imprimira el sonido
	 */
	public static void main(String[] argumentos) {
		ArrayList<Animal> animales = new ArrayList<>();
		Perro perro1 = new Perro("Rocket");
		animales.add(perro1);
		Perro perro2 = new Perro("Wanda");
		animales.add(perro2);
		Gato gato1 = new Gato("Bigotes");
		animales.add(gato1);
		Gato gato2 = new Gato("Alvaro");
		animales.add(gato2);
		for (int i = 0; i < animales.size(); i++) {
			animales.get(i).hacerSonido();
		}

	}
}
