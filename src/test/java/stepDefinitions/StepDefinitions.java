package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Cucumber.SenecaGlobal.MainClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.DoodlePage;
import pageObjects.FaceBookHome;
import pageObjects.GoogleHome;

public class StepDefinitions {
	public WebDriver driver;
	public WebDriver driver2;

	@Given("^User is on Google Home URL$")
	public void user_is_on_Google_Home_URL() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

	}

	@When("^User clicks I am Feeling Lucky button$")
	public void user_clicks_I_am_Feeling_Lucky_button() throws Throwable {

		GoogleHome gh = new GoogleHome(driver);
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		gh.clickButton().click();

	}

	@Then("^User clicks on first Doodle$")
	public void user_clicks_on_first_Doodle() throws Throwable {

		DoodlePage dp = new DoodlePage(driver);
		dp.clickFirstDoodle().click();
		dp.getTitle();

	}

	@Given("^User is on Facebook Home Page$")
	public void user_is_on_Facebook_Home_Page() throws Throwable {

		driver2= new ChromeDriver();
		driver2.get("https://www.facebook.com/");

	}

	@When("^User Clicks on Create New Account$")
	public void user_Clicks_on_Create_New_Account() throws Throwable {

		FaceBookHome fbh = new FaceBookHome(driver2);
		fbh.clickButton().click();

	}

	@Then("^User fills Signup form and Submits$")
	public void user_fills_Signup_form_and_Submits() throws Throwable {
		
		MainClass mc=new MainClass(driver2);
		mc.initiator();

	}

}
