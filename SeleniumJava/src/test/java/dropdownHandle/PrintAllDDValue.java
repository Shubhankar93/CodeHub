package dropdownHandle;

import java.util.List;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import myUtilities.Utilities;

public class PrintAllDDValue {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = null;
		String url = "https://www.hscripts.com/scripts/jquery/districts-select-list.php";
		driver = Utilities.initiateBrowser(driver, url);
		
		Select state = new Select(driver.findElement(By.xpath("//*[@id='listBox']")));
		state.selectByVisibleText("West Bengal");
		
		List<WebElement> distElement = driver.findElements(By.xpath("//*[@id='secondlist']/option"));
		//List<WebElement> distElement = dist.getOptions();// alternative of above line
		System.out.println(distElement.size());
		
		List<String> ddValues = new ArrayList<String>();
		for(WebElement we : distElement) {
			
			ddValues.add(we.getText());
	
		}
		
		System.out.println(ddValues);
		

	}

}
