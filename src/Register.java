
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Register() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String middleName = request.getParameter("middleName");
		String password = request.getParameter("password");
		String confirmPassword = request.getParameter("confirmPassword");
		String mobile = request.getParameter("mobile");
		String email = request.getParameter("email");

		if (mobile.matches("\\d{10}")) {
			if (email.matches(
					"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")) {
				if (password.matches("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})")
						&& confirmPassword.equals(password)) {
					if (firstName.equals("Sai") && lastName.equals("Latha") && middleName.equals("Sri")) {
						response.sendRedirect("index.jsp");
					} else {
						request.setAttribute("ErrorMessage", "Please Enter Proper Names");
						RequestDispatcher dispatcher = request.getRequestDispatcher("Error.jsp");
						dispatcher.forward(request, response);
					}
				} else {
					request.setAttribute("ErrorMessage",
							"Please Enter Proper Password and make sure that password and confirm password are same");
					RequestDispatcher dispatcher = request.getRequestDispatcher("Error.jsp");
					dispatcher.forward(request, response);
				}
			} else {
				request.setAttribute("ErrorMessage", "Please Enter Proper Email Address");
				RequestDispatcher dispatcher = request.getRequestDispatcher("Error.jsp");
				dispatcher.forward(request, response);
			}

		} else {
			request.setAttribute("ErrorMessage", "Please Enter Proper Mobile Number");
			RequestDispatcher dispatcher = request.getRequestDispatcher("Error.jsp");
			dispatcher.forward(request, response);
		}
	}
}
