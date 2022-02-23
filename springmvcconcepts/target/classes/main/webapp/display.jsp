<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body >
	<h3>Welcome message is : ${message}</h3>
<%-- 	<h2>print message :${today}</h2> --%>
	<%=request.getAttribute("today") %>
	<a href="https://www.evoketechnologies.com/">Evoke Technologies</a>
</body>

</html>
