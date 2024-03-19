package practicaFicheros;

/**
 * Esta clase a la hora de crear un objeto contendra los datos de los usuarios.
 */
public class UsuarioBizi {
	private String idUsuario;
	private int translados;
	private int circular;
	private int usos;

	public UsuarioBizi(String idUsuario) {
		this.idUsuario = idUsuario;
		this.translados = 0;
		this.circular = 0;
		this.usos = 0;
	}

	public String getIdUsuario() {
		return idUsuario;
	}

	public int getTranslados() {
		return translados;
	}

	public int getCircular() {
		return circular;
	}
	
	public int getUsos() {
		return usos;
	}

	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}

	public void setTranslados(int translados) {
		this.translados = translados;
	}

	public void setCircular(int circular) {
		this.circular = circular;
	}
	
	public void setUsos(int usos) {
		this.usos = usos;
	}
	
	
	public void incrementarTranslados() {
		this.translados += 1;
	}
	
	public void incrementarCircular() {
		this.circular += 1;
	}
	
	public void incrementarUsos() {
		this.usos += 1;
	}
	@Override
	public String toString() {
		return String.format("%-13s%-10d%-9d%-9d", this.idUsuario, this.translados, this.circular, this.usos);
	}

}
