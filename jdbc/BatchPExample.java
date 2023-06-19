import java.sql.*;  
class BatchPExample
{  
public static void main(String args[])throws Exception
{  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demobase","root","brilliant");  
con.setAutoCommit(false);  
Statement stmt=con.createStatement();  
stmt.addBatch("insert into myemp values(190,'abhi',40000,'a')");  
stmt.addBatch("insert into myemp values(191,'umesh',50000,'b')");  
stmt.executeBatch();//executing the batch  
con.commit();  
con.close();  
}
}  