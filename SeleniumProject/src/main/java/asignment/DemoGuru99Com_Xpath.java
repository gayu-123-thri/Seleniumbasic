package asignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoGuru99Com_Xpath 
{
	WebDriver driver;
	public void demo_guru99()
	{
	driver=new FirefoxDriver();
	driver.get("https://demo.guru99.com/test/newtours/register.php");
	driver.manage().window().maximize();
	WebElement fname_field=driver.findElement(By.xpath("//td[@style='font-family:Arial, Helvetica;font-size:13px;color:#000;padding:5px;']//input[@name='firstName']"));
	fname_field.sendKeys("Gayathri");
	WebElement lname_field=driver.findElement(By.xpath("//input[contains(@name,'lastName')]"));
	lname_field.sendKeys("VB");
	WebElement ph_field=driver.findElement(By.xpath("//input[@name='phone']"));
	ph_field.sendKeys("9674838902");
	WebElement email_field=driver.findElement(By.id("userName"));
	email_field.sendKeys("gayu2467@gmail.com");
	WebElement address_field=driver.findElement(By.xpath("//input[@name='address1']"));
	address_field.sendKeys("Thottathil veedu");
	WebElement city_field=driver.findElement(By.xpath("//input[starts-with(@name,'city')]"));
	city_field.sendKeys("kollam");
	WebElement state_field=driver.findElement(By.xpath("//input[starts-with(@name,'state')]"));
	state_field.sendKeys("kerala");
	WebElement postalcode_field=driver.findElement(By.xpath("//td[@style='font-family:Arial, Helvetica;font-size:13px;color:#000;padding:5px;']//input[@name='postalCode']"));
	postalcode_field.sendKeys("691365");
	WebElement country_field=driver.findElement(By.xpath("//option[text()='ANGOLA']"));
	country_field.click();
	WebElement uname_field=driver.findElement(By.xpath("//input[@id='email']"));
	uname_field.sendKeys("gayu2467");
	WebElement passwd_field=driver.findElement(By.xpath("//td[@style='font-family:Arial, Helvetica;font-size:13px;color:#000;padding:5px;']//input[@name='password']"));
	passwd_field.sendKeys("gayu123");
	WebElement cnfrmpasswd_field=driver.findElement(By.xpath("//td[@style='font-family:Arial, Helvetica;font-size:13px;color:#000;padding:5px;']//input[@name='confirmPassword']"));
	cnfrmpasswd_field.sendKeys("gayu123");
	WebElement submit=driver.findElement(By.xpath("//input[starts-with(@type, 'submit')]"));
	boolean issubmit=submit.isEnabled();
	System.out.println("Submit button is enabled :" +issubmit);
	submit.click();
	
	}

	public static void main(String[] args) 
	{
		DemoGuru99Com_Xpath obj=new DemoGuru99Com_Xpath();
		obj.demo_guru99();

	}

}
