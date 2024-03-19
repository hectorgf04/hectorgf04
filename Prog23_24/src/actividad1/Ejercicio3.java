package actividad1;

public class Ejercicio3 {
	int b;
	int a;
	int x;
	int y;
	static int z;
	
	
	public static void operacion1 (int x, int y, int a) {
		z = x + y * a;
		System.out.println("   "+x+"+"+y+"*"+a+"   =   "+z);
	}
	public static void operacion2 (int x, int y, int a) {
		z = (x+y)% a;
		System.out.println("   "+"("+x+"+"+y+")"+"%"+a+" =    "+z);
	}
	public static void operacion3 (int x, int y, int a, int b) {
		z = x + y * a / b;
		System.out.println("  "+x+"+"+y+"*"+a+"/"+b+" =   "+z);
	}
	
	public static void main(String[] argumentos) {
		System.out.println("   Resultado de operaciones");
		System.out.println("   =======      ===");
		operacion1(-5,8,6);
		operacion2(55,9,9);
		operacion3(20,-3,5,8);
	}
}
