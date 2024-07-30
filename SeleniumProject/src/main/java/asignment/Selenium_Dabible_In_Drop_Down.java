package asignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium_Dabible_In_Drop_Down 
{
	WebDriver driver;
	public void verify_drop_down() 
	{
		driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/drag-drop.php");
		driver.manage().window().maximize();
		WebElement drag1_fld=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		WebElement drop1_fld=driver.findElement(By.id("mydropzone"));
		Actions action=new Actions(driver);
		action.dragAndDrop(drag1_fld, drop1_fld).build().perform();
		WebElement drag2_fld=driver.findElement(By.xpath("//span[text()='Draggable n°2']"));
		WebElement drop2_fld=driver.findElement(By.id("mydropzone"));
		Actions action1=new Actions(driver);
		action1.dragAndDrop(drag2_fld, drop2_fld).build().perform();
		WebElement drag3_fld=driver.findElement(By.xpath("//span[text()='Draggable n°3']"));
		WebElement drop3_fld=driver.findElement(By.id("mydropzone"));
		Actions action2=new Actions(driver);
		action2.dragAndDrop(drag3_fld, drop3_fld).build().perform();
		WebElement drag4_fld=driver.findElement(By.xpath("//span[text()='Draggable n°4']"));
		WebElement drop4_fld=driver.findElement(By.id("mydropzone"));
		Actions action3=new Actions(driver);
		action3.dragAndDrop(drag4_fld, drop4_fld).build().perform();
	}
	
	public static void main(String[] args) 
	{
		Selenium_Dabible_In_Drop_Down  obj=new Selenium_Dabible_In_Drop_Down();
		obj.verify_drop_down();
	}

}
