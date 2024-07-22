package com.selenium.basics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class NavigationProgram 
{
 public void chrome_Navigation()
 {
	 WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/about/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.navigate().to("https://www.seleniumeasy.com/");  //to used to load the other url in same window
		driver.close();
 }
 public void edge_Navigation() 
 {
	 WebDriver driver=new EdgeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.obsqurazone.com/");
	 driver.navigate().back();
	 driver.navigate().forward();
	 driver.navigate().to("https://www.selenium.dev/");
 }
 public void firefox_navigation()
 {
	 WebDriver driver=new FirefoxDriver();
	 driver.manage().window().maximize();
	 driver.get("http://mammootty.com/");
	 driver.navigate().back();
	 driver.navigate().forward();
	 driver.navigate().to("https://www.selenium.dev/");
	
 }
	public static void main(String[] args) 
	{
		NavigationProgram obj=new NavigationProgram();
		obj.chrome_Navigation();
		obj.edge_Navigation();
		obj.firefox_navigation();

	}

}
