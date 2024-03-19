package actividad1;

public class Ejercicio2 {
	
	
	int x;
	int y;
	static int z;
	
	public static void suma(int x, int y) {
		z = x + y;
		System.out.println("   " + x + "  +  " + y + "   =   " + z);
	}
	
	public static void main(String[] argumentos) {
		System.out.println("   Suma de dos valores dados");
		System.out.println("   =======      ===");
		suma(1,3);
		suma(1,4);
	}
}