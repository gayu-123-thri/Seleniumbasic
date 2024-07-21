package com.selenium.basics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class FirefoxWebDriver 
{

	public static void main(String[] args) 
	{
	 WebDriver driver=new FirefoxDriver();
	 driver.manage().window().maximize();
	 driver.get("https://en.wikipedia.org/wiki/French_Revolution");
	 String url=driver.getCurrentUrl();
	 System.out.println("Current url is : " +driver);
	 String title=driver.getTitle();
	 System.out.println("Title is : " +title);
	 String handle=driver.getWindowHandle();
	 System.out.println("Window handle is : " +handle);
	 String source=driver.getPageSource();
	 System.out.println("Source page is : " +source);
	 driver.close();


	}

}
