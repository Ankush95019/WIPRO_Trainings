package day12;

import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader reader1 = new FileReader("C:\\Users\\Ankush\\file1.txt");
		int ch;
		while((ch = reader1.read()) != -1) {
			System.out.println((char) ch);
		}
	}

}
