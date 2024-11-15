package studentdata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class App {
	// Insert student data
	public void insertStudent(String name, int age, String email) {
	    String sql = "INSERT INTO studentss (name, age, email) VALUES (?, ?, ?)";
	    try (Connection con = getConnection();
	         PreparedStatement stmt = con.prepareStatement(sql)) {
	        stmt.setString(1, name);
	        stmt.setInt(2, age);
	        stmt.setString(3, email);
	        stmt.executeUpdate();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}

	// Delete student by ID
	public void deleteStudent(int id) {
	    String sql = "DELETE FROM studentss WHERE id = ?";
	    try (Connection conn = getConnection();
	         PreparedStatement stmt = conn.prepareStatement(sql)) {
	        stmt.setInt(1, id);
	        stmt.executeUpdate();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}

	// Update student data
	public void updateStudent(int id, String name, int age, String email) {
	    String sql = "UPDATE studentss SET name = ?, age = ?, email = ? WHERE id = ?";
	    try (Connection conn = getConnection();
	         PreparedStatement stmt = conn.prepareStatement(sql)) {
	        stmt.setString(1, name);
	        stmt.setInt(2, age);
	        stmt.setString(3, email);
	        stmt.setInt(4, id);
	        stmt.executeUpdate();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}

	// Helper method to get database connection
	private Connection getConnection() throws SQLException {
	    // Code to establish database connection
	    return DriverManager.getConnection("jdbc:mysql://localhost:3306/studentss", "root", "password");
	}
}
