package garcia_hector_examen;

public class Tupla {
	private int anyo;
	private int fallecidos;

	public Tupla(int anyo, int fallecidos) {
		this.anyo = anyo;
		this.fallecidos = fallecidos;
	}

	public int getAnyo() {
		return anyo;
	}

	public int getFallecidos() {
		return fallecidos;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

	public void setFallecidos(int fallecidos) {
		this.fallecidos = fallecidos;
	}

	@Override
	public String toString() {
		return "Año: " + this.anyo + ", Fallecidos: " + this.fallecidos;
	}
}
