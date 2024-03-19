package practica5;

public class Minion extends Objeto {
	private String nombre;
	private String equipo;
	private int indice;
	private int vidaMaxima;
	private int hp;
	private int ad;
	private int def;
	private int lvl = 1;
	private int dañoCausado;

	public Minion() {
	}

	public Minion(String nombre, String equipo, int indice, int hp, int ad, int def) {
		this.nombre = nombre;
		this.equipo = equipo;
		this.indice = indice;
		this.hp = hp;
		this.ad = ad;
		this.def = def;
	}

	public Minion(String nombre, int vidaMaxima, int ad, int def) {
		this.nombre = nombre;
		this.vidaMaxima = vidaMaxima;
		this.ad = ad;
		this.def = def;
		this.hp = vidaMaxima;
		this.dañoCausado = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public String getEquipo() {
		return equipo;
	}

	public int getIndice() {
		return indice;
	}

	public int getHp() {
		return hp;
	}

	public int getVidaMaxima() {
		return vidaMaxima;
	}

	public int getAd() {
		return ad;
	}

	public int getDef() {
		return def;
	}

	public int getLvl() {
		return lvl;
	}
	
	public int getDañoCausado() {
		return dañoCausado;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public void setVidaMaxima(int vidaMaxima) {
		this.vidaMaxima = vidaMaxima;
	}

	public void setAd(int ad) {
		this.ad = ad;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public void setLvl(int lvl) {
		this.lvl = lvl;
	}
	
	public void setDañoCausado(int dañoCausado) {
		this.dañoCausado = dañoCausado;
	}

	public void recibirGolpe(int cantidadInfringida, Campeon atacante) {
		int daño = cantidadInfringida - this.def;
		if(daño > 0) {
			this.hp -= daño;
		}
	}
	
	public void resetDañoCausado() {
		this.dañoCausado = 0;
	}
	
	public void aumentarDaño(int daño) {
		this.dañoCausado += daño;
	}
	
	@Override
	public String toString() {
		return this.equipo + "" + this.nombre;
	}
}
