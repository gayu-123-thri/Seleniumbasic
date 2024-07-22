package com.selenium.basics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Commands 
{
   public void webelementCommands()
   {
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://demowebshop.tricentis.com/");
	   //interface 
	   WebElement register_Field=driver.findElement(By.className("ico-register"));  /// find elements from register field
	   register_Field.click();
	   WebElement firstName_Field=driver.findElement(By.id("FirstName"));
	   firstName_Field.sendKeys("Gayathri");
   }
   public void verify_User_Registration()
   {
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://demowebshop.tricentis.com/");
	   WebElement register_Field=driver.findElement(By.className("ico-register"));
	   register_Field.click();
	   WebElement gender=driver.findElement(By.id("gender-female"));
	   gender.click();
	   WebElement firstName_Field=driver.findElement(By.id("FirstName"));
	   firstName_Field.sendKeys("Gayathri");
	   WebElement last_Name=driver.findElement(By.id("LastName"));
	   last_Name.sendKeys("V");
	   WebElement email=driver.findElement(By.id("Email"));
	   email.sendKeys("gayathri713@gmail.com");
	   WebElement password=driver.findElement(By.id("Password"));
	   password.sendKeys("asdfgh123");
	   WebElement  confirm_password=driver.findElement(By.id("ConfirmPassword"));
	   confirm_password.sendKeys("asdfgh123");
	   WebElement register_field=driver.findElement(By.id("register-button"));
	   register_field.click();
   }
	public static void main(String[] args) 
	{
		Commands obj=new Commands();
	//	obj.webelementCommands();
		obj.verify_User_Registration();

	}

}
