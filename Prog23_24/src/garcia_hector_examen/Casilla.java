package garcia_hector_examen;

import practica5.Objeto;

public class Casilla extends Objeto {
	private String contenido;

    public Casilla(String contenido) {
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    
    @Override
    public String toString() {
        return this.contenido; 
    }
}

