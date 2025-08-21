package day10;

import java.io.File; // import the File Class library
import java.io.FileNotFoundException;
import java.io.IOException;

import java.io.FileWriter; // for writing a file
import java.util.Scanner; // to read a txt file

public class FileHandling1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// New file object creation
		
//		try {
//			File myObj = new File("myfile.txt");
//			if(myObj.createNewFile()) {
//				System.out.println("File Created: "+myObj.getName());
//			}
//			else {
//				System.out.println("File Already Exists");
//			}
//		}
//		catch(IOException e) {
//			System.out.println("An error occurred");			
//			e.printStackTrace();
//		}
		
		// writing in a already created file
		
//		try {
//			// writing a file content
//			FileWriter myWriter = new FileWriter("myfile.txt");
//			myWriter.write("Hi, my naem is Ankush");
//			myWriter.close();
//			System.out.println("Successfully written to the file");
//		}
//		catch(IOException e)
//		{
//			System.out.println("Error Occurred");
//			e.printStackTrace();
//		}
		
		// reading a file
		
//		try {
//			File myObj = new File("myfile.txt");
//			Scanner myReader = new Scanner(myObj);
//			while(myReader.hasNextLine()) {
//				String data = myReader.nextLine();
//				System.out.println(data);
//			}
//			myReader.close();
//		}
//		catch(FileNotFoundException e) {
//			System.out.println("Error Raised");
//			e.printStackTrace();
//		}
		
		// getting file information
		
//		File myObj = new File("myfile.txt");
//		if(myObj.exists()) {
//			System.out.println("File Name: "+myObj.getName());
//			System.out.println("Absolute Path: "+myObj.getAbsolutePath());
//			System.out.println("Writeable: "+myObj.canWrite());
//			System.out.println("Readable: "+myObj.canRead());
//			System.out.println("File size in bytes: "+myObj.length());
//		}
//		else{
//			System.out.println("File not found...");
//		}
		
		// deleting a file
//		File myObj = new File("myfile.txt");
//		if(myObj.delete()) {
//			System.out.println("File Deleted Successfully: "+myObj.getName());
//		}
//		else{
//			System.out.println("File not found...");
//		}
		
		// deleting a directory
		File myObj = new File("C:\\Users\\Ankush\\eclipse-workspace\\DemoDirectory");
		if(myObj.delete()) {
			System.out.println("Directory Deleted Successfully: "+myObj.getName());
		}
		else{
			System.out.println("Directory not found...");
		}
		
	}

}
