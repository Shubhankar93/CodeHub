package scroll;

import org.openqa.selenium.WebDriver;

import myUtilities.Utilities;

public class WindowScroll {

	public static void main(String[] args) {
		WebDriver driver = null;
		String url = "https://www.globalsqa.com/demo-site/draganddrop/";
		driver = Utilities.initiateBrowser(driver, url);

	}

}
