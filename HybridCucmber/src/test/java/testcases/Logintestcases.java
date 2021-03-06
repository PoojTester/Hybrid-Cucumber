package testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclass.Libraryclass;
import pages.Loginpage;
import seleniumreuseablefunction.Seleniumutility;

public class Logintestcases extends Libraryclass {
	Seleniumutility selenium;
	Loginpage lp;
	@BeforeMethod
	public void openapp()
	{
		browserSetUp();
	}
	@Test
	public void login()
	{
		 lp=new Loginpage(driver);
		lp.login("Admin","admin123");
		lp.submit();
	}
	
	@AfterMethod
	public void teardown() throws IOException
	{
	 selenium=new Seleniumutility(driver);
		selenium.screenshot("C:\\Users\\HP\\git\\Hybrid-Cucumber\\HybridCucmber\\src\\test\\resources\\Screenshots\\login.png");
		 tearDown();
	}
}

