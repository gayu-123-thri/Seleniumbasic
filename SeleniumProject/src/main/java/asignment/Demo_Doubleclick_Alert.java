package asignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Demo_Doubleclick_Alert 
{
     
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		WebElement dbl_clk_fld=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions action=new Actions(driver);
		action.doubleClick(dbl_clk_fld).build().perform();
		Alert alert=driver.switchTo().alert();
		alert.accept();
	}

}
