import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.mariadb.jdbc.Driver;

import java.sql.*;
import org.mariadb.jdbc.Driver;

public class Updatedb {

static final String DB_LINK = "jdbc:mariadb://localhost/oopslab";
	
	public static void main(String[] args) throws Exception
	{
		Connection con = null;
		
		try {
			
			new Driver();
			con = DriverManager.getConnection(DB_LINK,"root","root");
			Statement smt = con.createStatement();
			String sampleQuery = "update names set name=? where Rollno=?";
			PreparedStatement statement = con.prepareStatement(sampleQuery);
			statement.setString(1, "bom diggy diggy");
			statement.setInt(2, 34);
			
			int rowinserted = statement.executeUpdate();
			if(rowinserted > 0) {
				System.out.println("a new user was updated successdfully");
			}
			
				
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			con.close();
		}
		
	}
	
	
}
