
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class TestCon extends HttpServlet
{
  public void doGet(HttpServletRequest request, HttpServletResponse 
  response)throws  ServletException, IOException{
  response.setContentType("text/html");
  PrintWriter pw = response.getWriter();
  String connectionURL = "jdbc:mysql://localhost/demobase";
   try{
  Class.forName("org.gjt.mm.mysql.Driver");
 Connection con=DriverManager.getConnection(connectionURL,"root", "brilliant");
  pw.println("COnnection Success");
    }
  catch(Exception e){
  pw.println("The exception is " + e);
  }
  }
}
