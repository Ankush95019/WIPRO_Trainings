package day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// program for creating and adding multiple values in database

public class JdbcDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String userName = "root";
		String pwd = "Ankush@2001";
		
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
			String user = "create table if not exists student(id int Auto_increment primary key, name varchar(100), number int)";
			st.executeUpdate(user);
			System.out.println("Table student is created at mysql");
			String val = "insert into student(name,number) values(?,?)";
			// to add multiple parameters
			
			try(PreparedStatement ps = con.prepareStatement(val)) {
				// prepared statement is a inbuilt statement is a interface class
				ps.setString(1,"Vishal");
				ps.setInt(2,12345);
				ps.addBatch();
				
				ps.setString(1,"Ankush");
				ps.setInt(2,2521);
				ps.addBatch();
				
				ps.setString(1,"Sudhir");
				ps.setInt(2,9432);
				ps.addBatch();
				
				ps.setString(1,"Shubham");
				ps.setInt(2,9924);
				ps.addBatch();
						
				int[] arr = ps.executeBatch();
				// all the rows inserted into the database at a single batch
				System.out.printf("inserted rows: %d\n",(int)java.util.stream.IntStream.of(arr).filter(c-> c>0).count());					
			}
			String query = "select * from student";
			try(ResultSet rs = st.executeQuery(query)){
				while(rs.next()) {
					String name = rs.getString(2);
					int number = rs.getInt(3);
					System.out.println("Name: "+name+", Number: "+number);
				}
				st.close();
				con.close();
			}
		}
		catch(SQLException e) {
			System.out.println("Data operation failed");
			e.printStackTrace();
		}
	}

}
