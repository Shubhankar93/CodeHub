package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		String driverPath = System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe";
		System.out.println(driverPath);
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://demo.automationtesting.in/Index.html");
		Actions objAction = new Actions(driver);
		objAction.contextClick(driver.findElement(By.id("email"))).build().perform();	
		
	}

}
