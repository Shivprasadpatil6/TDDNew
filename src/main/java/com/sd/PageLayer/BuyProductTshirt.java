package com.sd.PageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyProductTshirt {
	
	public void BuyProductTshirt(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//-------
	
	@FindBy(xpath="//div[text()='Sauce Labs Bolt T-Shirt']")
	private WebElement TshirtClick;
	
	@FindBy(xpath="//button[@class='btn btn_primary btn_small btn_inventory']")
	private WebElement TshirtAddToCart_button;
	
	
	
	
	
  public void Tshirt()
	{
		TshirtClick.click();
	}
   
   public void TshirtAddToCart()
   {
	   TshirtAddToCart_button.click();
   }

}
