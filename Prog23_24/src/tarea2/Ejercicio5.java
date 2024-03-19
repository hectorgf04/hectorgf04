package tarea2;

public class Ejercicio5 {
	public static void main(String[] args) {
		int i=0;
		System.out.println("Los números pares situados entre 0 y 100 son:");
		while(i <= 100) {
			if (i%2 == 0){
				System.out.println(i);
			}
			i++;
		}
	}
}
