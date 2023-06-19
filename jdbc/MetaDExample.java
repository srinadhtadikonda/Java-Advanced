import java.sql.*;  
class MetaDExample
{  
public static void main(String args[])throws Exception
{
try
{  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demobase","root","brilliant");
DatabaseMetaData dbmd=con.getMetaData();  
System.out.println("Driver Name: "+dbmd.getDriverName());  
System.out.println("Driver Version: "+dbmd.getDriverVersion());  
System.out.println("UserName: "+dbmd.getUserName());  
System.out.println("Database Product Name: "+dbmd.getDatabaseProductName());  
System.out.println("Database Product Version: "+dbmd.getDatabaseProductVersion());  
con.close();  
}catch(Exception e)
{ 
System.out.println(e);
}  
}  
}  
  