package advjavaprograms;

import java.sql.*;
import java.util.Scanner;

class LirstRRecord {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/demobase"; 
        String user = "root";
        String password = "12345";

        String selectSql = "SELECT ename, esal, egrade FROM myemp WHERE eno = ?";
        String updateSql = "UPDATE myemp SET ename = ?, esal = ?, egrade = ? WHERE eno = ?";

        try (
            Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement selectStmt = conn.prepareStatement(selectSql);
            PreparedStatement updateStmt = conn.prepareStatement(updateSql);
            Scanner sc = new Scanner(System.in);
        ) {
            // Take input for employee number
            System.out.print("Enter Employee Number (eno) to update: ");
            int eno = sc.nextInt();
            sc.nextLine(); // consume newline

            // Fetch current values
            selectStmt.setInt(1, eno);
            ResultSet rs = selectStmt.executeQuery();

            if (!rs.next()) {
                System.out.println("No record found for eno: " + eno);
                return;
            }

            String currentName = rs.getString("ename");
            double currentSal = rs.getDouble("esal");
            String currentGrade = rs.getString("egrade");

            // Ask user for new values (press Enter to keep old)
            System.out.print("Enter New Employee Name (leave blank to keep '" + currentName + "'): ");
            String ename = sc.nextLine();
            if (ename.trim().isEmpty()) {
                ename = currentName;
            }

            System.out.print("Enter New Employee Salary (leave blank to keep " + currentSal + "): ");
            String salInput = sc.nextLine();
            double esal = salInput.trim().isEmpty() ? currentSal : Double.parseDouble(salInput);

            System.out.print("Enter New Employee Grade (leave blank to keep '" + currentGrade + "'): ");
            String egrade = sc.nextLine();
            if (egrade.trim().isEmpty()) {
                egrade = currentGrade;
            }

            // Set update values
            updateStmt.setString(1, ename);
            updateStmt.setDouble(2, esal);
            updateStmt.setString(3, egrade);
            updateStmt.setInt(4, eno);

            int rowsUpdated = updateStmt.executeUpdate();

            if (rowsUpdated > 0) {
                System.out.println("Record updated successfully for eno: " + eno);
            } else {
                System.out.println("Update failed for eno: " + eno);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
