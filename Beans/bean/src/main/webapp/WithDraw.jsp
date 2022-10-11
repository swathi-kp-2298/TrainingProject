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
<form method="get" action="WithDraw.jsp">
<center>
Account Number:
<input type="number" name="accountNo"/><br/>
WithDraw Amount:
<input type="number" name="depositamount"/><br/>

<input type="submit" value="Deposit"/>
</center>
</form>
<%
		if (request.getParameter("depositamount")!=null) {
			
			BankDAO dao = new BankDAO();
	%>
		<jsp:useBean id="beanBank" class="com.infinite.jdbcbank.Trans" scope="page" />
		<jsp:setProperty property="*" name="beanBank"/>
		
	<%=dao.withdrawAccount(beanBank.getAccountNo(),beanBank.getDepositamount())%>
	<%
		}
	%>
</body>
</html>