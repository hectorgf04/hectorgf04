package clasesyobjetos;

public class Banco {
	public static void main(String[] args) {
		Cuenta cuenta1 = new Cuenta("Juan",30.5);
		Cuenta cuenta2 = new Cuenta();
		cuenta2.setTitular("Pepe");
		cuenta2.setCantidad(200.43);
		System.out.println(cuenta1);
		System.out.println(cuenta1.retirar(20.32));
		System.out.println(cuenta1.ingresar(235.28));
		System.out.println("");
		Persona persona1 = new Persona ("Hector", 19, "H", 72.5, 1.82);
		System.out.println(persona1);
		System.out.println(persona1.calcularIMC());
		System.out.println(persona1.esMayorDeEdad());
		System.out.println(persona1.comprobarSexo("H"));
		System.out.println(persona1.esMayorDeEdad());
		
	}
}
