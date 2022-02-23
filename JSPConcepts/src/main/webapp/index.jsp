<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to Java Server Page</h1>
	<%!int var = 10;%>
	<%!int var1 = 10;%>
	<%!int num1 = var * var1;%>
	<%
	out.print("result is : "+2 * 5);
	%><br>
	<%-- 	<% --%>
	<!-- 	 out.print(num1); -->
	<%-- 	%> --%>
	<%="value of num1: " + num1%>
</body>
</html>