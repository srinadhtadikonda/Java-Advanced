


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
