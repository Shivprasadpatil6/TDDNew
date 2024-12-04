package com.sd.utilities;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

import com.sd.TestBase.TestBase;

public class UtilClass extends TestBase {
	
	public UtilClass(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//get url
	public String getWebPageUrl()
	{

   	 String url = driver.getTitle();
   	 return url;
//   	 String ExpectedTitle = "https://www.saucedemo.com/inventory.html";
//   	 Assert.assertEquals(ExpectedTitle, ActualTitle);

	}
	
	public static void takeSS(String filename)
	{
		String path="C:\\Users\\Lenovo\\eclipse-workspace\\SauceDemoData3NovFramework\\Screenshot\\";
	   try 
		{
			
			TakesScreenshot ts=(TakesScreenshot)driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
	        File des=new File(path+filename+".png");
	        FileUtils.copyFile(src, des);
		} 
	    catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}
}

		
	
        
    

	


