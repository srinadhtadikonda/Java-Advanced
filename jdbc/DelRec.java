//program to delete a record

import java.sql.*;
class DelRec
{
public static void main(String args[])
{
try
{
Connection Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demobase","root","brilliant");
Statement stmt=Con.createStatement();
stmt.executeUpdate("delete from myemp where eno=101");
System.out.println("Records Deleted");
}catch(Exception ex)
{
System.out.println(ex);
}
}
}
