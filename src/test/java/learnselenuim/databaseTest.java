package learnselenuim;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class databaseTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// Loading the required JDBC Driver class
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

		// Creating a connection to the database
		Connection conn = DriverManager.getConnection("jdbc:sqlserver://nagarro/anilkumar06/explore", "anilkumar06",
				"@NGRdae10606");

		// Executing SQL query and fetching the result
		Statement st = conn.createStatement();
		String sqlStr = "select * from employee";
		ResultSet rs = st.executeQuery(sqlStr);
		while (rs.next()) {
			System.out.println(rs.getString("name"));
		}

		conn.close();
	}

}
