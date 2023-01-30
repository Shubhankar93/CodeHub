package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;

public class FileWriter_FileReader {

	public static void main(String[] args) throws IOException {
		File obj = new File ("F:\\java", "test.txt");// creating file object to represent the file or directory
		
		boolean a = obj.exists();
		if (a==true){
			System.out.println("File already exist");
		}else{
			obj.createNewFile(); //Creating physical file (test.text) in F:\\java
		}
		FileWriter myWriter = new FileWriter(obj, true); // passing true with constructor means it will not override old data
		myWriter.write("Kolkata"); // Writing Kolkata in text file
		myWriter.write("\n");
		myWriter.write("Mumbai");
		myWriter.write("\n");
		myWriter.write("Delhi");
		myWriter.write("\n");
		myWriter.flush();
		myWriter.close();
		
		FileReader fr = new FileReader(obj);
		int i = fr.read();
		while(i !=-1){
		System.out.print((char)i);
		i = fr.read();
		Collections.reverseOrder();
		}
		
		

}
}
