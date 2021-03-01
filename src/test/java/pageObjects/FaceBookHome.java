package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FaceBookHome {
	
	public WebDriver driver;
	
	By clickButton=By.id("u_0_2_4fu_0_2_4f");
	
	public FaceBookHome(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}

	public WebElement clickButton(){
		
		return driver.findElement(clickButton);
	}

}
