package com.newcomb.java.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
	private String url = "jdbc:postgresql://localhost/javafxpsql";
	private String username = "postgres";
	private String password = "196711aa";
	
	private Connection connection;
	
	public Connection getConnection() {
		try {
			connection = DriverManager.getConnection(url,username,password);
			System.out.println("Connected to Database");
		}catch(SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return connection;
	}
}
