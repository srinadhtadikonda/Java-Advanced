mysql> create table users(id int,name char(20),email char(30),country char(3),password char(10));

mysql>insert into users values(1,'raj','raj@gmail.com','ind','abc123');
mysql>insert into users values(2,'madhu','madhu@gmail.com','sri','ab123a');

DELIMITER $$
USE `demobase`$$
CREATE PROCEDURE `retreive_users` ()
BEGIN
 select * from users;
END$$
DELIMITER ;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
class Test 
{
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/demobase?useSSL=false";
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

