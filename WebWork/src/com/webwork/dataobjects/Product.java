package com.webwork.dataobjects;


import java.math.*;

public class Product {

	private int Id;
	private String name;
	private int supplierId;
	private int categoryId;
	private int unitsInStock;
	private int unitsOnOrder;
	private int discontinued;
	private String quanityByUnit;
	private BigDecimal unitPrice;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public int getUnitsInStock() {
		return unitsInStock;
	}
	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}
	public int getUnitsOnOrder() {
		return unitsOnOrder;
	}
	public void setUnitsOnOrder(int unitsOnOrder) {
		this.unitsOnOrder = unitsOnOrder;
	}
	public int getDiscontinued() {
		return discontinued;
	}
	public void setDiscontinued(int discontinued) {
		this.discontinued = discontinued;
	}
	public String getQuanityByUnit() {
		return quanityByUnit;
	}
	public void setQuanityByUnit(String quanityByUnit) {
		this.quanityByUnit = quanityByUnit;
	}
	public BigDecimal getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}
	
}
