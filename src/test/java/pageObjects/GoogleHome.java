package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleHome {

	public WebDriver driver;

	By i_am_feeling_lucky = By.xpath("/html/body/div[1]/div[3]/form/div[2]/div[1]/div[3]/center/input[2]");

	public GoogleHome(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement clickButton() {

		return driver.findElement(i_am_feeling_lucky);
	}

}
