<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
 <head>
    <meta charset="UTF-8">
    <title>Hotel List</title>
 </head>
 <body>
 
    <jsp:include page="_header.jsp"></jsp:include>
    <jsp:include page="_menu.jsp"></jsp:include>
 
    <h3>Hotel List</h3>
 
    <p style="color: red;">${errorString}</p>
 
    <table border="1" cellpadding="5" cellspacing="1" >
       <tr>
          <th>Name</th>
          <th>HOTEL_ADDRESS</th>
          <th>NUM_HOTELS</th>
          <th>EMAIL_ADDRESS</th>
          <th>PHONE_NUMBER</th>
          <th>View Hotels</th>

       </tr>
       <c:forEach items="${hotelChainList}" var="hotelChain" >
          <tr>

             <td>${hotelChain.name}</td>
             <td>${hotelChain.hotelAddress}</td>
             <td>${hotelChain.numHotels}</td>
             <td>${hotelChain.emailAddress}</td>
             <td>${hotelChain.phoneNumbers}</td>
             <td>
                <a href="ShowHotels?name=${hotelChain.name}">View</a>
             </td>        

          </tr>
       </c:forEach>
    </table>
 
 
    <jsp:include page="_footer.jsp"></jsp:include>
 
 </body>
</html>