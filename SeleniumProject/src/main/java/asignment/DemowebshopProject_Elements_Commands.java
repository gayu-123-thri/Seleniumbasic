package asignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
public class DemowebshopProject_Elements_Commands 
{
	public void verify_demo_show()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		WebElement email_field=driver.findElement(By.className("email"));
		email_field.sendKeys("sneha33@gmail.com");
		WebElement password_field=driver.findElement(By.className("password"));
		password_field.sendKeys("ghjkl67");
		WebElement login_field=driver.findElement(By.className("button-1 login-button"));
	    login_field.click();		
	}

	public static void main(String[] args) 
	{
		DemowebshopProject_Elements_Commands  obj=new DemowebshopProject_Elements_Commands();
		obj.verify_demo_show();

	}

}
