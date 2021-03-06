package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import resourses.Base;
import resourses.extentReportC;

public class listeners extends Base implements ITestListener{
	
	ExtentReports er = extentReportC.getExtentReport();
	ExtentTest et;
	ThreadLocal<ExtentTest> thread1 =new ThreadLocal<ExtentTest>();

	public void onTestStart(ITestResult result) 
	{	
		et= er.createTest(result.getMethod().getMethodName());
		thread1.set(et);	
	}

	public void onTestSuccess(ITestResult result)
	{
		thread1.get().log(Status.PASS, "Test Passed");
	}

	public void onTestFailure(ITestResult result) 
	{
		thread1.get().fail(result.getThrowable());
		WebDriver driver =null;
		String testMethodName =result.getMethod().getMethodName();
		
		try 
		{
			driver =(WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		} 
		
		try 
		{
			thread1.get().addScreenCaptureFromPath(getScreenShotWithPath(testMethodName, driver), result.getMethod().getMethodName());
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) 
	{
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		
	}

	public void onTestFailedWithTimeout(ITestResult result) 
	{
		
	}

	public void onStart(ITestContext context) 
	{
		
	}

	public void onFinish(ITestContext context)
	{
		er.flush();
	}

}
