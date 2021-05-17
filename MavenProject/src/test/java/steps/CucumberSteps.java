package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CucumberSteps {
	
	public ChromeDriver driver;
@Given("Open Chrome Browser")
public void openChrome() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
}
@Given("Load the application URL")
public void loadUrl() {
	driver.get("http://leaftaps.com/opentaps/");
}
@Given("Enter the username as Demosalesmanager")
public void enterUserName() {
	driver.findElementById("username").sendKeys("DemoSalesManager");
	
}
@Given("Enter the password as crmsfa")
public void enterPassword() {
	driver.findElementById("password").sendKeys("crmsfa");
	
}
@When("Click on Login button")
public void clickLogin() {
	driver.findElementByClassName("decorativeSubmit").click();
}
@Then("Homepage should be displayed")
public void verifyHomePage() {
	System.out.println("Verfiy Home Page is displayed");
	
}
}
