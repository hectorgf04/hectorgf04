package actividad11;

public class Ejercicio4 {
	public static void igual(String[]tabla1,String[]tabla2) {
		boolean iguales = true;
		if(tabla1.length == tabla2.length) {
			for (int i = 0; i < tabla1.length; i++) {
				if (tabla1[i].compareTo(tabla2[i])!=0) {
					iguales = false;
					break;
				} 
			}
			if(iguales) {
				System.out.println("Son exactamente iguales");
			} else {
				System.out.println("No son exactamente iguales");
			}
		} else {
			System.out.println("No tienen la misma longitud, por lo tanto no son iguales");
		}
	}
	public static void main(String[] args) {
		String[]tabla1 = {"hola","tal","que"};
		String[]tabla2 = {"hola","que","tal"};
		igual(tabla1,tabla2);
	}
}
