package day10;

import java.io.BufferedReader;
import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Compare2FilesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1 = new File("C:\\Users\\Ankush\\file1.txt");
		File f2 = new File("C:\\Users\\Ankush\\file2.txt");
		try {
			BufferedReader reader1 = new BufferedReader(new FileReader(f1));
			BufferedReader reader2 = new BufferedReader(new FileReader(f2));
			String file1Line1 = reader1.readLine();
			String file2Line1 = reader2.readLine();
			
			boolean areSameLines = true;
			while(file1Line1 != null && file2Line1 != null) {
				if(!file1Line1.equals(file2Line1)) {
					areSameLines = false;
					System.out.println("Difference in files");					
					System.out.println("File1: " + file1Line1);
					System.out.println("File2: " + file2Line1);
					System.out.println("File are not same");					
					break;
				}
				file1Line1 = reader1.readLine();
				file2Line1 = reader2.readLine();
			}
			reader1.close();
			reader2.close();
			
			if(areSameLines) {
				System.out.println("Files are same");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
