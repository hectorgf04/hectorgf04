package basesDatos;

public class Asignatura {
	private int id;
	private String nombre;
	private String curso;
	private Alumno alumno;
	
	public Asignatura(int id, String nombre, String curso, Alumno alumno) {
		this.id = id;
		this.nombre = nombre;
		this.curso = curso;
		this.alumno = alumno;
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getCurso() {
		return curso;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	@Override
	public String toString() {
		return "Asignatura [id=" + id + ", nombre=" + nombre + ", curso=" + curso + ", alumno=" + alumno + "]";
	}
	
	
}
