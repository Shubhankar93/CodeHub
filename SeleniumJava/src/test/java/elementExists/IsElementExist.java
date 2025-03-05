package elementExists;


import org.openqa.selenium.*;
//import org.openqa.selenium.WebDriver;

import myUtilities.Utilities;

public class IsElementExist {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url = "https://www.saucedemo.com/";
		driver = Utilities.initiateBrowser(driver, url);
		if (!driver.findElements(By.id("myElement")).isEmpty() && driver.findElement(By.id("myElement")).isDisplayed()) {
		    System.out.println("Element is displayed.");
		} else {
		    System.out.println("Element is NOT displayed.");
		}

	}

}
