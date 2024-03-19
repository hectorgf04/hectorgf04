package interfaces;

public class Moto implements Vehiculo {
	private int velocidad;
	
	public Moto() {
		this.velocidad = 0;
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
			return "Vehiculo frenando, velocidad actual: "+velocidad;
		} else {
			return "Vehiculo esta parado";
		}
	}
}
