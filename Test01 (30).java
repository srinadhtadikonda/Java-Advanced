
import java.sql.*;

class Test30
 {
   static final String DB_URL = "jdbc:mysql://localhost:3306/demobase";
   static final String USER = "root";
   static final String PASS = "brilliant";
   static final String QUERY = "{call getEmpName (?, ?)}";

   public static void main(String[] args)
 {
      // Open a connection
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         CallableStatement stmt = conn.prepareCall(QUERY);
      ) {		      
         // Bind values into the parameters.
         stmt.setInt(1, 102);  // This would set ID
         // Because second parameter is OUT so register it
         stmt.registerOutParameter(2, java.sql.Types.VARCHAR);
         //Use execute method to run stored procedure.
         System.out.println("Executing stored procedure..." );
         stmt.execute();
         //Retrieve employee name with getXXX method
         String empName = stmt.getString(2);
         System.out.println("Emp Name with ID: 102 is " + empName);
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}
