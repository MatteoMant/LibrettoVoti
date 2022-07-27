package it.polito.tdp.librettovoti.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

	public static Connection getConnection() {
		String url = "jdbc:mysql://localhost:3306/libretto?user=root&password=simmy2003!";
		try {
			Connection conn = DriverManager.getConnection(url);
			return conn;
		} catch (SQLException e) {
			System.out.println("Errore di connessione al database");
			e.printStackTrace();
			return null;
		}
	}
}
