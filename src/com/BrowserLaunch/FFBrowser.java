package com.BrowserLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FFBrowser {
	
	@Test
	
	public static void invokeBrowser()
	{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.uk/");
		
	}
	

}
