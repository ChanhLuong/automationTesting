package com.eCommerce;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TC01 
{
	WebDriver driver;
	@Test
	public void testLogin()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\meo meo\\workspace\\OpenWebPage\\geckodriver.exe");		
		driver = new FirefoxDriver();
		
	}

}
