package practica5;

import java.util.Random;

public class Arquero extends Campeon {
	private int esq; 
	
	public Arquero() {
		super("A",100,25,10);
		esquivar();
	}
	public void setEquipo(String equipo) {
        super.setEquipo(equipo);
    }
	
    public void setIndice(int indice) {
        super.setIndice(indice);
    }
    public int getEsq() {
        return esq;
    }

    public void setEsq(int esq) {
        this.esq = esq;
    }
    
	public void esquivar() {
		Random random = new Random();
		this.esq = random.nextInt(31);
	}
	
	public boolean esquivarAtaque() {
        Random random = new Random();
        int probabilidadEsquivar = random.nextInt(101);
        return probabilidadEsquivar <= this.esq;
    }
	
	@Override
	public String toString() {
		return super.toString();
	}
}
