package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "E:\\Selenium\\Akshay\\SenecaGlobal\\src\\test\\java\\features\\senecaGlobal.features", 
		glue={"stepDefinitions"} 			
		)
public class TestRunner {

}
