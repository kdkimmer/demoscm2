<%@page import="com.webwork.*"%>
<%@ page import="java.math.BigDecimal, java.util.List, java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.webwork.dataobjects.Product"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="/WebWork/css/bootstrap.css" rel="stylesheet"/>
<link href="/WebWork/css/bootstrap-theme.css" rel="stylesheet"/>
<title>Insert title here</title>
</head>
<body>

	<div class= "navbar navbar-inverse" role="navigation">
	<a class="navbar-brand" href="#">Kimmmer's Product Store</a>
	</div>
	
	<div class="row panel">
	
		<div class="col-xs-3">
			
			</div>
			
			<div class= "col-xs-8">
			<div>
		<% 
			//Java Code
		int value = 27;
	
		//List<Products> products = new ArrayList<Products>();
		
		List<Product> products = DbReader.getAllProducts();
		
		//Product p = new Product();
		//p.setName("Four Roses");
		//p.setQuanityByUnit("12 bottles");
		//p.setUnitPrice(new BigDecimal(40));
		//products.add(p);
		
		//p = new Product();
		//p.setName("Widow Jane 8 Year");
		//p.setQuanityByUnit("12 bottles");
		//p.setUnitPrice(new BigDecimal(60));
		//products.add(p);
		
		for (int index = 0; index < products.size(); index++){
			Product p = products.get(index);
	%>
	
	<div class= "well">
	<h3><strong><%=p.getName()%></strong>
	<span class= "pull-right label label-primary"><%=p.getUnitPrice() %></span>
	</h3>
	<span class= "lead"><%=p.getQuanityByUnit() %></span>
	<h4><span class= "lead"> In Stock: <%=p.getUnitsInStock()%> </span></h4>
	</div>
		<%
		} 
		%>
			</div>
			</div>
</div>
</body>
</html>