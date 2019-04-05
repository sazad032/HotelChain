package hotelchain.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hotelchain.beans.Booking;
import hotelchain.beans.Hotel;
import hotelchain.utils.DBUtils;
import hotelchain.utils.MyUtils;

/**
 * Servlet implementation class EnterBookingInfo
 */
@WebServlet("/EnterBookingInfo")
public class EnterBookingInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EnterBookingInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = request.getServletContext()
                .getRequestDispatcher("/WEB-INF/views/BookingView.jsp");
        dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection conn = MyUtils.getStoredConnection(request);
        

        String bookingID = (String) request.getParameter("bookingID");
        System.out.println("Booking " + bookingID);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		java.util.Date date;
		try {
			date = sdf.parse(request.getParameter("startDate"));
			java.sql.Date sqlDate = new Date(date.getTime());
			System.out.println("sqk date" + sqlDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
        Date startDate = Date.valueOf(request.getParameter("startDate"));
        Date endDate = Date.valueOf(request.getParameter("startDate"));
        String sin = (String) request.getParameter("bookingID");
        System.out.println("sin");
        
        /*
        String numRoomStr = (String) request.getParameter("numRooms");
        int numRooms = 0;
        try {
            numRooms = Integer.parseInt(numRoomStr);
        } catch (Exception e) {
        }
        
        String ratingStr = (String) request.getParameter("rating");
        float rating = 0;
        try {
            rating = Float.parseFloat(ratingStr);
        } catch (Exception e) {
        }
        
        System.out.println("Rating " + rating);

        String hotel_address = (String) request.getParameter("hotel_address");
        String phoneNumber = (String) request.getParameter("phoneNumber");
        String hotel_name = (String) request.getParameter("hotel_name");
        /*float price = 0;
        try {
            price = Float.parseFloat(priceStr);
        } catch (Exception e) {
        }
        Product product = new Product(code, name, price);
 		*/
        Booking booking = new Booking();
        booking.setBookingID(bookingID);
        booking.setStartDate(startDate);
        booking.setEndDate(endDate);
        booking.setSin(sin);
        
        System.out.println("THIS IS SETTING THE SIN " + booking.getSin());
 
        // Product ID is the string literal [a-zA-Z_0-9]
        // with at least 1 character
        String regex = "\\w+";
        
        /*if (hotelID == null || !hotelID.matches(regex)) {
            errorString = "Product Code invalid!";
        }
 
        if (errorString == null) {
            try {
                DBUtils.insertHotel(conn, hotel);
            } catch (SQLException e) {
                e.printStackTrace();
                errorString = e.getMessage();
            }
        }*/
 
        // Store infomation to request attribute, before forward to views.
        //request.setAttribute("errorString", errorString);
        request.setAttribute("booking", booking);
        
     // If error, forward to Edit page.
        /*if (errorString != null) {
            RequestDispatcher dispatcher = request.getServletContext()
                    .getRequestDispatcher("/WEB-INF/views/EnterHotel.jsp");
            dispatcher.forward(request, response);
        }
        
        // If everything nice.
        // Redirect to the product listing page.
        else {
        	System.out.println("ALL THE WAY HERE");
            response.sendRedirect(request.getContextPath() + "/ViewRooms");
        }*/
        System.out.println("ALL THE WAY HERE");
        response.sendRedirect(request.getContextPath() + "/ViewRooms");
	}

}
