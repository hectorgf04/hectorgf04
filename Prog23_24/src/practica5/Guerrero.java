package practica5;

import java.util.Random;

public class Guerrero extends Campeon{
	private int bloq;
	
	public Guerrero() {
		super("G",100,35,15);
		bloqueo();
	}
	
	public int getBloq() {
        return bloq;
    }

    public void setBloq(int bloq) {
        this.bloq = bloq;
    }
	public void setEquipo(String equipo) {
        super.setEquipo(equipo);
    }

    public void setIndice(int indice) {
        super.setIndice(indice);
    }
	
    public void bloqueo() {
        Random random = new Random();
        this.bloq = random.nextInt(31);
    }

    public boolean bloquearAtaque() {
        Random random = new Random();
        int probabilidadBloqueo = random.nextInt(101); 
        return probabilidadBloqueo <= this.bloq;
    }
	
	@Override
	public String toString() {
		return super.toString();
	}
}
