package com.eCommerce;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import eCommerce.testBase.TestBase;


public class TestDataDriverScript_B extends TestBase
{
		@DataProvider(name="testData")
		public Object[][] dataSource(){
		return getData("TestData.xlsx", "Sheet1");
}
	
	@Test(dataProvider="testData")
	public void testLogin(String userName, String password, String runmode){
		System.out.println("userName:-"+userName);
		System.out.println("password:-"+password);
		System.out.println("runmode:-"+runmode);
		//driver.findElement(By.xpath("")).sendKeys(userName);
		//driver.findElement(By.xpath("")).sendKeys(password);
		//driver.findElement(By.xpath("")).sendKeys(runmode);
	}

}