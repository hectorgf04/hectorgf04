package interfaces;

public class Coche implements Vehiculo {
	private int velocidad;
	private int plazas;
	private String color;
	
	public Coche() {}
	
	public Coche(int plazas, String color) {
		this.velocidad = 0;
		this.plazas = plazas;
		this.color = color;
	}
	
	@Override
	public String acelerar(int cuanto) {
		velocidad += cuanto;
		return "Vehiculo acelerando,velocidad actual: "+velocidad;
	}
	
	@Override
	public String frenar(int cuanto) {
		if(velocidad != 0) {
			velocidad -= cuanto;
			return "Vehiculo frenando,velocidad actual: "+velocidad;
		} else {
			return "Vehiculo esta parado";
		}
	}
	
	public int getPlazas() {
		return plazas;
	}
	
	public String getColor() {
		return color;
	}
	
	public int velocidad() {
		return velocidad;
	}
}
