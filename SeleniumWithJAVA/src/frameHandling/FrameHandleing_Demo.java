package frameHandling;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import myUtilities.Utilities;

public class FrameHandleing_Demo {
	public static WebDriver driver;
	static String url = "https://www.google.com/";

	public static void main(String[] args) {
		driver = Utilities.initiateBrowser(driver, url);
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		for(WebElement frame: frames){
			System.out.println(frame.getAttribute("name"));
		}
		driver.switchTo().frame("callout");
		driver.switchTo().parentFrame();
		//driver.switchTo().defaultContent();
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Shubhankar Ghosh");
		System.out.println("******** End of Execution ***********");
	}

}
