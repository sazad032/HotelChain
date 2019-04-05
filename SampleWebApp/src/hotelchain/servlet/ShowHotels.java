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
import hotelchain.utils.DBUtils;
import hotelchain.utils.MyUtils;

/**
 * Servlet implementation class ShowHotels
 */
@WebServlet(urlPatterns = { "/ShowHotels" })
public class ShowHotels extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowHotels() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Connection conn = MyUtils.getStoredConnection(request);
				 
		        String name = (String) request.getParameter("name");
		 
		        String errorString = null;
				 
		        List<Hotel> list = null;
		        try {
		            list = DBUtils.querySameHotels(conn, name);
		        } catch (SQLException e) {
		            e.printStackTrace();
		            errorString = e.getMessage();
		        }
		        // Store info in request attribute, before forward to views
		        request.setAttribute("errorString", errorString);
		        request.setAttribute("hotelList", list);
		         
		        // Forward to /WEB-INF/views/productListView.jsp
		        RequestDispatcher dispatcher = request.getServletContext()
		                .getRequestDispatcher("/WEB-INF/views/hotelListView.jsp");
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
