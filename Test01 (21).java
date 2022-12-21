import java.sql.*;
class Test27
{
public static void main(String args[])
{
try
{
Connection Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demobase","root","brilliant");
Statement stmt=Con.createStatement();
stmt.executeUpdate("insert into myemp values(101,'raj',2500,'a')");
System.out.println("Record Inserted");
}
catch(Exception ex)
{
System.out.println(ex);
}
}
}

