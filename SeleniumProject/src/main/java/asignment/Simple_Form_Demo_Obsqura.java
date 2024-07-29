package asignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Simple_Form_Demo_Obsqura 
{
   WebDriver driver;
   public void verify_simple_form_demo()
   {   driver=new ChromeDriver();
       boolean ischeckbox, isradiobox, isgender;
	   driver.get("https://selenium.qabible.in/simple-form-demo.php");
	   driver.manage().window().maximize();
	   WebElement msg_fld=driver.findElement(By.xpath("//input[starts-with(@placeholder,'Message')]"));
	   msg_fld.sendKeys("Hello Selenium");
	   WebElement show_msg_fld=driver.findElement(By.xpath("//button[text()='Show Message']"));
	   show_msg_fld.click();
	   WebElement value_a=driver.findElement(By.xpath("//input[contains(@id,'value-a')]"));
	   value_a.sendKeys("9");
	   WebElement value_b=driver.findElement(By.xpath("//input[contains(@id,'value-b')]"));
	   value_b.sendKeys("12");
	   WebElement get_btn_fld=driver.findElement(By.xpath("//button[text()='Get Total']"));
	   get_btn_fld.click();
	   WebElement check_box_demo_fld=driver.findElement(By.xpath("//a[text()='Checkbox Demo']"));
	   check_box_demo_fld.click();
	   WebElement check_box_fld=driver.findElement(By.xpath("//input[starts-with(@class,'form-check-input')]"));
	   ischeckbox=check_box_fld.isSelected();
	   System.out.println("Check box before selected is :" +ischeckbox);
	   check_box_fld.click();
	   ischeckbox=check_box_fld.isSelected();
	   System.out.println("Check box afer selected is :" +ischeckbox);
	   WebElement selectall_fld=driver.findElement(By.xpath("//input[@value='Select All']"));
	   selectall_fld.click();
	   WebElement radio_btn_fld=driver.findElement(By.xpath("//a[text()='Radio Buttons Demo']"));
	   radio_btn_fld.click();
	   WebElement female_fld=driver.findElement(By.xpath("//input[@name='inlineRadioOptions' and  @id='inlineRadio2']"));
	   isradiobox=female_fld.isSelected();
	   System.out.println("Radio button is selected : " +isradiobox);
	   female_fld.click();
	   isradiobox=female_fld.isSelected();
	   System.out.println("Radio button is selected : " +isradiobox);
	   WebElement show_slctd_value_fld=driver.findElement(By.xpath("//button[@id='button-one' or @fdprocessedid='ucbg3']"));
	   show_slctd_value_fld.click();
	   WebElement patient_gendr_radiobtn=driver.findElement(By.xpath("//input[@id='inlineRadio21']"));
	   isgender=patient_gendr_radiobtn.isSelected();
	   System.out.println("patient gender before selected is :" +isgender);
	   patient_gendr_radiobtn.click();
	   isgender=patient_gendr_radiobtn.isSelected();
	   System.out.println("patient gender after selected is :" +isgender);
	   WebElement patient_age=driver.findElement(By.xpath("//input[@id='inlineRadio23']"));
	   patient_age.click();
	   WebElement get_result_btn=driver.findElement(By.xpath("//button[@id='button-two']"));
	   get_result_btn.click();
	   WebElement select_input=driver.findElement(By.xpath("//a[text()='Select Input']"));
	   select_input.click();
	   WebElement select_clr=driver.findElement(By.xpath("//select[@id='single-input-field']"));
	   Select select=new Select(select_clr);
	   select.selectByVisibleText("Yellow");
	   WebElement get_first_slct_btn=driver.findElement(By.xpath("//button[text()='Get First Selected']"));
	   Select select1=new Select(get_first_slct_btn);
	   select1.selectByVisibleText("Red");
	   //get_first_slct_btn.click();
	//   Select select1=new Select(get_first_slct_btn);
	  // WebElement get_first_slct_btn1=select.getFirstSelectedOption();
	 //  System.out.println("First selector clr is:" +get_first_slct_btn1.getText());
   }
   
	public static void main(String[] args) 
	{
		Simple_Form_Demo_Obsqura obj=new Simple_Form_Demo_Obsqura();
		obj.verify_simple_form_demo();

	}
	
}
