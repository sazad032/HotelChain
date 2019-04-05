package hotelchain.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hotelchain.beans.Hotel;
import hotelchain.beans.Room;
import hotelchain.utils.DBUtils;
import hotelchain.utils.MyUtils;

/**
 * Servlet implementation class ViewRooms
 */
@WebServlet("/ViewRooms")
public class ViewRooms extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewRooms() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection conn = MyUtils.getStoredConnection(request);
		 
        String hotelID = (String) request.getParameter("hotelID");
 
        String errorString = null;
		 
        List<Room> list = null;
        try {
            list = DBUtils.queryHotelRooms(conn, hotelID);
        } catch (SQLException e) {
            e.printStackTrace();
            errorString = e.getMessage();
        }
        // Store info in request attribute, before forward to views
        request.setAttribute("errorString", errorString);
        request.setAttribute("RoomList", list);
         
        // Forward to /WEB-INF/views/productListView.jsp
        RequestDispatcher dispatcher = request.getServletContext()
                .getRequestDispatcher("/WEB-INF/views/RoomView.jsp");
        dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
