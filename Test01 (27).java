import java.io.*;
import java.sql.*;

class Test33
{
	public static void main(String[] args) {
		System.out.println("Insert records example using prepared statement!");
		Connection con = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demobase","root","brilliant");
			try{
				String sql = "INSERT into myemp VALUES(?,?,?,?)";
				PreparedStatement prest = con.prepareStatement(sql);
				BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
				System.out.print("Enter eno:");
				int eno = Integer.parseInt(bf.readLine());
				prest.setInt(1, eno);
				System.out.print("Enter ename");
				String ename=bf.readLine();
				prest.setString(2, ename);

				System.out.print("Enter esal");
				int esal = Integer.parseInt(bf.readLine());
				prest.setInt(3, esal);	
				System.out.print("Enter egrade");
				String egrade=bf.readLine();
				prest.setString(4,egrade);
		
				int count = prest.executeUpdate();
				System.out.println(count + "row(s) affected");
				con.close();
			}
			catch (SQLException s){
				System.out.println("SQL statement is not executed!");
			}
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
}