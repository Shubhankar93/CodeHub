package assertions;

import static org.junit.Assert.*;

import org.openqa.selenium.*;

import myUtilities.Utilities;

public class CodilitySolution {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url = "https://www.saucedemo.com/";
		driver = Utilities.initiateBrowser(driver, url);
		
//		int  elementCount = driver.findElements(By.xpath("//*[@name='user-name']")).size();
//		assertTrue(elementCount>0, "Field should be present");
		
//		Boolean isElementPresent = !driver.findElements(By.xpath("//*[@name='user-name1']")).isEmpty();
//		assertTrue(isElementPresent, "Field should be present");
		
		Boolean isElementPresent1 = driver.findElement(By.xpath("//*[@name='user-name1']")).isDisplayed();
		assertTrue("Field should be present", isElementPresent1);
		
		Boolean searchElement = !driver.findElements(By.xpath("//div[@id='error-empty-query']")).isEmpty();
		
		//String actualVaue = driver.findElement(By.xpath("expectedValue")).getAttribute(expectedValue)
		
		assertTrue("",searchElement);
		assertEquals(0,1);
		
		
		driver.quit();
		
		

	}

}
