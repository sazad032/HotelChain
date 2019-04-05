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
import javax.servlet.http.HttpSession;

import hotelchain.beans.Customer;
import hotelchain.beans.Employee;
import hotelchain.utils.DBUtils;
import hotelchain.utils.MyUtils;

/**
 * Servlet implementation class EmployeeLogInServlet
 */
@WebServlet(urlPatterns = { "/EmployeeLogInServlet" })
public class EmployeeLogInServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeLogInServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("GETTING EMPLOYEE");
        RequestDispatcher dispatcher //
                = this.getServletContext().getRequestDispatcher("/WEB-INF/views/EmployeeLogIn.jsp");
 
        dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("IN THE POST");
        String userName = request.getParameter("userName");
        String sin = request.getParameter("sin");
        System.out.println("password as SIN number" + sin);
        String rememberMeStr = request.getParameter("rememberMe");
        boolean remember = "Y".equals(rememberMeStr);
 
        Employee user = null;
        boolean hasError = false;
        String errorString = null;
 
        if (userName == null || sin == null || userName.length() == 0 || sin.length() == 0) {
            hasError = true;
            errorString = "Required username and SIN number!";
        } else {
            Connection conn = MyUtils.getStoredConnection(request);
            try {
                // Find the user in the DB.
                user = DBUtils.findEmployee(conn, userName);
 
                if (user == null) {
                    hasError = true;
                    errorString = "User Name or SIN invalid";
                }
            } catch (SQLException e) {
                e.printStackTrace();
                hasError = true;
                errorString = e.getMessage();
            }
        }
        // If error, forward to /WEB-INF/views/login.jsp
        if (hasError) {
            user = new Employee();
            user.setName(userName);
            user.setSin(sin);
 
            // Store information in request attribute, before forward.
            request.setAttribute("errorString", errorString);
            request.setAttribute("user", user);
 
            // Forward to /WEB-INF/views/login.jsp
            RequestDispatcher dispatcher //
                    = this.getServletContext().getRequestDispatcher("/WEB-INF/views/EmployeeLoginView.jsp");
 
            dispatcher.forward(request, response);
        }
        // If no error
        // Store user information in Session
        // And redirect to userInfo page.
        else {
            HttpSession session = request.getSession();
            System.out.println("BEFORE CACHING");
            MyUtils.storeLoginedEmployee(session, user);
 
            // If user checked "Remember me".
            if (remember) {
                MyUtils.storeEmployeeCookie(response, user);
            }
            // Else delete cookie.
            else {
                MyUtils.deleteUserCookie(response);
            }
            System.out.println("Almost There");
            // Redirect to userInfo page.
            response.sendRedirect(request.getContextPath() + "/EmployeeInfo");
        }
    }

}
