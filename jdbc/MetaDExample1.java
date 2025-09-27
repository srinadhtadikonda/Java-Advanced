//resultset MetaData
package advjavaprograms;
import java.sql.*;

class LirstRecord{
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/demobase", "root", "12345");

        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM myemp");

        ResultSetMetaData rsmd = rs.getMetaData();

        int columnCount = rsmd.getColumnCount();
        for (int i = 1; i <= columnCount; i++) {
            System.out.println("Column " + i + ": " + rsmd.getColumnName(i) +
                               " (" + rsmd.getColumnTypeName(i) + ")");
        }

        con.close();
    }
}
