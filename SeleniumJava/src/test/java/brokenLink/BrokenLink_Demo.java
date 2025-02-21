package brokenLink;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrokenLink_Demo {

	public static void main(String[] args) throws Exception  {
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--headless");
		String driverPath = System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe";
		System.out.println(driverPath);
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.hyrtutorials.com");
		driver.manage().window().maximize();
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		
		for (WebElement we : elements) {
			//System.out.println(we.getAttribute("href"));
			String link = we.getAttribute("href");
			URL url = new URL (link);
			URLConnection urlconnection = url.openConnection();
			HttpURLConnection httpurlconnection =  (HttpURLConnection) urlconnection; 
			httpurlconnection.setConnectTimeout(5000);
			httpurlconnection.connect();
			if (httpurlconnection.getResponseCode() == 200){
				//System.out.println("Valid link");
			}else{
				System.out.println("invalid link" + link);
			}
			httpurlconnection.disconnect();	
			

		}
		
		driver.quit();

	}

}
