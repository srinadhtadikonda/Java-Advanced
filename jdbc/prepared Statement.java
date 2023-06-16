//program to insert record using Prepared Statement

import java.io.*;
import java.sql.*;

public class Irs
{
public static void main(String[] args) 
{
System.out.println("Insert records example using prepared statement!");
Connection con = null;
try
{
Class.forName("com.mysql.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demobase","root","brilliant");
try{
String sql = "INSERT into myemp VALUES(?,?,?,?)";
PreparedStatement prest = con.prepareStatement(sql);
BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter eno:");
int eno = Integer.parseInt(bf.readLine());
prest.setInt(1, eno);
System.out.println("Enter ename");
String ename=bf.readLine();
prest.setString(2, ename);
System.out.println("Enter esal");
int esal = Integer.parseInt(bf.readLine());
prest.setInt(3, esal);	
System.out.println("Enter egrade");
String egrade=bf.readLine();
prest.setString(4,egrade);
int count = prest.executeUpdate();
System.out.println(count + "row(s) affected");
con.close();
}
catch (SQLException s){
System.out.println(s);
}
}
catch (Exception e){
e.printStackTrace();
}
}
}
