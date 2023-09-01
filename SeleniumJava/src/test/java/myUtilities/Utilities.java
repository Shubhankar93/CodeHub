package myUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Utilities {
	public static  WebDriver initiateBrowser (WebDriver driver,String url){
		
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
		
		
	}
}
