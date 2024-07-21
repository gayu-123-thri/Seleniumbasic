package com.selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MicrosoftEdgeWebDriver 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://chatgpt.com/");
		String title=driver.getTitle();
		System.out.println("Title name is : " +title);
		String url=driver.getCurrentUrl();
		System.out.println("Current url is : " +url);
	    String handle=driver.getWindowHandle();		
	    System.out.println("Handled code is : " +handle);
	    String source=driver.getPageSource();
	    System.out.println("Source page is : " +source);
	    driver.close();
	}

}
