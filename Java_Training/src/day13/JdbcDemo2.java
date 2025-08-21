package day13;

import java.sql.*;

public class JdbcDemo2 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String userName = "root";
		String pwd = "Ankush@2001";
		// load the register (mysql jdbc driver)
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// JVM trying to load the JDBC Driver Class during the runtime
		}
		catch(ClassNotFoundException e) {
			System.err.println("MySQL Driver not found");
			e.printStackTrace();
			return ;
		}
		
		try (Connection con = DriverManager.getConnection(url,userName,pwd);
				// getConnection is an interface
				Statement st = con.createStatement()){
			String user = "create table users(id int Auto_increment primary key, name varchar(100), number int)";
			st.executeUpdate(user);
			System.out.println("Table users is created at mysql");
			String val = "insert into users(name,number) values(?,?)";
			// to add multiple parameters
			
			try(PreparedStatement ps = con.prepareStatement(val)) {
				// prepared statement is a inbuilt statement is a interface class
				ps.setString(1,"Vishal");
				ps.setInt(2,12345);
				ps.addBatch();
				int[] arr = ps.executeBatch();
				// all the rows inserted into the database at a single batch
				System.out.printf("inserted rows: %d\n",(int)java.util.stream.IntStream.of(arr).filter(c-> c>0).count());					
			}
			String query = "select * from users";
			try(ResultSet rs = st.executeQuery(query)){
				while(rs.next()) {
					String name = rs.getString(2);
					int number = rs.getInt(3);
					System.out.println("Name: "+name+", Number: "+number);
//					st.close();
//					con.close();
				}
			}
		}
		catch(SQLException e) {
			System.out.println("Data operation failed");
			e.printStackTrace();
		}
	}

}
