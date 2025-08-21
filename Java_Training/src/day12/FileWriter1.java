package day12;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String content = "This text written in file";
		FileWriter writer1 = new FileWriter("C:\\Users\\Ankush\\file1.txt");
		writer1.write(content);
		writer1.close();
		System.out.println("Content successfully written in file");
		
	}

}
