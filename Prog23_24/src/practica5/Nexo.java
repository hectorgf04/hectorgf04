package practica5;

public class Nexo extends Casilla {
	private String equipo;
	private int vidaMaxima;
	private int hp;
	
	public Nexo(String contenido, String equipo) {
		super(contenido);
		this.equipo = equipo;
		this.vidaMaxima = 500;
		this.hp = vidaMaxima;
	}

	public String getEquipo() {
		return equipo;
	}

	public int getHp() {
		return hp;
	}

	public int getVidaMaxima() {
		return vidaMaxima;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}

	
	public void recibirGolpe(int cantidadInfringida, Campeon atacante) {
		int daño = cantidadInfringida;
		if(daño > 0) {
			this.hp -= daño;
		}
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
