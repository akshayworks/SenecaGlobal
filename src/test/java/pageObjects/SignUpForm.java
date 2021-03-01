package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class SignUpForm {
	
	public WebDriver driver;
	
	By fname=By.name("firstname");
	By lname=By.name("lastname");
	By mobileNo=By.name("reg_email__");
	By password=By.name("reg_passwd__");
	//By day=By.id("day");
	By gender=By.xpath("//*[@id=\"u_2_o_dt\"]/span[2]/label");
	By signUp=By.name("websubmit");
	
	public SignUpForm(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement fName()
	{
		
		return driver.findElement(fname);
	}
	
	public WebElement lName()
	{
		
		return driver.findElement(lname);
	}
	
	public WebElement mobileNo()
	{
		
		return driver.findElement(mobileNo);
	}
	
	public WebElement password()
	{
		
		return driver.findElement(password);
	}
	
	/*public WebElement day()
	{
		
		return driver.findElement(day);
		
		
	}*/
	
	public WebElement gender()
	{
		
		return driver.findElement(gender);
	}
	
	public WebElement signUp()
	{
		
		return driver.findElement(signUp);
	}
	

	
	
}
