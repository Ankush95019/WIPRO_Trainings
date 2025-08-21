package day12;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Ankush\\file1.txt",true));
		{
			bw.write("This is new content in the file using BufferedWriter");
			bw.newLine();
			bw.close();
			System.out.println("Content written successfully");
			
		}
		
	}

}
