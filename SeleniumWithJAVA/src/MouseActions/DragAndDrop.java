package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws Exception {
		String driverPath = System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe";
		System.out.println(driverPath);
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		
		int frameSize = driver.findElements(By.tagName("iframe")).size();
		
		System.out.println(frameSize);
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='post-2669']/div[2]/div/div/div[1]/p/iframe")));
		Actions action = new Actions(driver);
		
		Thread.sleep(3000);
		action.clickAndHold(driver.findElement(By.xpath("//*[@id='gallery']/li[2]/img"))).moveToElement(driver.findElement(By.xpath("//*[@id='trash']"))).build().perform();
		
		
	}

	
}
