import java.sql.*;
import java.lang.*;
class Test32
{
public static void main(String args[])
{
try
{
Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/demobase","root","brilliant");
Statement stmt = conn.createStatement();
conn.setAutoCommit(false);
stmt.addBatch("insert into myemp values(190,'abhi',40000,'a')");  
stmt.addBatch("insert into myemp values(191,'umesh',50000,'b')");  
stmt.executeBatch();//executing the batch  
conn.commit();
System.out.println("ok");
}catch(Exception ex)
{	
System.out.println(ex);
}
}
}
