package asignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SaucedemoProject_Elements_Commands 
{
 public void verify_Saucedemo_show()
 {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.saucedemo.com/");
	 WebElement username_field=driver.findElement(By.id("user-name"));
	 username_field.sendKeys("standard_user");
	 WebElement password_field=driver.findElement(By.id("password"));
	 password_field.sendKeys("secret_sauce");
	 WebElement login_field=driver.findElement(By.name("login-button"));
	 login_field.click();
 }
	public static void main(String[] args) 
	{
		SaucedemoProject_Elements_Commands obj=new SaucedemoProject_Elements_Commands();
		obj.verify_Saucedemo_show();

	}

}
