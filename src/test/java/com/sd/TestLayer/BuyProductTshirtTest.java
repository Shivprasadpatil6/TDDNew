package com.sd.TestLayer;

import org.testng.annotations.Test;

import com.sd.PageLayer.BuyProductPage1;
import com.sd.PageLayer.BuyProductTshirt;
import com.sd.PageLayer.LoginPage;
import com.sd.TestBase.TestBase;
import com.sd.utilities.UtilClass;

public class BuyProductTshirtTest extends TestBase {
	
	@Test
	public void BuyProductFunctinality() throws InterruptedException
	{
		LoginPage login_obj=new LoginPage(driver);
		UtilClass util_obj=new UtilClass(driver);
		login_obj.enterUsername("standard_user");
		login_obj.enterPassword("secret_sauc");
		login_obj.ClickOnLogin();
		Thread.sleep(5000);
		BuyProductTshirt tshirt_obj=new BuyProductTshirt();
		
		tshirt_obj.Tshirt();
		tshirt_obj.TshirtAddToCart();
		
	}

}
