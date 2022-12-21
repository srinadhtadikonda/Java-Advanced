import java.sql.*;
class Test30
{
public static void main(String args[])
{
try
{
Connection Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demobase","root","brilliant");
Statement stmt=Con.createStatement();
stmt.executeUpdate("update myemp set esal=esal+100 where egrade='a'");
System.out.println("Records Updated");
}catch(Exception ex)
{
System.out.println(ex);
}
}
}

