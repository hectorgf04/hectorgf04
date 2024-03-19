package practica5;

public class Campeon extends Objeto {
	private String nombre;
	private String equipo;
	private int indice;
	private int vidaMaxima;
	private int hp;
	private int ad;
	private int def;
	private int lvl = 1;
	private int dañoCausado;

	public Campeon() {
	}

	public Campeon(String nombre, String equipo, int indice, int hp, int ad, int def) {
		this.nombre = nombre;
		this.equipo = equipo;
		this.indice = indice;
		this.hp = hp;
		this.ad = ad;
		this.def = def;
	}

	public Campeon(String nombre, int vidaMaxima, int ad, int def) {
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

	public void aplicarPocima() {
		int cura = 20;
		if (this.hp != this.vidaMaxima) {
			this.hp += cura;
			System.out.println("Tu vida actual es: " + this.hp);
		} else {
			System.out.println("No has perdido vida, entonces no puedes restaurar");
		}

	}

	public void recibirGolpe(int cantidadInfringida, Objeto atacante) {
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
	
	public void ganarBatalla() {
		resetDañoCausado();
		this.lvl += 1;
		System.out.println(this.lvl);
		this.hp += 10;
		this.ad += 10;
		this.def += 10;
		System.out.println("Sus estadisticas suben +10, hp: " + this.hp + ", ad: " + this.ad + ", def: " + this.def );
	}
	
	

	@Override
	public String toString() {
		return this.equipo + "" + this.nombre + "" + this.indice;
	}
}
