<%@page import="com.infinite.jdbc.EmployDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="AddEmploy.jsp">
<center>
Employ Name:
<input type="text" name="name"/>
Department:
<select name="dept">
<option value="detnet">Donet</option>
<option value="java">JAVA</option>
<option value="React">React</option>
<option value="Angular">Angular</option>
</select>
Designation:
<select name="design">
<option value="manager">Manager</option>
<option value="teamLead">teamLead</option>
<option value="SWE">SWE</option>
</select>
Basic:
<input type="number" name="basic"/>
<input type="submit" value="ADD EMPLOY"/>
</center>
</form>
<%
		if (request.getParameter("basic")!=null) {
			
			EmployDAO dao = new EmployDAO();
	%>
		<jsp:useBean id="beanEmploy" class="com.infinite.jdbc.Employ" scope="page" />
		<jsp:setProperty property="*" name="beanEmploy"/>
	<%=dao.addEmploy(beanEmploy) %>
	<%
		}
	%>
</body>
</html>