package com.sd.PageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyProductPage1 {
	
	public BuyProductPage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement BackPack;
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement cartLink;
	
	@FindBy(xpath="//button[text()='Checkout']")
	private WebElement Checkout_button;
	
	@FindBy(xpath="//input[@id='first-name']")
	private WebElement firstname_txtbox;
	
	@FindBy(xpath="//input[@id='last-name']")
	private WebElement lastname_txtbox;
	
	@FindBy(xpath="//input[@id='postal-code']")
	private WebElement pincode_box;
	
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement continue_button;
	
	@FindBy(xpath="//button[text()='Finish']")
	
	private WebElement finish_button;
	
	
	
	public void Backpack()
	{
		BackPack.click();
	}
	
	public void Cartlink()
	{
		cartLink.click();
	}
	public void Checkout()
	{
		Checkout_button.click();
	}
	public void FirstName(String firstname )
	{
		firstname_txtbox.sendKeys(firstname);
	}
	public void LastName(String lastname)
	{
		lastname_txtbox.sendKeys(lastname);
	}
	public void PinCode(String pincode)
	{
		pincode_box.sendKeys(pincode);
	}
	
	public void ContinueButton()
	{
		continue_button.click();
	}
	public void FinishButton()
	{
		finish_button.click();
	}
	
	
	
	
	
	
	
	
	
}
