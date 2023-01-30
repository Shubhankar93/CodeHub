package fileHandling;

import java.io.*;


public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		File file = new File(System.getProperty("user.dir") + "/PropertiesFile/TestData.txt");
		FileReader fileReader = new FileReader(file);
		BufferedReader br = new BufferedReader(fileReader);
		
		String s ;
		while ( (s = br.readLine()) != null) {
			System.out.println(s);
			
		}
		

	}

}
