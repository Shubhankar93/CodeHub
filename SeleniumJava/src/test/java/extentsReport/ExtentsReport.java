package extentsReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentsReport {

	public static void main(String[] args) {
		ExtentReports er = new ExtentReports ();
		ExtentSparkReporter sr = new ExtentSparkReporter("E:\\MyWorkspace\\MyFiles\\Index.html");
		er.attachReporter(sr);
		er.flush();

	}

}
