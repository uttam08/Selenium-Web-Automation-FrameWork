package resourses;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extentReportC {
	
	static ExtentReports extent;
	
	public static ExtentReports getExtentReport()
	{
		String path =System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		
		reporter.config().setReportName("Calculator Automation Results");
		reporter.config().setDocumentTitle("Cal-Test Results");
		
		extent =new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Uttam PD");
		return extent;

	}

}
