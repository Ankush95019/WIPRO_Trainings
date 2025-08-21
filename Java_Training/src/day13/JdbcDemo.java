package day13;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import java.sql.*;

// 1. We need to import a package
// 2. load and register the driver - com.mysql.jdbc.Driver
// 3. establish the connection
// 4. create the statements
// 5. execute the query
// 6. process results
// 7. close the connection

public class JdbcDemo {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String userName = "root";
		String pwd = "Ankush@2001";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,userName,pwd);
		Statement st = (Statement) con.createStatement();
		ResultSet rs = st.executeQuery("select * from sample;");
		while(rs.next()) {
//			int id = rs.getInt(1);
			String name = rs.getString(2);
			String email = rs.getString(3);
			System.out.println("Name: "+name+", Email: "+email);
		}
		st.close();
		con.close();
		
		
	}

}
