package chromeOptionsAndDesiredCapabilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Test_Report {

	public static void main(String[] args) {
		ExtentTest report;
		System.out.println("test started");
		ExtentSparkReporter spark = new ExtentSparkReporter(System.getProperty("user.dir") + "/reports/index.html");
		spark.config().setReportName("Web Test Automation");
		spark.config().setDocumentTitle("Test Result");
		ExtentReports extentsReport = new ExtentReports(); 
		extentsReport.attachReporter(spark);
		 report = extentsReport.createTest("Demo Class");
		report.pass("Test case passed");
		String driverPath = System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe";
		System.out.println(driverPath);
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		report = extentsReport.createTest("Demo-1 Class");
		report.pass("Demo-1 Test Case Pass");
		
		
		extentsReport.flush();

	}

}
