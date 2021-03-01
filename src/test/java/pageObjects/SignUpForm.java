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
	By day=By.id("day");
	
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
	
	public WebElement day()
	{
		
		return driver.findElement(day);
		Select dayobj=new Select(driver);
		
	}
	
	public WebElement fName()
	{
		
		return driver.findElement(fname);
	}

}
