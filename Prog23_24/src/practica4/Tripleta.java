package practica4;

/**
 * El programa debería almacenar el número de iteración, número de células vivas y número de células
 * nuevas respecto a la iteración anterior (puede ser negativo) en un ArrayList que almacenará datos
 * de tipo "Tripleta". Esta estructura estará formada por tres tipos de datos enteros mencionados
 * anteriormente.
 * @author Hector Garcia
 */
public class Tripleta {
	private int iteracion;
	private int nCelulas;
	private int vCelulas;

	// constructores
	public Tripleta() {
	}
	public Tripleta(int iteracion, int nCelulas, int vCelulas) {
		this.iteracion = iteracion;
		this.nCelulas = nCelulas;
		this.vCelulas = vCelulas;
	}

	// getters
	public int getIteracion() {
		return iteracion;
	}
	public int getnCelulas() {
		return nCelulas;
	}
	public int getvCelulas() {
		return vCelulas;
	}
	// setters
	public void setIteracion(int iteracion) {
		this.iteracion = iteracion;
	}
	public void setnCelulas(int nCelulas) {
		this.nCelulas = nCelulas;
	}
	public void setvCelulas(int vCelulas) {
		this.vCelulas = vCelulas;
	}

	// metodos
	@Override

	/**
	 * Pre: --- 
	 * Post: En este método se convierte la tripleta en una cadena de texto formada por los datos 
	 * pedidos
	 */
	public String toString() {
		return ("Iteración: " + this.iteracion + ", Células vivas :" + this.vCelulas + " , Células nuevas: "
				+ this.nCelulas);
	}
}
