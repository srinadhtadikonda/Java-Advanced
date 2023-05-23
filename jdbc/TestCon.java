//java program to test  connection

import java.sql.*;
import java.lang.*;
class TestCon
{
public static void main(String args[])
{
try
{
Connection Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demobase","root","brilliant");
System.out.println("Connection Success");
}catch(Exception ex)
{
System.out.println(ex);
}
}
}
