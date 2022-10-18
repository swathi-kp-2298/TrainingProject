<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="bean1" class="com.infinite.hib.AgentDAO"/>
	<c:forEach var="agent" items="${bean1.showAgent()}">
		<tr>
			<td>${agent.agentId}</td>
			</tr>
			<tr>
			<td>${agent.name}</td>
			</tr>
			<tr>
			<td>${agent.city}</td>
			</tr>
			<tr>   
			<td>${agent.gender}</td>
			</tr>
			<tr>
			<td>${agent.premium}</td>
		</tr>
	</c:forEach>
</body>
</html>