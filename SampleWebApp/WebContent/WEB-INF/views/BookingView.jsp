<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Enter Booking</h3>
       
      <p style="color: red;">${errorString}</p>
      
                                 
      <form method="POST" action="${pageContext.request.contextPath}/EnterBookingInfo">
         <table border="0">
            <tr>
            	
               <td>booking ID</td>
               <td><input type="text" name="bookingID" value="${booking.bookingID}" /></td>
            </tr>
            <tr>
               <td>Start Date</td>
               <td><input type="text" name="startDate" value="${booking.startDate}" /></td>
            </tr>

			<tr>
               <td>End Date</td>
               <td><input type="text" name="endDate" value="${booking.endDate}" /></td>
            </tr>
            <tr>
               <td>Sin</td>
               <td><input type="text" name="sin" value="${booking.sin}" /></td>
            </tr>
            <tr>
               <td>Room Number</td>
               <td><input type="text" name="roomNum" value="${booking.roomNum}" /></td>
            </tr>
            <tr>
               <td>Rent Status</td>
               <td><input type="text" name="phoneNumber" value="${booking.rented}" /></td>
            </tr>
            
            <tr>
               <td colspan="2">                   
                   <input type="submit" value="Submit" />
                   <a href="productList">Cancel</a>
               </td>
            </tr>
         </table>
      </form>

</body>
</html>