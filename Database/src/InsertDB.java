import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.mariadb.jdbc.Driver;

import java.sql.*;
import org.mariadb.jdbc.Driver;

public class InsertDB {

static final String DB_LINK = "jdbc:mariadb://localhost/oopslab";
	
	public static void main(String[] args) throws Exception
	{
		Connection con = null;
		
		try {
			
			new Driver();
			con = DriverManager.getConnection(DB_LINK,"root","root");
			Statement smt = con.createStatement();
			String sampleQuery = "insert into names (name) values (?)";
			PreparedStatement statement = con.prepareStatement(sampleQuery);
			statement.setString(1, "salllu bhai");
			
			int rowinserted = statement.executeUpdate();
			if(rowinserted > 0) {
				System.out.println("a new user inserted successdfully");
			}
			
				
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			con.close();
		}
		
	}
	
}
