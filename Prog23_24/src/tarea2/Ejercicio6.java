package tarea2;

public class Ejercicio6 {
	public static void main(String[] args) {
		int i=0;
		System.out.println("Los números impares situados entre 0 y 100 son:");
		while(i <= 100) {
			if (i%2 == 1){
				System.out.println(i);
			}
			i++;
		}
	}
}
