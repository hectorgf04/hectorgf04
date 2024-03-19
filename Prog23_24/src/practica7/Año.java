package practica7;

/**
 * En este objeto se guardaran los datos importantes de cada año, guardando que año es y cuantos 
 * accidentes han ocurrido en él
 */
public class Año {
	private String año;
	private int accidentes;
	
	public Año() {
		
	}
	
	public String getAño() {
		return año;
	}



	public int getAccidentes() {
		return accidentes;
	}



	public void setAño(String año) {
		this.año = año;
	}



	public void setAccidentes(int accidentes) {
		this.accidentes = accidentes;
	}
	
	@Override
	public String toString() {
		return this.año + " " + this.accidentes;
	}
}
