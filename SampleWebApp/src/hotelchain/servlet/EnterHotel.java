package hotelchain.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hotelchain.beans.Hotel;
import hotelchain.beans.Product;
import hotelchain.utils.DBUtils;
import hotelchain.utils.MyUtils;

/**
 * Servlet implementation class EnterHotel
 */
@WebServlet(urlPatterns = { "/EnterHotel" })
public class EnterHotel extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EnterHotel() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub		
		
		RequestDispatcher dispatcher = request.getServletContext()
                .getRequestDispatcher("/WEB-INF/views/EnterHotel.jsp");
        dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection conn = MyUtils.getStoredConnection(request);
        
        String hotelID = (String) request.getParameter("hotelID");
        System.out.println("Hotel " + hotelID);
        String email_Address = (String) request.getParameter("email_Address");
        System.out.println("EMAI:");
        
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
        Hotel hotel = new Hotel(hotelID, email_Address, numRooms, rating, hotel_address, phoneNumber, hotel_name);
        String errorString = null;
 
        // Product ID is the string literal [a-zA-Z_0-9]
        // with at least 1 character
        String regex = "\\w+";
        
        if (hotelID == null || !hotelID.matches(regex)) {
            errorString = "Product Code invalid!";
        }
 
        if (errorString == null) {
            try {
                DBUtils.insertHotel(conn, hotel);
            } catch (SQLException e) {
                e.printStackTrace();
                errorString = e.getMessage();
            }
        }
 
        // Store infomation to request attribute, before forward to views.
        request.setAttribute("errorString", errorString);
        request.setAttribute("hotel", hotel);
        
     // If error, forward to Edit page.
        if (errorString != null) {
            RequestDispatcher dispatcher = request.getServletContext()
                    .getRequestDispatcher("/WEB-INF/views/EnterHotel.jsp");
            dispatcher.forward(request, response);
        }
        
        // If everything nice.
        // Redirect to the product listing page.
        else {
        	System.out.println("GETS HERER");
            response.sendRedirect(request.getContextPath() + "/HotelListServlet");
        }
	}

}
