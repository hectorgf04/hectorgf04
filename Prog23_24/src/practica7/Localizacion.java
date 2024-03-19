package practica7;

/**
 * En este objeto se guardaran los datos importantes de cada localización, guardando que localizacion es y cuantos 
 * accidentes han ocurrido en él
 */
public class Localizacion {
	private String nombre;
	private int accidentes;
	
	public Localizacion() {
		
	}
	
	public String getNombre() {
		return nombre;
	}

	public int getAccidentes() {
		return accidentes;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setAccidentes(int accidentes) {
		this.accidentes = accidentes;
	}
	
	@Override
	public String toString() {
		return this.nombre + " " + this.accidentes;
	}
}
