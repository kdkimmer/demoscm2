package com.webwork;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.webwork.dataobjects.*;

public class ShipperReader implements ObjectReader<Shipper>{

	@Override
	public Shipper readFromResultSet(ResultSet rs) {

		Shipper s = null;
		
		try 
		{
			s = new Shipper();
			s.setId(rs.getInt("ShipperId"));
			s.setName(rs.getString("CompanyName"));
			s.setPhone(rs.getString("Phone"));
			
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
			s = null;
		}
		
		return s;
	}
	

}
