package fileHandling;

import java.io.File;
import java.io.FileReader;

public class FileReaderDemo {

	public static void main(String[] args) throws Exception {
		File file = new File(System.getProperty("user.dir") + "/PropertiesFile/TestData.txt");
		FileReader fileReader = new FileReader(file); //FileReader is used to read a file from a disk drive  and that too Character by Character 
		System.out.println("Reading char by char : \n");
		int i;
		while ((i = fileReader.read()) != -1) {
			System.out.print((char)i);
		}

	}






}
