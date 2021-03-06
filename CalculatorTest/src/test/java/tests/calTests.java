package tests;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObjects.calculatorPage;
import resourses.Base;
import resourses.calculateExpected;

public class calTests extends Base{
	
	public WebDriver driver;
	
	private static Logger log = LogManager.getLogger(Base.class.getName());
	

	@BeforeMethod
	public void start() throws IOException
	{
		driver = initializeBrowser();
		log.info("driver is initialised");
		String url = prop.getProperty("url");
		driver.get(url);
		log.info("website is loaded");
	}
	
	@Test
	public void addTest()
	{
		calculatorPage cp = new calculatorPage(driver);
		
		String expectedResultString = calculateExpected.addexp();
		
		log.info("Starting addition operation");
		
		//String number1 = Keys.chord(Keys.NUMPAD4,Keys.NUMPAD2,Keys.NUMPAD3);
		
		cp.getBtnMinus().click();
		cp.getnum2().click();
		cp.getnum3().click();
		cp.getnum4().click();
		cp.getnum2().click();
		cp.getnum3().click();
		cp.getnum4().click();
		
		log.info("n1 is entered");
		
		cp.getBtnPlus().click();
		
		log.info("Add btn pressed");
		
		cp.getnum3().click();
		cp.getnum4().click();
		cp.getnum5().click();
		cp.getnum3().click();
		cp.getnum4().click();
		cp.getnum5().click();
		
		log.info("n2 is entered");
		
		cp.getBtnEqual().click();
		
		String actualResult = driver.findElement(By.id("sciOutPut")).getText();
		log.info("result extracted");
		System.out.println(actualResult.trim());
		String actualResultTrim = actualResult.trim();
		
		Assert.assertEquals(actualResultTrim, expectedResultString);
	}
	
	@Test
	public void subTest()
	{
		String expectedResultString = calculateExpected.subexp();
		
		calculatorPage cp = new calculatorPage(driver);
		
		log.info("Starting subtraction operation");
		
		cp.getnum2().click();
		cp.getnum3().click();
		cp.getnum4().click();
		cp.getnum8().click();
		cp.getnum2().click();
		cp.getnum3().click();
		
		log.info("n1 is entered");
		
		cp.getBtnMinus().click();

		
		cp.getBtnMinus().click();		
		cp.getnum2().click();
		cp.getnum3().click();
		cp.getnumZero().click();
		cp.getnum9().click();
		cp.getnum4().click();
		cp.getnum8().click();
		cp.getnum2().click();
		cp.getnum3().click();
		
		log.info("n2 is entered");
		
		cp.getBtnEqual().click();
		
		String actualResult = driver.findElement(By.id("sciOutPut")).getText();
		
		log.info("result extracted");
		System.out.println(actualResult.trim());
		String actualResultTrim = actualResult.trim();
		
		Assert.assertEquals(actualResultTrim, expectedResultString);
		
	}
	
	@Test
	public void mulTest()
	{
		String expectedResultString = calculateExpected.mulexp();
		
		calculatorPage cp = new calculatorPage(driver);
		
		log.info("Starting multiplication operation");
				
		cp.getnum4().click();
		cp.getnum2().click();
		cp.getnum3().click();
		
		log.info("n1 is entered");
		
		cp.getBtnMul().click();
		
		cp.getnum5().click();
		cp.getnum2().click();
		cp.getnum5().click();
		
		log.info("n2 is entered");
		
		cp.getBtnEqual().click();
		
		String actualResult = driver.findElement(By.id("sciOutPut")).getText();
		
		log.info("result extracted");
		
		System.out.println(actualResult.trim());
		String actualResultTrim = actualResult.trim();
		
		Assert.assertEquals(actualResultTrim, expectedResultString);
		
	}
	
	@Test
	public void divTest()
	{
		String expectedResultString = calculateExpected.divexp();
		
		calculatorPage cp = new calculatorPage(driver);
		
		log.info("Starting division operation");
				
		cp.getnum4().click();
		cp.getnumZero().click();
		cp.getnumZero().click();
		cp.getnumZero().click();
		
		log.info("n1 is entered");
		
		cp.getBtnDiv().click();
		
		cp.getnum2().click();
		cp.getnumZero().click();
		cp.getnumZero().click();
		
		log.info("n2 is entered");
		
		cp.getBtnEqual().click();
		
		String actualResult = driver.findElement(By.id("sciOutPut")).getText();
		
		log.info("result extracted");
		System.out.println(actualResult.trim());
		String actualResultTrim = actualResult.trim();
		
		Assert.assertEquals(actualResultTrim, expectedResultString);
		
	}
	
	@AfterMethod
	public void end() throws IOException
	{
		driver.close();
		log.info("driver closed");
	}

}
