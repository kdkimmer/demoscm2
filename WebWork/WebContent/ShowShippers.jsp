<%@page import="com.webwork.*,com.webwork.dataobjects.Shipper"%>
<%@ page import="java.math.BigDecimal, java.util.List, java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="/WebWork/css/bootstrap.css" rel="stylesheet"/>
<link href="/WebWork/css/bootstrap-theme.css" rel="stylesheet"/>
<title>The Shippers</title>
</head>
<body>

	<div class= "navbar navbar-inverse" role="navigation">
	<a class="navbar-brand" href="#">Kimmmer's Shippers</a>
	</div>
	
	<div class="row panel">
	
		<div class="col-xs-3">
			SideBar
			</div>
			
			<div class= "col-xs-8">
			<div>
		<% 
			//Java Code
			int value = 27;
		
			List<Shipper> shippers = DbReader.getAllShippers();
		
			for (int index = 0; index < shippers.size(); index++){
				Shipper s = shippers.get(index);
		%>
	
		<div class= "well">
		<h3><strong><%=s.getName()%></strong>
		<span class= "pull-right label label-primary"><%=s.getPhone() %></span>
		</h3>
		<a href= "EditShipper.jsp?id=<%=s.getId()%>">Edit</a>
		</div>
		<%
			} 
		%>
		</div>
		</div>
</div>
</body>
</html>