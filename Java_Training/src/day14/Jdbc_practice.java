package day14;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc_practice {


	// program for creating and adding multiple tables and also values in it

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			String url = "jdbc:mysql://localhost:3306/booking";
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
				String user = "create table if not exists user(user_id int Auto_increment primary key, name varchar(100), email varchar(150), phone int)";
				st.executeUpdate(user);
				System.out.println("Table User is created at mysql");
				String ticket = "create table if not exists ticket(ticket_id int Auto_increment primary key, delivery_method varchar(50))";
				st.executeUpdate(ticket);
				System.out.println("Table Ticket is created at mysql");
				String pointsTransaction = "create table if not exists pointstransaction(transaction_id int Auto_increment primary key, amount decimal(10,2), transaction_type varchar(20),user_id int, foreign key (user_id) REFERENCES user(user_id))";
				st.executeUpdate(pointsTransaction);
				System.out.println("Table Points Transaction is created at mysql");
				
				String insertUser = "insert into user(name,email,phone) values(?,?,?)";
				// to add multiple parameters
				try(PreparedStatement ps = con.prepareStatement(insertUser)) {
					// prepared statement is a inbuilt statement is a interface class
					ps.setString(1,"Ansh");
					ps.setString(2,"ansh@gmail.com");
					ps.setInt(3,12345);
					ps.addBatch();
					
					ps.setString(1,"Arun");
					ps.setString(2,"arun@gmail.com");
					ps.setInt(3,93644);
					ps.addBatch();
					
					ps.setString(1,"Manan");
					ps.setString(2,"manan@gmail.com");
					ps.setInt(3,98634);
					ps.addBatch();
					
					ps.setString(1,"Shub");
					ps.setString(2,"shubh@gmail.com");
					ps.setInt(3,27343);
					ps.addBatch();
											
					int[] arr = ps.executeBatch();
					// all the rows inserted into the database at a single batch
					System.out.printf("inserted rows: %d\n",(int)java.util.stream.IntStream.of(arr).filter(c-> c>0).count());					
				}
				
				String query1 = "select * from user";
				try(ResultSet rs = st.executeQuery(query1)){
					while(rs.next()) {
						String name = rs.getString(2);
						String email = rs.getString(3);
						int phone = rs.getInt(4);
						System.out.println("Name: "+name+", Email: "+email+", Phone: "+phone);
					}
				}
				
				String insertTicket = "insert into ticket(delivery_method) values (?)";
				try(PreparedStatement ps = con.prepareStatement(insertTicket)){
					ps.setString(1, "Email");
					ps.addBatch();
					
					ps.setString(1, "SMS");
					ps.addBatch();
					
					ps.setString(1, "Courier");
					ps.addBatch();
					
					ps.executeBatch();
					System.out.println("ticket delivery methods added");
				}
				
				String query2 = "select * from ticket";
				try(ResultSet rs = st.executeQuery(query2)){
					while(rs.next()) {
						String method = rs.getString("delivery_method");
						System.out.println("Ticket Delivery Method: "+method);
					}
				}
				
				String insertTransaction = "insert into pointstransaction(amount, transaction_type, user_id) values (?,?,?)";
				try (PreparedStatement ps = con.prepareStatement(insertTransaction)) {
	                ps.setBigDecimal(1, new java.math.BigDecimal("150.75"));
	                ps.setString(2, "Credit");
	                ps.setInt(3, 1); // assuming user_id 1 exists
	                ps.addBatch();

	                ps.setBigDecimal(1, new java.math.BigDecimal("50.25"));
	                ps.setString(2, "Debit");
	                ps.setInt(3, 2); // assuming user_id 2 exists
	                ps.addBatch();

	                ps.executeBatch();
	                System.out.println("transactions inserted successfully");
	            }

				String query = "SELECT u.name, SUM(pt.amount) AS total_amount " +
			               "FROM user u JOIN pointstransaction pt ON u.user_id = pt.user_id " +
			               "GROUP BY u.name";

				try (ResultSet rs = st.executeQuery(query)) {
				    while (rs.next()) {
				        String name = rs.getString("name");
				        double totalAmount = rs.getDouble("total_amount");
		
				        System.out.println("Name: " + name + ", Total Amount: " + totalAmount);
				    }
				}
			}
			catch(SQLException e) {
				System.out.println("Data operation failed");
				e.printStackTrace();
			}
		}
}

