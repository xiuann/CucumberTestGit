package com.testPageFactory.manager;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PF_01_LoginAndPasswordPage {

	
	@FindBy(how=How.XPATH, using = "/html/body/form/table/tbody/tr[1]/td[2]/input")
	private WebElement loginTextField;

	@FindBy(how=How.XPATH, using = "/html/body/form/table/tbody/tr[2]/td[2]/input")
	private WebElement 	passwordTextField;
	
	@FindBy(how=How.XPATH, using = "/html/body/form/table/tbody/tr[3]/td[2]/input[1]")
	private WebElement loginButton;
	
	
	public void enterUserID(String text) {
		
		loginTextField.click();
		
		loginTextField.sendKeys(text);
		
		
	}
	
public void enterpassword(String text) {
		
		passwordTextField.click();
		
		passwordTextField.sendKeys(text);
	
}

public void clickLoginButton() {
	
	loginButton.click();
}



	
	
}
