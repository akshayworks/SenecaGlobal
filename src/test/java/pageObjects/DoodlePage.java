package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DoodlePage {
	
	public WebDriver driver;
	
	By clickFirstDoodle=By.xpath("//*[@id=\"highlight\"]/ul/li[1]/div/div[1]/a/img");
	
	public DoodlePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}

	public WebElement clickFirstDoodle()
	{
		return driver.findElement(clickFirstDoodle);
		
	}
	
	public void getTitle()
	{
		
		String title=driver.getTitle();
		System.out.println(title);
		
	}
	
	public void getHyperlink(){
		
		String hyperlink=driver.getCurrentUrl();
		System.out.println(hyperlink);
	}

}
