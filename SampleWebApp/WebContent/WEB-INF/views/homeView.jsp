<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
     <meta charset="UTF-8">
     <title>Home Page</title>
  </head>
  <body>
 
     <!-- <jsp:include page="_header.jsp"></jsp:include>-->
     <!-- <jsp:include page="_menu.jsp"></jsp:include> -->
    
      <h3>Home Page</h3>
      
      <b>It includes the following functions:</b>
      <ul>
         <li><a href="${pageContext.request.contextPath}/login">Customer Login</a></li>
         <li><a href="${pageContext.request.contextPath}/EmployeeLogInServlet">Employee Login</a></li>

      </ul>
 
     <jsp:include page="_footer.jsp"></jsp:include>
 
  </body>
</html>