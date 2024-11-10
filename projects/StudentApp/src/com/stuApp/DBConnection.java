<<<<<<< HEAD
package com.stuApp;

import java.sql.Connection;
import java.sql.DriverManager;
public class DBConnection {
	static Connection con;

	public static Connection createDBConnection() {
		try {		
			String url = "jdbc:mysql://localhost:3306/studentmanagementsystem";
			String username = "root";
			String password = "root";
			con = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
=======
package com.stuApp;

import java.sql.Connection;
import java.sql.DriverManager;
public class DBConnection {
	static Connection con;

	public static Connection createDBConnection() {
		try {		
			String url = "jdbc:mysql://localhost:3306/studentmanagementsystem";
			String username = "root";
			String password = "root";
			con = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
>>>>>>> d5fa77123764c975fd733818b5f9fbfcee1af006
