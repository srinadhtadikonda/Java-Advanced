import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
public class DDate extends HttpServlet
{
   public void doGet(HttpServletRequest request, HttpServletResponse
  response) throws ServletException, IOException
{
  PrintWriter pw = response.getWriter();
  Date today = new Date();
  pw.println("<html>"+"<body><h1>Today Date is</h1>");
  pw.println("<b>"+ today+"</b></body>"+ "</html>");
  }
}

