//program to display Records

import java.lang.*;
import java.sql.*;
class ListRec
{
public static void main(String args[])
{
try
{
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demobase","root","brilliant");
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery("select * from myemp");
while(rs.next())
{
System.out.print(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4));
System.out.println();
}
}catch(Exception ex)
{
System.out.println(ex);
}
}
}
