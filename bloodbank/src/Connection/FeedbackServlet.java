package Connection;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.DonationDAOImpl;
import Model.BloodDonation;

/**
 * Servlet implementation class FeedbackServlet
 */
public class FeedbackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FeedbackServlet() {
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
		// TODO Auto-generated method stub
		String hn=request.getParameter("tf1");
		String ct=request.getParameter("tf2");
		String fb=request.getParameter("tf3");
		 
	BloodDonation obj=new BloodDonation(hn, ct, fb);
	 DonationDAOImpl dao=new DonationDAOImpl();
	 dao.feedback(obj);
	 PrintWriter out=response.getWriter();
	 out.println("<html><head></head><body><center><font color=#1589FF><font size=5>Thank you for Sharing your Feedback</font></font></center></body></html>");
	 out.println("<html><head></head><body><div align=\"right\">\r\n" + 
		 		" <a href=\"home1.jsp\"><img src=top2.jpg style=\"width:5%\" ></a></div></body></html> ");
	 System.out.println("success");
		
	
	}

}