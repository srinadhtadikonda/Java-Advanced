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

