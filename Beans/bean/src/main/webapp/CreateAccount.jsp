<%@page import="com.infinite.jdbcbank.BankDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
<form method="get" action="CreateAccount.jsp">
<center>
First Name:
<input type="text" name="firstName"/><br/>
Last Name:
<input type="text" name="lastName"/><br/>
City:
<input type="text" name="city"/><br/>
State:
<input type="text" name="state"/><br/>
Amount:
<input type="number" name="amount"/><br/>
Cheq facil:
<input type="text" name="cheqFacil"/><br/>
Account type:
<input type="text" name="accountType"/><br/>
<input type="submit" value="CreateAccount"/>
</center>
</form>
<%
		if (request.getParameter("amount")!=null) {
			
			BankDAO dao = new BankDAO();
	%>
		<jsp:useBean id="beanBank" class="com.infinite.jdbcbank.Bank" scope="page" />
		<jsp:setProperty property="*" name="beanBank"/>
	<%=dao.createAccount(beanBank) %>
	<%
		}
	%>
</body>
</html>