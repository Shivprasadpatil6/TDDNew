package com.sd.PageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	///------------Obj repository
	
	@FindBy(xpath="//input[@id='user-name']")
	private WebElement username_textbox;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement passowrd_textbox;
	
	@FindBy(xpath="//input[@id='login-button']")
	private WebElement login;
	
	///--action method----
	
	public void enterUsername(String username)
	{
		username_textbox.sendKeys(username);
	}
	public void enterPassword(String password)
	{
		passowrd_textbox.sendKeys(password);
	}
	public void ClickOnLogin()
	{
		login.click();
	}
}
