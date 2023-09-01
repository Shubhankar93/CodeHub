package chromeOptionsAndDesiredCapabilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Test_test {

	public static void main(String[] args) {
		System.out.println("test");
		ExtentSparkReporter spark = new ExtentSparkReporter(System.getProperty("user.dir") + "/reports/index.html");
		spark.config().setReportName("Web Test Automation");
		spark.config().setDocumentTitle("Test Result");
		ExtentReports extentsReport = new ExtentReports(); 
		extentsReport.attachReporter(spark);
		ExtentTest report = extentsReport.createTest("Demo Class");
		report.pass("Test case passed");
		
		
		

		
		
		DesiredCapabilities cap = new DesiredCapabilities();
		//cap.setAcceptInsecureCerts(true);
		ChromeOptions options = new ChromeOptions();
		//options.setAcceptInsecureCerts(true);
		cap.setAcceptInsecureCerts(true);
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(cap);
		String driverPath = System.getProperty("user.dir")+ "\\Drivers\\chromedriver.exe";
		System.out.println(driverPath);
		System.setProperty("webdriver.chrome.driver",driverPath );
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://untrusted-root.badssl.com/");

	}

}
