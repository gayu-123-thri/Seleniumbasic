package com.selenium.basics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch 
{
   
	public static void main(String[] args) 
	
	{   //interface  //reference  //class name
		WebDriver driver=new ChromeDriver();     //launch browser
		driver.manage().window().maximize();     // command to maximize the window
		driver.get("https://in.search.yahoo.com/search?fr=mcafee&type=E211IN714G0&p=maven+repository");  // get method to up or launch the url
        String title=driver.getTitle();  // getTititle method to get the title of launched webpage by using string variable
        System.out.println("Web page Title is :" +title);
        String url=driver.getCurrentUrl();  // getCurrentUrl method to get the current url of launched webpage.
        System.out.println("Current url is :" +url);
        String handleid=driver.getWindowHandle();    // used to get the handle id of current webpage(each webpage has handle id)
        System.out.println("Window handle id is :" +handleid);
        String source=driver.getPageSource();  //to get the source code from the current webpage(html code)
        System.out.println("Source page is :" +source);
        //driver.close();   // used to close current window
       // driver.quit();    //used to close all  opened web pages
	}

}
