package WindowHandling;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import myUtilities.Utilities;

public class ManageWindows {
	static WebDriver driver;
	public static void main(String[] args) {
		String url = "https://www.hyrtutorials.com/p/window-handles-practice.html";
		driver = Utilities.initiateBrowser(driver, url);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='newWindowsBtn']")).click();
		String parentWindow = driver.getWindowHandle();
		Set<String> win = driver.getWindowHandles();
		List list = new ArrayList<String>(win);
		System.out.println("-----");
		System.out.println(list.get(3));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println("-----");
		
		int totalWindows = win.size();
		System.out.println(win);
		Iterator<String> it = win.iterator();
		//System.out.println(it.next());
		for (int i=1; i<=3;i++){
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			
		}	
		
		

	}

}
