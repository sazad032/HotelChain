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
               <td>Room Number</td>
               <td><input type="text" name="numRooms" value="${hotel.numRooms}" /></td>
            </tr>
            <tr>
               <td>Rating</td>
               <td><input type="text" name="rating" value="${hotel.rating}" /></td>
            </tr>
            <tr>
               <td>City</td>
               <td><input type="text" name="city" value="${hotel.city}" /></td>
            </tr>
            <tr>
               <td>Country</td>
               <td><input type="text" name="country" value="${hotel.country}" /></td>
            </tr>
            <tr>
               <td>Province</td>
               <td><input type="text" name="province" value="${hotel.province}" /></td>
            </tr>
            <tr>
               <td>Street Name</td>
               <td><input type="text" name="streetName" value="${hotel.streetName}" /></td>
            </tr>
            <tr>
               <td>Street Number</td>
               <td><input type="text" name="streetNumber" value="${hotel.streetNumber}" /></td>
            </tr>
            <tr>
               <td>Postal Code</td>
               <td><input type="text" name="postalCode" value="${hotel.postalCode}" /></td>
            </tr>
            <tr>
               <td>Phone Number</td>
               <td><input type="text" name="phoneNumber" value="${hotel.phoneNumber}" /></td>
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