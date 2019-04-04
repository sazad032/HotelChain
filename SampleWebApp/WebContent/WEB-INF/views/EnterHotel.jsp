<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<!DOCTYPE html>
<html>
   <head>
      <meta charset="UTF-8">
      <title>Enter Hotel</title>
   </head>
   <body>
    
      <jsp:include page="_header.jsp"></jsp:include>
      <jsp:include page="_menu.jsp"></jsp:include>
       
      <h3>Enter Hotel</h3>
       
      <p style="color: red;">${errorString}</p>
      
       

                                 
      <form method="POST" action="${pageContext.request.contextPath}/EnterHotel">
         <table border="0">
            <tr>
               <td>Hotel ID</td>
               <td><input type="text" name="hotelID" value="${hotel.hotelID}" /></td>
            </tr>
            <tr>
               <td>Email Address</td>
               <td><input type="text" name="email_Address" value="${hotel.email_Address}" /></td>
            </tr>

			<tr>
               <td>Number of Rooms</td>
               <td><input type="text" name="numRooms" value="${hotel.numRooms}" /></td>
            </tr>
            <tr>
               <td>Rating</td>
               <td><input type="text" name="rating" value="${hotel.rating}" /></td>
            </tr>
            <tr>
               <td>Hotel Address</td>
               <td><input type="text" name="hotel_address" value="${hotel.hotel_address}" /></td>
            </tr>
            <tr>
               <td>Phone Number</td>
               <td><input type="text" name="phoneNumber" value="${hotel.phoneNumber}" /></td>
            </tr>
            <tr>
               <td>Hotel Name</td>
               <td><input type="text" name="hotel_name" value="${hotel.hotel_name}" /></td>
            </tr>
            <tr>
               <td colspan="2">                   
                   <input type="submit" value="Submit" />
                   <a href="productList">Cancel</a>
               </td>
            </tr>
         </table>
      </form>
       
      <jsp:include page="_footer.jsp"></jsp:include>
       
   </body>
</html>