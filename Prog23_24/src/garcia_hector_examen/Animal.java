package garcia_hector_examen;

/**
 * Se crea una clase animal que servira luego para crear dos clases hijas Gato y Perro que 
 * heredaran todos los atributos y métodos de esta clase principal.
 * @author Hector Garcia
 */
public class Animal {
	private String nombre;
	
	public Animal(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void hacerSonido() {}
	
	@Override
	public String toString() {
		return this.nombre; 
	}
}
