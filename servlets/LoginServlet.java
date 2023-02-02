import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet{
  public void doGet(HttpServletRequest request,
  HttpServletResponse response)
  throws ServletException, IOException {
  response.setContentType("text/html");
  PrintWriter out = response.getWriter();
  String name = request.getParameter("username");
  String pass = request.getParameter("password");
  out.println("<html>");
  out.println("<body>");
  out.println("Thanks  Mr." + "  " + name + "  " 
  + "for visiting roseindia<br>" );
  out.println("Now you can see your password : " 
  + "  " + pass + "<br>");
  out.println("</body></html>");
  }
}
