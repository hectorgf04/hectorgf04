package practica5;

import java.util.Random;

public class Mago extends Campeon {
	private int crit; 
	
	public Mago() {
		super("M",100,30,15);
		critico();
	}
		
	public void setEquipo(String equipo) {
        super.setEquipo(equipo);
    }

    public void setIndice(int indice) {
        super.setIndice(indice);
    }
	
	public void critico() {
		Random random = new Random();
		this.crit = random.nextInt(31);
	}
	
	public boolean realizarCritico() {
        Random random = new Random();
        int probabilidadEsquivar = random.nextInt(101);
        return probabilidadEsquivar <= this.crit;
    }
		
	@Override
	public String toString() {
		return super.toString();
	}
}
