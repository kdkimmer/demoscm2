<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import= "java.math.*, com.webwork.dataobjects.*, com.webwork.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Editing Shipper</title>
</head>
<body>
	<%
		//creating a query string using request object with parameter of ID
		String st = request.getParameter("id");
		if (st == null){
			//this.getServletContext().getRequestDispatcher("index.html").forward(request, response);
			response.sendRedirect("index.html");
		}
		else
		{
			Shipper s = DbReader.getShipper(Integer.parseInt(st));
	%>
		<form action= "saveShipper" method="post">
			<input type= "hidden" name= "id" value= "<%=s.getId() %>" />
			<label>Company Name:</label>
			<input type= "text" name= "companyName" value= "<%=s.getName() %>" /> <br />
			<label>Phone:</label>
			<input type= "text" name= "phone" value= "<%= s.getPhone() %>" />
			<input type= "submit" value= "Save Changes" />
		</form>
		
	<%
		}
	%>
</body>
</html>