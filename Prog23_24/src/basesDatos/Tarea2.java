package basesDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Tarea2 {
	private Connection connect = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;
	final private String host = "localhost:3306/prueba";
	final private String user = "root";
	final private String passwd = "Invizimals2004-";

	public void readDataBase() throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager
					.getConnection("jdbc:mysql://" + host + "?" + "user=" + user + "&password=" + passwd);
			statement = connect.createStatement();
			preparedStatement = connect.prepareStatement("SELECT * from alumno");
			System.out.println("QUERY ---> select * from alumno");
			resultSet = preparedStatement.executeQuery();
			ArrayList<Alumno> listaAlumnos = readAlumnos(resultSet);

			preparedStatement = connect.prepareStatement("SELECT * from asignatura");
			resultSet = preparedStatement.executeQuery();
			ArrayList<Asignatura> listaAsignaturas = readAsignatura(resultSet, listaAlumnos);
			for(int i = 0; i < listaAlumnos.size(); i++) {
				System.out.println(listaAsignaturas.get(i));
			}
		} catch (Exception e) {
			throw e;
		} finally {
			close();
		}
	}

	private ArrayList<Alumno> readAlumnos(ResultSet resultSet) throws SQLException {
		ArrayList<Alumno> listaAlumnos = new ArrayList<>();
		while (resultSet.next()) {
			Alumno alumno = new Alumno(resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4));
			listaAlumnos.add(alumno);
			System.out.println("\tID: " + resultSet.getInt(1));
			System.out.println("\tNOMBRE: " + resultSet.getString(2));
			System.out.println("\tAPELLIDO: " + resultSet.getString(3));
			System.out.println("\tDNI: " + resultSet.getString(4));
		}
		return listaAlumnos;
	}
	
	private ArrayList<Asignatura> readAsignatura(ResultSet resultSet, ArrayList<Alumno> listaAlumnos) throws SQLException {
		ArrayList<Asignatura> listaAsignaturas = new ArrayList<>();
		while (resultSet.next()) {
			for(int i = 0; i < listaAlumnos.size(); i++) {
				if(resultSet.getInt(4) == listaAlumnos.get(i).getId()) {
					Asignatura asignatura = new Asignatura(resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3),listaAlumnos.get(i));
					listaAsignaturas.add(asignatura);
				}
			}
		}
		return listaAsignaturas;
	}

	private void close() {
		try {
			if (resultSet != null) {
				resultSet.close();
			}
			if (statement != null) {
				statement.close();
			}
			if (connect != null) {
				connect.close();
			}
		} catch (Exception e) {
		}
	}

}
