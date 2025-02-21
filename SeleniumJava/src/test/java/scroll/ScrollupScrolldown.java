package scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import myUtilities.Utilities;

public class ScrollupScrolldown {
	public static WebDriver driver;
	static String url = "https://www.globalsqa.com/demo-site/draganddrop/";

	public static void main(String[] args) throws Exception {
		driver = Utilities.initiateBrowser(driver, url);
		WebElement element = driver.findElement(By.xpath("//*[@id='menu-item-2817']/a/span[2]"));
		WebElement element1 = driver.findElement(By.xpath("//*[@id='menu-item-2806']/a/span[2]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Scroll to a particular element
		js.executeScript("window.scrollTo(arguments[0],arguments[1])", element.getLocation().x,
				element.getLocation().y);
		Thread.sleep(3000);
		js.executeScript("window.scrollTo(arguments[0],arguments[1])", element.getLocation().x,
				element1.getLocation().y);
		Thread.sleep(3000);
		// Scroll to all the way bottom
		js.executeScript("window.scrollTo(0,(document.body.scrollHeight))");
		Thread.sleep(3000);
		// Scroll to all the way top
		js.executeScript("window.scrollTo(0,-(document.body.scrollHeight))");
		Thread.sleep(3000);

		// Scroll to all the way right
		js.executeScript("window.scrollTo((documnt.body.scrollWidth), 0");
		Thread.sleep(3000);
		js.executeScript("window.scrollTo(-(document.body.width),0)");
	}

}
