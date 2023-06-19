import java.sql.*;  
class MetaDExample1
{  
public static void main(String args[])throws Exception
{
try
{  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demobase","root","brilliant");
DatabaseMetaData dbmd=con.getMetaData();  
String table[]={"TABLE"};  
ResultSet rs=dbmd.getTables(null,null,null,table);  
  
while(rs.next()){  
System.out.println(rs.getString(3));  
}  
  
con.close();  
  
}catch(Exception e){ System.out.println(e);}  
  
}  
} 