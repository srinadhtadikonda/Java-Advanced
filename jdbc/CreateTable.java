//Program to create  a table

import java.sql.*;

class 
{
public static void main(String args[])
{
try
{
Connection Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demobase",user="root",passwd="brilliant");
Statement stmt=Con.createStatement();
stmt.executeUpdate("create table myemp(eno int primary key,ename char(20),esal int,egrade char(3))");
System.out.println("table created");
}
catch(Exception ex)
{
System.out.println(ex);
}
}
}
