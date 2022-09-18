package com.jdbcprac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("problem with loading class");
		}
		
		String cs = "jdbc:mysql://localhost:3306/jdbcPractice";
		
		try(Connection con = DriverManager.getConnection(cs, "root", "root")) {
			
			PreparedStatement ps = con.prepareStatement("insert into student values(01,'Ram',5)");
			
			int x = ps.executeUpdate();
			
			if(x > 0) {
				System.out.println("Record inserted");
			}
			else {
				System.out.println("record not inserted");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
