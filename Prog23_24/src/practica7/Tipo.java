package practica7;

public class Tipo {
	private String nombre;
	private int accidentes;
	
	public Tipo() {
		
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
