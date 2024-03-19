package clasesyobjetos;

import java.util.Random;

public class Persona {
	private String nombre;
	private int edad;
	private String DNI;
	private String sexo;
	private double peso;
	private double altura;
	
	//Constructor
	public Persona() {}
	
	public Persona(String nombre, int edad, String sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}
	
	public Persona(String nombre, int edad, String sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.DNI = generaDNI();
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	
	//metodos
	public int calcularIMC() {
		if(this.peso/(this.altura*this.altura) < 20) {
			return -1;
		} else if (this.peso/(this.altura*this.altura) >= 20 && 
				this.peso/(this.altura*this.altura) >= 25 ) {
			return 0;
		} else {
			return 1;
		}
	}
	
	public boolean esMayorDeEdad() {
		if(this.edad > 18) {
			return true;
		} else {
			return false;
		}
	}
	
	public String comprobarSexo(String sexo) {
		if(sexo.equals(this.sexo)) {
			return sexo;
		} else {
			return "H";
		}
	}
	
	@Override
	public String toString() {
		return ("Nombre: "+ this.nombre+ ", Edad: "+ this.edad +", DNI: "+ this.DNI + ", Sexo: " + 
				this.sexo + ", Peso: " + this.peso + ", Altura: " + this.altura);
	}	
	
	public String generaDNI() {
		String DNI = "";
		Random rnd = new Random();
		for (int i = 0; i < 8; i++) {
			DNI += rnd.nextInt(10);
		}
		
		DNI += (char)(rnd.nextInt(26) + 'A');
		return DNI;
	}
	
	
	//setters
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}

		public void setSexo(String sexo) {
			this.sexo = sexo;
		}

		public void setPeso(int peso) {
			this.peso = peso;
		}

		public void setAltura(int altura) {
			this.altura = altura;
		}
}
