package com.testPageFactory.manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testcases.manager.Driver_init;

public class PF_03_ChangePasswordPage {
	@FindBy(how=How.XPATH, using="/html/body/div[3]/div/ul/li[11]/a")
	private WebElement changePasswordButton;
	
	@FindBy(how=How.XPATH, using="/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input")
	private WebElement oldPasswordTextField;
	
	@FindBy(how=How.XPATH, using="/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input")
	private WebElement newPasswordTextField;
	
	
	@FindBy(how=How.XPATH, using="/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[2]/input")
	private WebElement confirmPasswordTextField;
	
	
			
	@FindBy(how=How.XPATH, using="/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/input[1]")
	private WebElement submitButton;
	
	
	
	public void clickChangePassword() {
		
		changePasswordButton.click();
		
	}
	
	public void enterOldPassword(String text) {
		
		oldPasswordTextField.click();
		oldPasswordTextField.sendKeys(text);
		
		
	}
	
public void enterNewPassword(String text) {
		
		newPasswordTextField.click();
		newPasswordTextField.sendKeys(text);
		
		
	}
	
public void enterConfirmPassword(String text) {
	
	confirmPasswordTextField.click();
	confirmPasswordTextField.sendKeys(text);
	
	
}


public void clickSubmitButton() {
	submitButton.click();
}

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
