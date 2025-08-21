package Course2Project;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

class User{
	private String username;
	private String password;
	
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
	
	
}

public class AuthenticationSystemProject {
	
	private LinkedList<User> userList;
	
	public AuthenticationSystemProject() {
		userList = new LinkedList<>();
	}
	
	public void register(String username, String password) {
		User newUser = new User(username,password);
		userList.add(newUser);
		System.out.println("User Registered Successfully");
	}
	
	public boolean login(String username, String password) {
		for(User user:userList) {
			if(user.getUsername().equals(username) && user.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AuthenticationSystemProject authSystem = new AuthenticationSystemProject();
		Scanner sc = new Scanner(System.in);
		
		boolean loggedIn = false;
		
		while(!loggedIn) {
			System.out.println("Choose an option");
			System.out.println("1. Register");
			System.out.println("2. Login");
			System.out.println("3. Exit");
			
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1:
				System.out.println("Enter a username:");
				String regUsername = sc.nextLine();
				
				System.out.println("Enter a password:");
				String regPassword = sc.nextLine();
				
				authSystem.register(regUsername, regPassword);
				break;
				
			case 2:
				System.out.println("Enter your username:");
				String loginUsername = sc.nextLine();
				
				System.out.println("Enter your password:");
				String loginPassword = sc.nextLine();
				
				if(authSystem.login(loginUsername, loginPassword)) {
					System.out.print("Login successfully...");
					loggedIn = true;
				}
				else {
					System.out.println("Login failed");					
				}
				break;
			case 3:
				System.out.println("Exiting...");
				loggedIn = true;
				break;
			default:
				System.out.println("Invalid Choice, Try again...");
				
			}
		}
		sc.close();
		
	}

}
