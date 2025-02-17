package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import myUtilities.Utilities;

public class MouseHover {

	public static void main(String[] args) {
		WebDriver driver = null;
		String url = "http://www.naukri.com";
		driver = Utilities.initiateBrowser(driver, url);

		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		//action.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'For employers')]"))).perform();// build() is not needed for single operation
		action.moveToElement(driver.findElement(By.xpath("//a/div[text()='Companies']"))).click().build().perform(); // build() is needed here as multiple actions are being performed 1.MoveToElement 2.Click Operation 
	}

}
