<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 <head>
    <meta charset="UTF-8">
    <title>User Info</title>
 </head>
 <body>
 
    <jsp:include page="_header.jsp"></jsp:include>
    <jsp:include page="_menu.jsp"></jsp:include>
 
    <h3>Hello: ${user.name}</h3>
 
    User Name: <b>${user.name}</b>
    |
 	<a href="${pageContext.request.contextPath}/HotelChain">Hotel Chain</a>
    <jsp:include page="_footer.jsp"></jsp:include>
 
 </body>
</html>