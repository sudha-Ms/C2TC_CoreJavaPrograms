package com.tnsif.jdbc.example;

import java.sql.*;

public class PreparedStatementDemo {

	public static void main(String[] args) {

		String url = "jdbc:postgresql://localhost:5432/St_Joseph";
		String username = "postgres";
		String password = "Data@123";
		
		String name = "Rohini";
		String dept = "AI & DS";
		int reg_no = 1006;
		
		
		String query = "INSERT INTO batch_c78(name, reg_no, dept) VALUES(?, ?, ?) ";
		
		
		try {
			
			//Load the driver - 2nd step
			Class.forName("org.postgresql.Driver");
			
			
			//Establishing the connection - 3rd step
			
			Connection con = DriverManager.getConnection(url, username, password);
			
			//Define SQL Query - 4th step
			
			PreparedStatement st = con.prepareStatement(query);
			
			//Execting the query - 5th step
			
			st.setString(1, name);
			st.setInt(2, reg_no);
			st.setString(3, dept);
			
			
			//Process the Result - 6th Step
			
			int rs = st.executeUpdate();
			System.out.println(rs +" row/s affected");
			
			
			
			//close the resources - 7th
			
			st.close();
			con.close();
			
			
		}
		

		catch(Exception e)
		{
			e.printStackTrace();
		}
		


	}

}
