package MVC;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.connector.Response;

@WebServlet("/MVCServlet")
public class MVCServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int N1=Integer.parseInt(req.getParameter("num1"));
		palin ob=new palin();
		boolean check=ob.disp(N1);
		String ans="ss";
		if(check) {
			ans="Palindrome";
			
		}
		else {
			ans="Not Palindrome";
		}
	HttpSession sc=req.getSession();
	sc.setAttribute("value",ans);
	RequestDispatcher dp=req.getRequestDispatcher("index.jsp");
	dp.forward(req, res);
	}

}
