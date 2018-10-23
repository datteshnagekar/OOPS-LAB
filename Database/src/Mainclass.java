import java.sql.*;
import org.mariadb.jdbc.Driver;

public class Mainclass {

	static final String DB_LINK = "jdbc:mariadb://localhost/oopslab";
	
	public static void main(String[] args) throws Exception
	{
		Connection con = null;
		
		try {
			
			new Driver();
			con = DriverManager.getConnection(DB_LINK,"root","root");
			Statement smt = con.createStatement();
			String sampleQuery = "select * from names";
			ResultSet results = smt.executeQuery(sampleQuery);
			while(results.next()) {
				System.out.println("---->" +results.getString("name"));
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			con.close();
		}
		
	}
}
