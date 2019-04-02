<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
 <head>
    <meta charset="UTF-8">
    <title>Room List</title>
 </head>
 <body>
 
    <jsp:include page="_header.jsp"></jsp:include>
    <jsp:include page="_menu.jsp"></jsp:include>
 
    <h3>Hotel List</h3>
 
    <p style="color: red;">${errorString}</p>
 
    <table border="1" cellpadding="5" cellspacing="1" >
       <tr>
          <th>Room_NUM</th>
          <th>PRICE</th>
          <th>VIEW</th>
          <th>EXTENDABLE</th>
          <th>CAPACITY</th>
          <th>DAMAGES</th>
          <th>HOTEL_ID</th>

       </tr>
       <c:forEach items="${RoomList}" var="Room" >
          <tr>

             <td>${Room.roomNum}</td>
             <td>${Room.price}</td>
             <td>${Room.view}</td>
             <td>${Room.extendable}</td>
             <td>${Room.capacity}</td>
             <td>${Room.damages}</td>
             <td>${Room.hotelID}</td>
             

          </tr>
       </c:forEach>
    </table>
 
 
    <jsp:include page="_footer.jsp"></jsp:include>
 
 </body>
</html>