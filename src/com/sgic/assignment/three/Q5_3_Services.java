package com.sgic.assignment.three;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Q5_3_Services {
	private final String url = "jdbc:mysql://localhost:3306/mydb";
	private final String user = "root";
	private final String pass = "Bals@123";
	
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
	
	public void saveData(String nic, String name, String fe, String be, String fr) {
		String sql = "INSERT INTO candidate_skill_set VALUES ('"+nic+"','"+name+"','"+fe+"','"+be+"','"+fr+"')";
		
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
		String sql = "SELECT * FROM candidate_skill_set";
		
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
	
	public void removeData(String nic) {
		String sql = "DELETE FROM candidate_skill_set WHERE nic='"+nic+"'";
		
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
	
	public void updateData(String nic, String name, String front, String back, String frame) {
		String sql = "UPDATE candidate_skill_set SET Name='"+name+"',Frontend='"+front+"',Backend='"+back+"',Framework='"+frame+"' WHERE NIC='"+nic+"'";
		
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
	
}
