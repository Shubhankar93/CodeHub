package dropdownHandle;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import myUtilities.Utilities;

public class MMT {

	public static void main(String[] args) {
		WebDriver driver = null;
		String url = "https://www.makemytrip.com/";
		driver = Utilities.initiateBrowser(driver, url);
		new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"fromCity\"]"))).click();
		List<WebElement> myList = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"react-autowhatever-1\"]/div/ul/li")));
		for (WebElement element:myList) {
			if(element.getText().contains("Chennai, India")) {
				JavascriptExecutor js = (JavascriptExecutor)driver;
				//js.executeScript("arguments[0].click();", element);
				js.executeScript("document.getElementBy(\"myCheck\").click();");
			}

		}

	}
}
