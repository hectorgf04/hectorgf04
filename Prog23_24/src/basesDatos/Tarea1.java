package basesDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class Tarea1 {
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
			preparedStatement = connect.prepareStatement("SELECT * from tarea1");
			System.out.println("QUERY ---> select * from tarea1");
			resultSet = preparedStatement.executeQuery();
			writeResultSet(resultSet);

			preparedStatement = connect.prepareStatement("insert into tarea1(id, alumno) values (?, ? )");
			preparedStatement.setInt(1, 1);
			preparedStatement.setString(2, "Héctor");
			System.out.println("QUERY ---> insert into tarea1(id, alumno)");
			preparedStatement.executeUpdate();

			preparedStatement = connect.prepareStatement("SELECT * from tarea1");
			System.out.println("QUERY ---> select * from tarea1");
			resultSet = preparedStatement.executeQuery();
			writeResultSet(resultSet);

			preparedStatement = connect.prepareStatement("update tarea1 set alumno = 'Rubén' where id = 1");
			System.out.println("QUERY ---> update tarea1 set alumno = 'Rubén' where id = 1");
			preparedStatement.executeUpdate();

			preparedStatement = connect.prepareStatement("SELECT * from tarea1");
			System.out.println("QUERY ---> select * from tarea1");
			resultSet = preparedStatement.executeQuery();
			writeResultSet(resultSet);

			preparedStatement = connect.prepareStatement("delete from tarea1 where alumno= ?");
			preparedStatement.setString(1, "Rubén");
			preparedStatement.executeUpdate();
			System.out.println("QUERY ---> delete from tarea1 where");
			writeResultSet(resultSet);

			preparedStatement = connect.prepareStatement("SELECT * from user");
			System.out.println("QUERY ---> select * from user");
			resultSet = preparedStatement.executeQuery();
			writeResultSet(resultSet);
		} catch (Exception e) {
			throw e;
		} finally {
			close();
		}
	}

	private void writeResultSet(ResultSet resultSet) throws SQLException {
		while (resultSet.next()) {
			int id = resultSet.getInt(1);
			String alumno = resultSet.getString(2);
			System.out.println("\tID: " + id);
			System.out.println("\tAlumno: " + alumno);
		}
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
