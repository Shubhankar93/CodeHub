package Test;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test1 {

	public static void main(String[] args) {
		String driverPath = System.getProperty("user.dir")+ "\\Drivers\\chromedriver.exe";
		System.out.println(driverPath);
		System.setProperty("webdriver.chrome.driver",driverPath );
		RemoteWebDriver driver = new FirefoxDriver();
		//WebDriver driver1 = new ChromeDriver();
		driver.quit();
		//driver1.qui
		driver.get("https://www.naukri.com/");
		String parent = driver.getWindowHandle();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Set<String> allHandles = driver.getWindowHandles(); 
		for (String handle : allHandles ){
			driver.switchTo().window(handle);
			System.out.println(driver.getTitle());
		}
		
		System.out.println(driver.getTitle());

	}

}
