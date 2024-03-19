package practicaFicheros;

/**
 * Esta clase a la hora de crear el objeto contendra el origen y el destino del uso de una bici
 */
public class Usobici {
	private String origen;
    private String destino;
    
    public Usobici(String origen, String destino) {
        this.origen = origen;
        this.destino = destino;
    }
	public String getOrigen() {
		return origen;
	}
	public String getDestino() {
		return destino;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public boolean esCircular() {
        return origen.equals(destino);
    }
}