package Connection;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BO.RegistrationBO;
import DAO.RegistrationDAOImpl;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String m=request.getParameter("tf1");
		String m1=request.getParameter("tf2");
		RegistrationBO dao = new RegistrationDAOImpl();
		String pass = dao.getpasswordbyloginId(m);
		RequestDispatcher dispatcher=null;
		if(pass==null) {
			request.getSession().setAttribute("logstatus", "Invalid Credentials");
			 response.sendRedirect("login.jsp");
		}
		else { 
						if(pass.equals(m1) && pass!=null)
						{
							RegistrationDAOImpl regdao=new RegistrationDAOImpl();
							try {
								String name=regdao.fetch_name(m);
								System.out.println(name);
								request.setAttribute("username",name);
								dispatcher =request.getRequestDispatcher("home1.jsp");
								dispatcher.forward(request,response);
								
							} catch (SQLException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							//response.sendRedirect("home1.jsp");
						}
						else 
						{
							request.getSession().setAttribute("logstatus", "Invalid Credentials");
							response.sendRedirect("login.jsp");
							}
		}
		}
	

}