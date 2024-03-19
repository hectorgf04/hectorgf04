package shopGames;

public class Videojuego {
	//Atributos
	private String titulo;
	private String genero;
	private double precio;
	private String desarrolladora;
	private String fechaLanzamiento;
	private int pegi;
	//Contructor
	public Videojuego (){}
	public Videojuego (String titulo, String genero, double precio, 
					   String desarrolladora, String fechaLanzamiento, int pegi) {
		//this referencia al atributo y el otro titulo al String titulo declarado en el parentesis
		this.titulo = titulo;
		this.genero = genero;
		this.precio = precio;
		this.desarrolladora = desarrolladora;
		this.fechaLanzamiento = fechaLanzamiento;
		this.pegi = pegi;
	}
	//Getters
	public String getTitulo() {
		return this.titulo;
	}
	public String getGenero() {
		return this.genero;
	}
	public double getPrecio() {
		return this.precio;
	}
	public String getDesarrolladora() {
		return this.desarrolladora;
	}
	public String getFechaLanzamiento() {
		return this.fechaLanzamiento;
	}
	public int getPegi() {
		return this.pegi;
	}
	
	//Setters
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public void setDesarrolladora (String desarrolladora) {
		this.desarrolladora = desarrolladora;
	}
	public void setFechaLanzamiento (String fechaLanzamiento) {
		this.fechaLanzamiento = fechaLanzamiento;
	}
	public void setPegi (int pegi) {
		this.pegi = pegi;
	}
	
	@Override
	public String toString() {
		return "Titulo= " + titulo + ", Genero = " + genero + ", Precio = " + precio +
				", Desarrolladora = " + desarrolladora + ", FechaLanzamiento" +
				fechaLanzamiento + ", Pegi = " + pegi;
	}
}