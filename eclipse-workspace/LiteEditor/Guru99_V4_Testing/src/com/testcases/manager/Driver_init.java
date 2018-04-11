package com.testcases.manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver_init {
	
	
	
	private WebDriver driver;

	public WebDriver getChromeDriver() {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\bishnu\\Documents\\Jeevan QA Practise Material\\chromedriver.exe");
			
		  
		  driver=new ChromeDriver();
		
		
		return driver;
	}

	public WebDriver getFireFoxDriver() {
		
		System.setProperty("webdriver.firefox.driver", "C:\\Users\\bishnu\\Documents\\Jeevan QA Practise Material\\geckodriver.exe");
		
	  
	  driver=new FirefoxDriver();
	  
	
	
	return driver;
}
	
	
	
}
