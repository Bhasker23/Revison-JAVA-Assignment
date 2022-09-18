package com.jdbcprac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Demo {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.err.println("problem with loading class");
		}
		
		String c = "jdbc:mysql://localhost:3306/jdbcPractice";
		
		try(Connection connection = DriverManager.getConnection(c, "root", "root")) {
			
			PreparedStatement pStatement = connection.prepareStatement("select * from student");
			
			ResultSet rs = pStatement.executeQuery();
			
			
			
			while(rs.next()) {
				int r = rs.getInt("roll");
				String name = rs.getString("name");
				int cs = rs.getInt("class");
				
				System.out.println(r+" "+name+" "+ cs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
