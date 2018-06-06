package browserProvider;

import org.openqa.selenium.WebDriver;

public class DriverProvider {

	private WebDriver driver;
	
	
	
	
	public WebDriver chromeDriver(){
		
		System.setProperty("webdriver.chrome.driver", "src/test/java/resources/chromedriver.exe");
		driver = new org.openqa.selenium.chrome.ChromeDriver();		
		return driver;
		
	}
		
	public WebDriver firefoxDriver(){
		return driver;
		
	}
	
	
	public WebDriver safariWebDriver(){
		return driver;
		
	}
	
		
		
	
	
	
	
	
}
