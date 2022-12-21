import java.sql.*;

class Test25
{
public static void main(String args[])
{
try
{
Connection Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demobase");
System.out.println("Connection Success");
}
catch(Exception ex)
{
System.out.println(ex);
}
}
}

