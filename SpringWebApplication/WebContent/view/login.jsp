<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
          <%@taglib prefix="form"  uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="lightblue">
	<form:form action="logincust.do" modelAttribute="loginObj" method="GET">
		<h1> Name :	<form:input path="Uname" /></h1>
		<br>
		<h1> 	Password :<form:password path="password"/></h1>
		<br>	
			<input type="submit" value="register"/>
		</form:form> 

</body>
</html>