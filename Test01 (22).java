import java.sql.*;
class Test28
{
public static void main(String args[])
{
try
{
Connection Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demobase","root","brilliant");
Statement stmt=Con.createStatement();
stmt.executeUpdate("insert into myemp values(102,'madhu',2560,'a')");
stmt.executeUpdate("insert into myemp values(111,'sarath',3570,'b')");
stmt.executeUpdate("insert into myemp values(104,'vinay',6793,'c')");
System.out.println("Record Inserted");
}
catch(Exception ex)
{
System.out.println(ex);
}
}
}

