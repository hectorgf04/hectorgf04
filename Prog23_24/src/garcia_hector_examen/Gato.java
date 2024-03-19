package garcia_hector_examen;

/**
 * Se crea una de las subclases Gato que sera hija de Animal y tendra todos los atributos y métodos
 * de su padre cambiando que el método hacerSonido que el gato tiene su propio sonido y por eso lo 
 * sobrescribe.
 */
public class Gato extends Animal {
	public Gato(String nombre) {
		super(nombre);
	}
	
	@Override
	public void hacerSonido() {
		System.out.println("¡Miau!");
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
