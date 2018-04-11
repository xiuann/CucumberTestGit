package com.testcases.manager;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testPageFactory.manager.PF_01_LoginAndPasswordPage;
import com.testPageFactory.manager.PF_03_ChangePasswordPage;

public class TS_01_LoginAndPassword {

	private WebDriver driver;
	
	@BeforeMethod
	  public void beforeMethod() {
		Driver_init driverInit = new Driver_init();
		driver = driverInit.getChromeDriver();
		
		driver.navigate().to("http://demo.guru99.com/V4/");
		driver.manage().window().maximize();
		
		 
	 }
	
	
	
	
	@Test(groups="TS_Login",priority=1)
	public void tc_01_positiveLoginTest() {
		
		PF_01_LoginAndPasswordPage lp = PageFactory.initElements(driver, PF_01_LoginAndPasswordPage.class);
		
		lp.enterUserID("mngr126338");
		lp.enterpassword("UmEbuse");
		lp.clickLoginButton();
	
		
		
	}
	
	
	@Test(groups="TS_Login", priority =1)
	public void tc_02_negativeLoginTest() {
		
		PF_01_LoginAndPasswordPage lp = PageFactory.initElements(driver, PF_01_LoginAndPasswordPage.class);
		
		
		lp.enterUserID("mngr126330");
		lp.enterpassword("UmEbuse");
		lp.clickLoginButton();
		
	
	      

		
		
	
		
		
		
	}
	
	
	
	@Test(groups="TS_Change Password", priority= 3)
	public void tc_03_negativeChangePassword() {

		PF_03_ChangePasswordPage cp = PageFactory.initElements(driver, PF_03_ChangePasswordPage.class);
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div/ul/li[11]/a")));
		
		cp.clickChangePassword();
		cp.enterOldPassword("123455!");
		cp.enterNewPassword("123456!");
		cp.enterConfirmPassword("123456!");
		cp.clickSubmitButton();
		driver.switchTo().alert().accept();
		
		String changePasswordVerify = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/p")).getText();
		System.out.println(changePasswordVerify);
		
		System.out.println(driver.getTitle());
		
		
		
		
		
		
		

	}



	
	
	
	
}
