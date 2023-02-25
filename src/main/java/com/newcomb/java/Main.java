package com.newcomb.java;

import com.newcomb.java.database.Database;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hi from Main");
		Database database = new Database();
		database.getConnection();
	}

}
