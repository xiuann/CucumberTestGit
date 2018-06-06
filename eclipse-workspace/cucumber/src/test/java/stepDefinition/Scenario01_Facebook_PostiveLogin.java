package stepDefinition;

import org.junit.After;
import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import browserProvider.DriverProvider;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.FacebookLoginPage;

public class Scenario01_Facebook_PostiveLogin {
	
	private WebDriver driver = null;
	private FacebookLoginPage lp = null;

	@Given("^I am on Facebook Login Page$")
	public void i_am_on_Facebook_Login_Page() {
		browserProvider.DriverProvider bp = new DriverProvider();
		driver = bp.chromeDriver();
		lp = PageFactory.initElements(driver, page.FacebookLoginPage.class);		
		driver.navigate().to("http://www.facebook.com");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#email")));
			}

	@When("^I provide postive id and password$")
	public void i_provide_postive_id_and_password() {
	    lp.getUseridInputField().sendKeys("xiuann");
	    
	    
		lp.getPasswordInputField().sendKeys("Silversurfer9!1");
		
		
		
		lp.getLoginButton().click();
		
	}

	@Then("^I should see the Facebook feed homepage$")
	public void i_should_see_the_Facebook_feed_homepage() {
	    		
		
		
	}
	
	@Then(value = "^Close the browser$")
	public void close() {
		driver.close();
	}

		
	
	
}
