<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<form method="post" action="login.jsp">
UserName:
<input type="text" name="userName"/><br/>
PassWord:
<input type="text" name="passWord"/><br/>
<input type="submit" value="Login"/>
</form>
</center>

<c:if test="${param.userName !=null &&param.passWord!=null }">
<jsp:useBean id="beanLibUsers" class="com.infinite.LibraryHib.LibUsers"/>
<jsp:setProperty property="*" name="beanLibUsers"/>
<jsp:useBean id="beanDAO" class="com.infinite.LibraryHib.LibraryDAO"/>
<c:set var="user" value="${param.userName}"/>
<c:set var="pwd" value="${param.passWord}"/>
<c:set var="count" value="${beanDAO.loginCheck(user,pwd)}"/>
<c:if test="${count==1}">
		<c:set var="user" value="${user}" scope="session" />
			<jsp:forward page="Menu.jsp"/>
		</c:if>
		<c:if test="${count==0}">
			<c:out value="Invalid Credentials..."/>
		</c:if>
</c:if>
</body>
</html>