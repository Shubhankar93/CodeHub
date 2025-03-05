package dotDisplay;
import org.openqa.selenium.*;
import myUtilities.Utilities;
import java.util.*;

public class ElementsDisplayed {

	public static void main(String[] args) {
		WebDriver driver = null;
		String url = "https://www.saucedemo.com/";
		driver = Utilities.initiateBrowser(driver, url);
		driver.findElement(By.xpath("//*[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		//driver.findElement(By.id("react-burger-menu-btn")).click();
		List<WebElement> list = driver.findElements(By.xpath("//*[@class='bm-menu-wrap']//nav/a"));
		for(WebElement element : list) {
			if (element.isDisplayed()) System.out.println("Element displayed");
			else System.out.println("Element not displayed");
		}
		

	}

}
