package asignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames_Practice 
{ 
   WebDriver driver;
   public void verify_frames()
    {
	  driver=new ChromeDriver();
	  driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
	  driver.manage().window().maximize();
	  List<WebElement> frame_fld=driver.findElements(By.id("iframe"));
	  int no_of_frames=frame_fld.size();
	  System.out.println("No:of Frames are : " +no_of_frames);
	  WebElement box_fld=driver.findElement(By.id("name"));
	  box_fld.sendKeys("Frame Website");
	  WebElement frame=driver.findElement(By.id("frm1"));
	  driver.switchTo().frame(frame);
	  WebElement dropdown_fld=driver.findElement(By.xpath("//select[@class='selectnav' and @id='selectnav1']"));
	  dropdown_fld.sendKeys("Dropdowns");
	 // Select select =new Select(dropdown_fld);
	  //select.selectByVisibleText("TestNG");
	  WebElement select_fld=driver.findElement(By.id("course"));
	  Select select1=new Select(select_fld);
	  select1.selectByVisibleText("Java");
	  WebElement frame2_fld=driver.findElement(By.id("frm2"));
	  driver.switchTo().frame(frame2_fld);
	  WebElement fname_fld=driver.findElement(By.xpath("//input[@fdprocessedid='2cmbe2']"));
	  fname_fld.sendKeys("Gayathri");
	  WebElement last_fld=driver.findElement(By.xpath("//input[@fdprocessedid='39htoq']"));
	  last_fld.sendKeys("V");
	//  driver.close();
	  
    }
	public static void main(String[] args) 
	{
		Frames_Practice  obj=new Frames_Practice();
		obj.verify_frames();
	}

}
