package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) throws Exception {
		File file = new File(System.getProperty("user.dir") + "/PropertiesFile/TestData.txt");
		Scanner sc = new Scanner(file);
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}

	}

}
