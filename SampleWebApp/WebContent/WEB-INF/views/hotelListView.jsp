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
          <th>HOTEL_ID</th>
          <th>EMAIL_ADDRESS</th>
          <th>NUM_ROOMS</th>
          <th>RATING</th>
          <th>HOTEL_ADDRESS</th>
          <th>HOTEL_NAME</th>
          <th>PHONE_NUMBERS</th>
          <th>ROOMS</th>
       </tr>
       

       <c:forEach items="${hotelList}" var="hotel" >
          <tr>
             <td>${hotel.hotelID}</td>
             <td>${hotel.email_Address}</td>
             <td>${hotel.numRooms}</td>
             <td>${hotel.rating}</td>
             <td>${hotel.hotel_address}</td>
             <td>${hotel.hotel_name}</td>
             <td>${hotel.phoneNumbers}</td>
             <td>
                <a href="ViewRooms?hotelID=${hotel.hotelID}">VIEW ROOMS</a>
             </td> 
        

          </tr>
       </c:forEach>
    </table>
 
 	<a href="EnterHotel" >Enter New Hotel Info</a>
    <jsp:include page="_footer.jsp"></jsp:include>
 
 </body>
</html>