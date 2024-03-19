package clasesyobjetos;

public class Electrodomestico {
	private double precioBase;
	private String color;
	private String consumElect;
	private double peso;
	
	String[]colores = {"blanco","negro","rojo","azul","gris"};
	
	public Electrodomestico() {
		this.precioBase = 100;
		this.color = "blanco";
		this.consumElect = "F";
		this.peso = 5;
	}
	
	public Electrodomestico(double precioBase, double peso) {
		//llama al constructor por defecto
		this();
		this.precioBase = precioBase;
		this.peso = peso;
	}
	
	public Electrodomestico(double precioBase,String color,String consumElect, double peso) {
		this.precioBase = precioBase;
		comprobarColor(color);
        comprobarConsumoEnergetico(consumElect);
		this.peso = peso;
	}
	
	//metodos

	public double getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public String getConsumElect() {
		return consumElect;
	}

	public double getPeso() {
		return peso;
	}
	
	public String comprobarConsumoEnergetico(String letra) {
		if(letra.equals(this.consumElect)) {
			return letra;
		} else {
			return "F";
		}
	}
	
	public String comprobarColor(String color) {
		if(color.equals(this.color)) {
			return color;
		} else {
			return "blanco";
		}
	}

	public void precioFinal() {
		double precioFinal = precioBase;
		if(this.consumElect.equals("A")) {
			precioFinal += 100;
		} else if (this.consumElect.equals("B")) {
			precioFinal += 80;
		} else if (this.consumElect.equals("C")) {
			precioFinal += 60;
		} else if (this.consumElect.equals("D")) {
			precioFinal += 50;
		} else if (this.consumElect.equals("E")) {
			precioFinal += 30;
		} else if (this.consumElect.equals("F")) {
			precioFinal += 10;
		}
		if(this.peso >= 0 && this.peso <= 19) {
			precioFinal += 10;
		} else if (this.peso >= 20 && this.peso <= 49) {
			precioFinal += 50;
		} else if (this.peso >= 50 && this.peso <= 79) {
			precioFinal += 80;
		} else if (this.peso >= 80) {
			precioFinal += 100;
		}
	}
	
	public class Lavadora extends Electrodomestico {

	    private double carga;

	    public Lavadora() {
	        // atributos por defecto de electrodomestico
	        super();
	        this.carga = 5;
	    }

	    public Lavadora(double precioBase, double peso) {
	        super(precioBase, peso);
	        this.carga = 5;
	    }

	    public Lavadora(double carga, double precioBase, String color, String consumElect, double peso) {
	        super(precioBase, color, consumElect, peso);
	        this.carga = carga;
	    }

	    public double getCarga() {
	        return carga;
	    }

	    @Override
	    public void precioFinal() {
	        if (carga > 30) {
	        	super.precioFinal += 50;
	        }
	    }
	}
	
}
