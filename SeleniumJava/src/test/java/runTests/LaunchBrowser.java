package runTests;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchBrowser {

	public static void main(String[] args) throws Exception {
		
		Map<String, Object> prefs = new HashMap<String, Object>();
		
		prefs.put("download.default_directory",System.getProperty("user.dir") + "/download");
		prefs.put("download.prompt_for_download",false);
		
		//prefs.put("download.default_directory",System.getProperty("user.dir") + File.separator + "externalFiles" + File.separator + "downloadFiles");   

		ChromeOptions options = new ChromeOptions();
		
		//options.setBrowserVersion("117");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		//Thread.sleep(5000);
		WebElement element = driver.findElement(By.xpath("//*[@id='table-files']/tbody/tr[1]/td[5]/a"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();", element);
		Thread.sleep(20000);
		js.executeScript("arguments[0].click();", element);
		driver.quit();
		
		

	}

}
