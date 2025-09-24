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

