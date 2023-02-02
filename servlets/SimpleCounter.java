import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SimpleCounter extends HttpServlet{
  int counter = 0;
  public void doGet(HttpServletRequest request, HttpServletResponse
    response)throws ServletException, IOException {
  response.setContentType("text/html");
  PrintWriter pw = response.getWriter();
  counter++;
  pw.println("At present the value of the counter is " + counter);
  }
}
