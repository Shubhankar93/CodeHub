package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import myUtilities.Utilities;

public class VerifyElementPresentOrNot {

	static WebDriver driver;
	public static void main(String[] args) {
		String url = "https://www.hyrtutorials.com/p/window-handles-practice.html";
		driver = Utilities.initiateBrowser(driver, url);
		driver.manage().window().maximize();
		//Instead of handling exceptions, you can use findElements(), which returns an empty list if the element is not found:
			if (!driver.findElements(By.id("myElement")).isEmpty() && driver.findElement(By.id("myElement")).isDisplayed()) {
			    System.out.println("Element is displayed.");
			} else {
			    System.out.println("Element is NOT displayed.");
			}
		
	}

}
