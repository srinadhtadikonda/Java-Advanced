import java.sql.*;
import java.util.Scanner;

public class PreparedStatementSelectExample {
    public static void main(String[] args) {
        // JDBC URL, username, password (adjust as per your DB)
        String url = "jdbc:mysql://localhost:3306/yourdbname"; 
        String user = "yourusername";
        String password = "yourpassword";

        // SQL query with placeholder
        String sql = "SELECT eno, ename, esal, egrade FROM myemp WHERE eno = ?";

        try (
            Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement pstmt = conn.prepareStatement(sql);
            Scanner sc = new Scanner(System.in);
        ) {
            // Get input from keyboard
            System.out.print("Enter Employee Number (eno): ");
            int eno = sc.nextInt();

            // Set parameter
            pstmt.setInt(1, eno);

            // Execute query
            ResultSet rs = pstmt.executeQuery();

            // Check and display result
            if (rs.next()) {
                System.out.println("Employee Details:");
                System.out.println("Eno    : " + rs.getInt("eno"));
                System.out.println("Ename  : " + rs.getString("ename"));
                System.out.println("Esal   : " + rs.getDouble("esal"));
                System.out.println("Egrade : " + rs.getString("egrade"));
            } else {
                System.out.println("No record found for eno: " + eno);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}




import java.sql.*;
import java.util.Scanner;

public class PreparedStatementDeleteExample {
    public static void main(String[] args) {
        // JDBC URL, username, password (adjust as per your DB)
        String url = "jdbc:mysql://localhost:3306/yourdbname"; 
        String user = "yourusername";
        String password = "yourpassword";

        // SQL Delete query
        String sql = "DELETE FROM myemp WHERE eno = ?";

        try (
            Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement pstmt = conn.prepareStatement(sql);
            Scanner sc = new Scanner(System.in);
        ) {
            // Take eno input from keyboard
            System.out.print("Enter Employee Number (eno) to delete: ");
            int eno = sc.nextInt();

            // Set parameter
            pstmt.setInt(1, eno);

            // Execute delete
            int rowsDeleted = pstmt.executeUpdate();

            if (rowsDeleted > 0) {
                System.out.println("Record deleted successfully for eno: " + eno);
            } else {
                System.out.println("No record found for eno: " + eno);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}




import java.sql.*;
import java.util.Scanner;

public class PreparedStatementUpdateExample {
    public static void main(String[] args) {
        // JDBC URL, username, password (adjust as per your DB)
        String url = "jdbc:mysql://localhost:3306/yourdbname"; 
        String user = "yourusername";
        String password = "yourpassword";

        // SQL Update query
        String sql = "UPDATE myemp SET ename = ?, esal = ?, egrade = ? WHERE eno = ?";

        try (
            Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement pstmt = conn.prepareStatement(sql);
            Scanner sc = new Scanner(System.in);
        ) {
            // Take input from keyboard
            System.out.print("Enter Employee Number (eno) to update: ");
            int eno = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Enter New Employee Name: ");
            String ename = sc.nextLine();

            System.out.print("Enter New Employee Salary: ");
            double esal = sc.nextDouble();
            sc.nextLine(); // consume newline

            System.out.print("Enter New Employee Grade: ");
            String egrade = sc.nextLine();

            // Set parameters
            pstmt.setString(1, ename);
            pstmt.setDouble(2, esal);
            pstmt.setString(3, egrade);
            pstmt.setInt(4, eno);

            // Execute update
            int rowsUpdated = pstmt.executeUpdate();

            if (rowsUpdated > 0) {
                System.out.println("Record updated successfully for eno: " + eno);
            } else {
                System.out.println("No record found for eno: " + eno);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

