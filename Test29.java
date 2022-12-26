import java.sql.*;
class Test29
 {
public static void main(String[] args) 
{
String jdbcUrl = "jdbc:mysql://localhost:3306/demobase";
        String username = "root";
        String password = "brilliant";
        String sql = "call retreive_users()";

        try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password); CallableStatement stmt = conn.prepareCall(sql); ResultSet rs = stmt.executeQuery();) {

            while (rs.next()) {
                System.out.println("ID = " + rs.getInt(1) + ", NAME = " + rs.getString(2) + ", Email = " +
                    rs.getString(3) + ", Country = " + rs.getString(4) + ", Password = " + rs.getString(5));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}