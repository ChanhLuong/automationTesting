package com.eCommerce;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import eCommerce.testBase.TestBase;

public class testDataDriverScript extends TestBase
{
	@DataProvider(name = "testData")
	public Object[][] DataSource()
	{
		return getData("TestData.xlsx", "Sheet2");
	}
	@Test(dataProvider = "testData")
	public void testLog(String Username, String Password, String RunMode)
	{
		//System.out.println(Username);
		//System.out.println(Password);
		//System.out.println(RunMode);
	}
}
