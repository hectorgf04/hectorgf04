package interfaces;

import java.util.ArrayList;

public class Comprobar {
	public static void main(String[] argumentos) {
		ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new Coche(5, "Rojo"));
        vehiculos.add(new Coche(4, "Azul"));
        vehiculos.add(new Coche(7, "Verde"));
        vehiculos.add(new Moto());
        vehiculos.add(new Moto());
        for (int i = 0; i < vehiculos.size(); i++) {
            Vehiculo vehiculo = vehiculos.get(i);
            System.out.println("Tipo de vehículo: " + vehiculo.getClass().getSimpleName());
            System.out.println(vehiculo.acelerar(20));
            System.out.println(vehiculo.frenar(10));
            if (vehiculo instanceof Coche) {
                Coche coche = (Coche) vehiculo;
                System.out.println("Plazas: " + coche.getPlazas());
                System.out.println("Color: " + coche.getColor());
            }
        }
	}
}
