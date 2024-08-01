package asignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Qabible_Demo_Alert 
{
	WebDriver driver;
	public void verify_alerts() 
	{
	 driver=new ChromeDriver();
	 driver.get("https://selenium.qabible.in/bootstrap-alert.php");
	 driver.manage().window().maximize();
	 WebElement normal_success_fld=driver.findElement(By.id("normal-btn-success"));
	 normal_success_fld.click();
	 Alert alert=driver.switchTo().alert();
	 alert.accept();
	 WebElement close_btn=driver.findElement(By.className("alert alert-success alert-normal-success"));
	 close_btn.click();
	 Alert alert1=driver.switchTo().alert();
	 alert.dismiss();
	 WebElement normal_warning_fld=driver.findElement(By.id("normal-btn-warning"));
	 normal_warning_fld.click();
	 Alert alert2=driver.switchTo().alert();
	 alert2.accept();
	
	}
	public void verify_bootstrap_model()
	{
		driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/bootstrap-modal.php");
		driver.manage().window().maximize();
		WebElement launch_fld=driver.findElement(By.xpath("//button[@data-target='#exampleModalCenter']"));
		launch_fld.click();
		Alert alert=driver.switchTo().alert();
		String msg=alert.getText();
		System.out.println("Alert msg is :" +msg);
		alert.accept();
		
		
	}
	public static void main(String[] args) 
	{
		Selenium_Qabible_Demo_Alert obj=new Selenium_Qabible_Demo_Alert();
		  obj.verify_alerts();
		//obj.verify_bootstrap_model();
	}

}
