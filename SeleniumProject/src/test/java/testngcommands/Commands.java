package testngcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.Base;

public class Commands extends Base
{
	
 @Test	
 public void verifyUserLogin()
 {
	    driver.get("https://demowebshop.tricentis.com/login");
		WebElement email_field=driver.findElement(By.className("email"));
		String expectedresult="sneha33@gmail.com";
		email_field.sendKeys(expectedresult);
		WebElement password_field=driver.findElement(By.className("password"));
		password_field.sendKeys("ghjkl67");
		WebElement login_field=driver.findElement(By.xpath("//input[@value='Log in']"));
	    login_field.click();
	    WebElement email_fld=driver.findElement(By.xpath("//a[text()='sneha33@gmail.com']"));
	    String actualresult=email_fld.getText();
	    Assert.assertEquals(actualresult, expectedresult, "Invalid Login");
 }
 @Test
 public void verifyHomeTitle()
 {
	 driver.get("https://demowebshop.tricentis.com/");
	 String title=driver.getTitle();
	// System.out.println("Title is :" +title);
	 String expectedtitle="Demo Web Shop";
	 Assert.assertEquals(title, expectedtitle, "Invalid title");
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
	 emailfld.sendKeys("anjitha@gmail.com");
	 WebElement passwd_fld=driver.findElement(By.id("Password"));
	 passwd_fld.sendKeys("anjithanji123");
	 WebElement cnfrmpasswd_fld=driver.findElement(By.id("ConfirmPassword"));
	 cnfrmpasswd_fld.sendKeys("anjithanji123");
	 WebElement registr_fld=driver.findElement(By.id("register-button"));
	 registr_fld.click();
	 WebElement register_successmsg=driver.findElement(By.className("result"));
	 String actualresult=register_successmsg.getText();
	 String expectedresult="Your registration completed";
	 Assert.assertEquals(actualresult, expectedresult, "Registration not success");
 }
 @Test
 
 public void verify_Is_selected()
 {   
	  boolean isButtonselected;
	  driver.get("https://demowebshop.tricentis.com/register");
	   WebElement gender_field=driver.findElement(By.id("gender-male"));
	   isButtonselected=gender_field.isSelected();
	   Assert.assertFalse(isButtonselected, "button not selected");
	   //gender_field.click();
	   isButtonselected=gender_field.isSelected();
	  Assert.assertTrue(isButtonselected, "button is selected" );
	  
 }
 
 @Test
 public void verify_Is_displayed()
 {
	 driver.get("https://demowebshop.tricentis.com/");
	   WebElement vote_displayed_field=driver.findElement(By.id("vote-poll-1"));
	   boolean isDisplayselected=vote_displayed_field.isDisplayed();
	 //  System.out.println("Vote elemnt is displayed :" + isDisplayselected);
	   //String expectedresult=vote_displayed_field.getText();
	   Assert.assertTrue(isDisplayselected, "Not found");
 }
 @Test
 
 public void verify_is_Enabled() 
 {
	   driver.get("https://demowebshop.tricentis.com/");
	   WebElement subscription_field=driver.findElement(By.id("newsletter-subscribe-button"));
	   boolean issubscriptionenabled=subscription_field.isEnabled();
	  // System.out.println("Subscription button is enabled : " +issubscriptionenabled);
	   Assert.assertTrue(issubscriptionenabled, "Enabled");
 }
}