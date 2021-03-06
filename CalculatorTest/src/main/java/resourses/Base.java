package resourses;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Base {
	
	public static Properties prop;
	public FileInputStream fin;
	public WebDriver driver;

	public WebDriver initializeBrowser() throws IOException
	{
		prop = new Properties();
		String path = System.getProperty("user.dir");
		fin = new FileInputStream(path+"\\src\\main\\java\\resourses\\data.properties");
		prop.load(fin);
		String browserName = prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", path+"\\src\\main\\java\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			//firefox code
		}
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		return driver;
	}
	
	public String getScreenShotWithPath(String testCaseName , WebDriver driver) throws IOException
	{
		String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(src, new File(destinationFile));

		return destinationFile;
	}

}
