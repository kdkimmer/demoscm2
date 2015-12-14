package com.webwork;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.webwork.dataobjects.Shipper;

public class DbWriter {
	
	private static String connectionString = "jdbc:sqlserver://localhost\\SQLEXPRESS;databaseName=Northwind;user=sa;password=slu";
	
	public static void saveShipper(Shipper shipper){
		try
		{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			 
			Connection conn = DriverManager.getConnection(connectionString);
			Statement stmt = conn.createStatement();
			stmt.execute(String.format("UPDATE Shippers SET CompanyName='%s', Phone='%s' WHERE ShipperID=%d",
				shipper.getName(), shipper.getPhone(), shipper.getId()));
			conn.close();
			
		}catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
