package clasesyobjetos;

public class Cuenta {
	private String titular;
	private double cantidad;
	
	//Constructor
	public Cuenta() {}
	
	public Cuenta(String titular, double cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;
	}
	
	public Cuenta(String titular) {
		this.titular = titular;
	}
	
	//getters
	public String getTitular() {
		return titular;
	}

	public double getCantidad() {
		return cantidad;
	}
	
	//setters
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
	//metodos
	public String ingresar(double cantidad) {
		if(cantidad > 0) {
			this.cantidad = this.cantidad + cantidad;
			return "Se ha ingresado la cantidad de " + cantidad + " euros, la cuenta ahora tiene "
					+ this.cantidad + "euros";
		} else {
			return "La cantidad es negativa, no se hara nada";
		}
	}
	
	public String retirar(double cantidad) {
		 if (this.cantidad - cantidad > 0) {
			 this.cantidad = this.cantidad - cantidad;
			 return "Se ha retirado la cantidad de " + cantidad + " euros, la cuenta ahora tiene "
					 + this.cantidad + " euros";
		 } else {
			 return "La cantidad de la cuenta pasa a ser 0";
		 }
	}
	
	@Override
	public String toString() {
		return ("Titular: "+ this.titular+ ", Cantidad: "+ this.cantidad);
	}	
}