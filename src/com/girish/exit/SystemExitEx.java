package com.girish.exit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SystemExitEx {

	public static void main(String[] args) throws SQLException 
	{
		Connection con = null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		    con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","girish","girish");
			System.out.println("I am in try block");
			System.exit(0);
			
		} 
		catch(Exception ex){
			ex.printStackTrace();
		} 
		finally {
			System.out.println("I am in finally block!!!");
			con.close();
		}
		
	}

}
