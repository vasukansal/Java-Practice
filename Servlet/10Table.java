

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class demo69
 */
public class demo69 extends HttpServlet {
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		int n=Integer.parseInt(req.getParameter("num1"));
		PrintWriter out=res.getWriter();
		for(int i=1;i<=10;i++) {
			out.println(n*i);
		}
	}
}
