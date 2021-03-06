package takesScreenshotDemo;

import java.io.File;
import java.io.IOException;
import java.time.LocalTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ScreenshotDemo extends RemoteWebDriver {

	public static void main(String[] args) throws IOException {
		System.out.println("abc");
		String driverPath = System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe";
		System.out.println(driverPath);
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(System.getProperty("user.dir")+ "/Screenshot/"+ "/Image.PNG"));

	}

	

}
