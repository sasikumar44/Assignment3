package com.sgic.assignment.three;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Q6_Services {
	
	private final String url = "jdbc:mysql://localhost:3306/mydb";
	private final String user = "root";
	private final String pass = "root";
	
	Connection conn;
	Statement stmt;
	ResultSet rs;
	
	public void getConnection() {
		try{
			conn = DriverManager.getConnection(url,user,pass);
		}
		catch(SQLException e) {
			e.printStackTrace();	
		}
	}
	
	public void saveData(String question, String choice, String correct) {
		String sql = "INSERT INTO Question (question,choices,correct_answer) VALUES ('"+question+"','"+choice+"','"+correct+"')";
		
		try {
			getConnection();
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("Success!");
			stmt.close();
			conn.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}	
	}
	
	public ResultSet getData() {
		String sql = "SELECT * FROM Question";
		
		try {
			getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			System.out.println("Success!");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}

}
