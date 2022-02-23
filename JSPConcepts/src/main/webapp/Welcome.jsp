<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to Jsp concepts!</h1>
	<%
	out.print("Today is:" + java.util.Calendar.getInstance().getTime());
	%><br>

	<%
	String name = request.getParameter("username");
	out.print("Hi! " + name);
	%><br>

	<%
// 		response.sendRedirect("https://www.evoketechnologies.com/");
	%><br>

	<%
	String name1 = request.getParameter("username");

	String driver = config.getInitParameter("name1");
	out.print("driver name is : " + driver);
	%><br>
	
	<%
	String name2 = request.getParameter("username");

	String driver1 = application.getInitParameter("name2");
	out.print("driver name is : " + driver1);
	%>
</body>
</html>