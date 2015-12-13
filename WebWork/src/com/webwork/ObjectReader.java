package com.webwork;

import java.sql.ResultSet;

//Interface is always generic.

public interface ObjectReader<T> {
	
	T readFromResultSet (ResultSet rs) throws Exception;
	

}
