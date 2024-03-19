package garcia_hector_examen;

/**
 * Se crea una de las subclases Perro que sera hija de Animal y tendra todos los atributos y métodos
 * de su padre cambiando que el método hacerSonido que el perro tiene su propio sonido y por eso lo 
 * sobrescribe.
 */
public class Perro extends Animal {
	public Perro(String nombre) {
		super(nombre);
	}

	@Override
	public void hacerSonido() {
		System.out.println("¡Guau!");
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
