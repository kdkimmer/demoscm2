package com.webwork;

import java.sql.ResultSet;
import java.sql.SQLException;
import com.webwork.dataobjects.Product;

public class ProductReader implements ObjectReader<Product> {

	@Override
	public Product readFromResultSet(ResultSet rs) {
		
		Product p = null;
		
		try 
		{
			p = new Product();
			p.setId(rs.getInt("ProductId"));
			p.setName(rs.getString("ProductName"));
			p.setSupplierId(rs.getInt("SupplierID"));
			p.setCategoryId(rs.getInt("CategoryID"));
			p.setUnitsInStock(rs.getInt("UnitsInStock"));
			p.setUnitsOnOrder(rs.getInt("UnitsOnOrder"));
			p.setDiscontinued(rs.getInt("Discontinued"));
			p.setQuanityByUnit(rs.getString("QuantityPerUnit"));
			p.setUnitPrice(rs.getBigDecimal("UnitPrice"));
			
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
			p = null;
		}
		
		return p;
	}
}
