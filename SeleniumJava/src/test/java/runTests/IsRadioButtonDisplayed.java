package runTests;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class IsRadioButtonDisplayed {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		
		driver.get("https://omayo.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//WebElement element = driver.findElement(By.xpath("//*[@id='radio22']"));
		try {
			LocalDateTime startTime = LocalDateTime.now();  
			System.out.println("Start Time - " + dtf.format(startTime));
			WebElement element = driver.findElement(By.xpath("//*[@id='radio22']"));
			System.out.println(element.isDisplayed());
		
		}catch(Exception ex){
			LocalDateTime endTime = LocalDateTime.now(); 
			System.out.println("Start Time - " + dtf.format(endTime));
			driver.quit();
		}
		

	}

}
