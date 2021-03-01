package Cucumber.SenecaGlobal;

import org.openqa.selenium.WebDriver;

import pageObjects.SignUpForm;

public class MainClass {
	
	public WebDriver driver;
	
	public MainClass(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}

	public void initiator(){
		
		SignUpForm si=new SignUpForm(driver);
		si.fName().sendKeys("Akshay");
		si.lName().sendKeys("Ch");
		si.mobileNo().sendKeys("123456");
		si.password().sendKeys("ABCDE");
		si.gender().click();
		si.signUp().click();
		
	}

}
