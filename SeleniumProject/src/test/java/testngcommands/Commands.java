package testngcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import automationCore.Base;

public class Commands extends Base
{
	
 @Test	
 public void verifyUserLogin()
 {
	    driver.get("https://demowebshop.tricentis.com/login");
		WebElement email_field=driver.findElement(By.className("email"));
		email_field.sendKeys("sneha33@gmail.com");
		WebElement password_field=driver.findElement(By.className("password"));
		password_field.sendKeys("ghjkl67");
		WebElement login_field=driver.findElement(By.xpath("//input[@value='Log in']"));
	    login_field.click();
 }
 @Test
 public void verifyHomeTitle()
 {
	 driver.get("https://demowebshop.tricentis.com/");
	 String title=driver.getTitle();
	 System.out.println("Title is :" +title);
}
 @Test
 public void verifyRegistration()
 {    
	 boolean isButton;
	 driver.get("https://demowebshop.tricentis.com/register");
	 WebElement gender_fld=driver.findElement(By.id("gender-female"));
	 isButton=gender_fld.isSelected();
	 System.out.println("Gender field brfore selected : " +isButton);
	 gender_fld.click();
	 isButton=gender_fld.isSelected();
	 System.out.println("Gender field after selected : " +isButton);
	 WebElement fstname_fld=driver.findElement(By.id("FirstName"));
	 fstname_fld.sendKeys("Anjitha");
	 WebElement lstname_fld=driver.findElement(By.id("LastName"));
	 lstname_fld.sendKeys("Anji");
	 WebElement emailfld=driver.findElement(By.id("Email"));
	 emailfld.sendKeys("anjithaanji@gmail.com");
	 WebElement passwd_fld=driver.findElement(By.id("Password"));
	 passwd_fld.sendKeys("anjithanji");
	 WebElement cnfrmpasswd_fld=driver.findElement(By.id("ConfirmPassword"));
	 cnfrmpasswd_fld.sendKeys("anjithanji");
	 WebElement registr_fld=driver.findElement(By.id("register-button"));
	 registr_fld.click();
	 
 }
 
}
