package com.tnsif.jdbc.example;


import java.sql.*; //1st step

public class JDBC_Connect {

	public static void main(String[] args) {
		
		
		//2nd step - Register
		
		String url = "jdbc:postgresql://localhost:5432/St_Joseph";
		String username = "postgres";
		String password = "Data@123";
		
		
		try {
			
			//Load the driver - 3nd step
			Class.forName("org.postgresql.Driver");
			
			
			//Establishing the connection - 4th step
			
			Connection con = DriverManager.getConnection(url, username, password);
			
			//Define SQL Query - 5th step
			
			Statement st = con.createStatement();
			
			//Execting the query - 6th Step
			
			String query = "SELECT * FROM batch_c78";
			
			//Process the Result - 7th step
			
			ResultSet rs = st.executeQuery(query);
			
			
			while(rs.next())
				
			{
				String table = rs.getString(1) + ":" + rs.getInt(2) + ":" + rs.getString(3);
				System.out.println(table);
			}

			
			//close the resources - 8th step
			
			rs.close();
			st.close();
			con.close();
			
			
		}
		

		catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
