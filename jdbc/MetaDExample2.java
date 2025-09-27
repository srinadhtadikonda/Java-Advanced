package advjavaprograms;
import java.sql.*;
public class LirstRecord {
    public static void main(String[] args) {
    	String url = "jdbc:mysql://localhost:3306/demobase?generateSimpleParameterMetadata=true";
        String user = "root";
        String password = "12345";

        try (Connection con = DriverManager.getConnection(url, user, password))
        {
            
        	PreparedStatement pstmt = con.prepareStatement("SELECT * FROM myemp WHERE eno = ? AND egrade = ?");
        	ParameterMetaData pmd = pstmt.getParameterMetaData();

        	System.out.println("Parameter count: " + pmd.getParameterCount());
        	for (int i = 1; i <= pmd.getParameterCount(); i++) {
        	    System.out.println("Parameter " + i + " type: " + pmd.getParameterTypeName(i));
        	}
          

            pstmt.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
