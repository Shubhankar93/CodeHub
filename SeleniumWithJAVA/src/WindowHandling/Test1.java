package WindowHandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import myUtilities.Utilities;

public class Test1 {

	static WebDriver driver;
	public static void main(String[] args) {
		String url = "https://www.hyrtutorials.com/p/window-handles-practice.html";
		driver = Utilities.initiateBrowser(driver, url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='newWindowsBtn']")).click();
		String parentWindow = driver.getWindowHandle();
		Set<String> win = driver.getWindowHandles();
		ArrayList<String> list = new ArrayList<String>(win);
		driver.switchTo().window( list.get(1));
		driver.findElement(By.xpath("//*[@id='post-body-299858861183690484']/div/form/div[1]/input[1]")).sendKeys("Shubhankar");
		driver.switchTo().window(list.get(2));
		//*[@id="lastName"]
		driver.findElement(By.xpath("//*[@id='lastName']")).sendKeys("Ghosh");
		driver.switchTo().window( list.get(1));
		driver.findElement(By.xpath("//*[@id='post-body-299858861183690484']/div/form/div[1]/input[3]")).sendKeys("Shubhankar");
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());
	}

}
