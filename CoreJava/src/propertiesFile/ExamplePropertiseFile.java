package propertiesFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ExamplePropertiseFile {

	public static void main(String[] args) throws IOException {
		
		File file = new File(System.getProperty("user.dir") + "/PropertiesFile/TestData.txt");
		Properties OR = new Properties ();
		FileInputStream fs = new FileInputStream(file); 
		OR.load(fs);
		System.out.println(OR.get("username"));

	}

}
