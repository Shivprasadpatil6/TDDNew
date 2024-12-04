package com.sd.TestBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBase {
	public static WebDriver driver;
	@BeforeMethod
	public void SetUp()
	{
		
		String br="Chrome";
		if(br.equalsIgnoreCase("Chrome")) 
		{
		   driver=new ChromeDriver();
		
		}
		else if(br.equalsIgnoreCase("Edge"))
		{
			driver =new EdgeDriver();
			
		}
		else if(br.equalsIgnoreCase("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("Please provide correct browser name");
		}
		 driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
//	@AfterMethod
//	public void tearDown()
//	{
//	    driver.quit();
//	}

}
