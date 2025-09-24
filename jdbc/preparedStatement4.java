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
            Double currentSal = rs.getDouble("esal");
            if (rs.wasNull()) currentSal = null; // handle NULL salary
            String currentGrade = rs.getString("egrade");

            // --- Employee Name ---
            System.out.print("Enter New Employee Name (blank = keep '" + currentName + "', 'null' = set NULL): ");
            String enameInput = sc.nextLine();
            if (enameInput.trim().isEmpty()) {
                updateStmt.setString(1, currentName);
            } else if (enameInput.equalsIgnoreCase("null")) {
                updateStmt.setNull(1, Types.VARCHAR);
            } else {
                updateStmt.setString(1, enameInput);
            }

            // --- Employee Salary ---
            System.out.print("Enter New Employee Salary (blank = keep " + currentSal + ", 'null' = set NULL): ");
            String salInput = sc.nextLine();
            if (salInput.trim().isEmpty()) {
                if (currentSal == null) {
                    updateStmt.setNull(2, Types.DOUBLE);
                } else {
                    updateStmt.setDouble(2, currentSal);
                }
            } else if (salInput.equalsIgnoreCase("null")) {
                updateStmt.setNull(2, Types.DOUBLE);
            } else {
                updateStmt.setDouble(2, Double.parseDouble(salInput));
            }

            // --- Employee Grade ---
            System.out.print("Enter New Employee Grade (blank = keep '" + currentGrade + "', 'null' = set NULL): ");
            String gradeInput = sc.nextLine();
            if (gradeInput.trim().isEmpty()) {
                updateStmt.setString(3, currentGrade);
            } else if (gradeInput.equalsIgnoreCase("null")) {
                updateStmt.setNull(3, Types.VARCHAR);
            } else {
                updateStmt.setString(3, gradeInput);
            }

            // --- eno ---
            updateStmt.setInt(4, eno);

            int rowsUpdated = updateStmt.executeUpdate();

            if (rowsUpdated > 0) {
                System.out.println("\n✅ Record updated successfully for eno: " + eno);

                // Fetch and display updated record
                selectStmt.setInt(1, eno);
                ResultSet updatedRs = selectStmt.executeQuery();
                if (updatedRs.next()) {
                    System.out.println("---- Updated Record ----");
                    System.out.println("Eno   : " + eno);
                    System.out.println("Ename : " + updatedRs.getString("ename"));
                    double newSal = updatedRs.getDouble("esal");
                    if (updatedRs.wasNull()) {
                        System.out.println("Esal  : NULL");
                    } else {
                        System.out.println("Esal  : " + newSal);
                    }
                    System.out.println("Egrade: " + updatedRs.getString("egrade"));
                }
            } else {
                System.out.println("❌ Update failed for eno: " + eno);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
