package garcia_hector_examen;

public class Casos {
	private String location;
	private String anyo;
	private int fallecidos;

	public Casos(String location, String anyo, int fallecidos) {
		this.location = location;
		this.anyo = anyo;
		this.fallecidos = fallecidos;
	}

	public String getLocation() {
		return location;
	}

	public String getAnyo() {
		return anyo;
	}

	public int getFallecidos() {
		return fallecidos;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setAnyo(String anyo) {
		this.anyo = anyo;
	}

	public void setFallecidos(int fallecidos) {
		this.fallecidos = fallecidos;
	}
}
