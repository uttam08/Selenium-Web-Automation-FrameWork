package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class calculatorPage {
	
	public WebDriver driver;
	
	public calculatorPage(WebDriver driver)
	{
		this.driver= driver;
	}
	
	
	By BtnPlus = By.cssSelector("span[onclick=\"r('+')\"]");
	By BtnMinus = By.cssSelector("span[onclick=\"r('-')\"]");
	By BtnMul = By.cssSelector("span[onclick=\"r('*')\"]");
	By BtnDiv = By.cssSelector("span[onclick=\"r('/')\"]");
	
	By BtnEqual = By.cssSelector("span[onclick=\"r('=')\"]");
	
	By numZero = By.cssSelector("span[onclick='r(0)']");
	By num1 = By.cssSelector("span[onclick='r(1)']");
	By num2 = By.cssSelector("span[onclick='r(2)']");
	By num3 = By.cssSelector("span[onclick='r(3)']");
	By num4 = By.cssSelector("span[onclick='r(4)']");
	By num5 = By.cssSelector("span[onclick='r(5)']");
	By num6 = By.cssSelector("span[onclick='r(6)']");
	By num7 = By.cssSelector("span[onclick='r(7)']");
	By num8 = By.cssSelector("span[onclick='r(8)']");
	By num9 = By.cssSelector("span[onclick='r(9)']");
	
	
	public WebElement getBtnPlus()
	{
		return driver.findElement(BtnPlus);
	}
	public WebElement getBtnMinus()
	{
		return driver.findElement(BtnMinus);
	}
	public WebElement getBtnMul()
	{
		return driver.findElement(BtnMul);
	}
	public WebElement getBtnDiv()
	{
		return driver.findElement(BtnDiv);
	}
	
	public WebElement getBtnEqual()
	{
		return driver.findElement(BtnEqual);
	}
	
	public WebElement getnumZero()
	{
		return driver.findElement(numZero);
	}
	public WebElement getnum1()
	{
		return driver.findElement(num1);
	}
	public WebElement getnum2()
	{
		return driver.findElement(num2);
	}
	public WebElement getnum3()
	{
		return driver.findElement(num3);
	}
	public WebElement getnum4()
	{
		return driver.findElement(num4);
	}
	public WebElement getnum5()
	{
		return driver.findElement(num5);
	}
	public WebElement getnum6()
	{
		return driver.findElement(num6);
	}
	public WebElement getnum7()
	{
		return driver.findElement(num7);
	}
	public WebElement getnum8()
	{
		return driver.findElement(num8);
	}
	public WebElement getnum9()
	{
		return driver.findElement(num9);
	}
	

}
