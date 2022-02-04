package testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclass.Libraryclass;
import pages.Adminpage;
import pages.Loginpage;
import seleniumreuseablefunction.Seleniumutility;

public class Admintestcase extends Libraryclass{
		Seleniumutility selenium;
		Adminpage Ap;
		Loginpage lp;
		@BeforeMethod
		public void openapp()
		{
			//launchapp("chrome","https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
		}
		@Test(priority=1)
		public void login()
		{
			 lp.login("Admin","admin123");
			 lp.submit();
			
	    }
		@Test(priority=2)
		public void Admin()
		{
			 Ap.admintestcase();
			
	    }
		
		@AfterMethod
		public void teardown() throws IOException
		{
		 selenium=new Seleniumutility(driver);
			selenium.screenshot("C:\\Users\\HP\\git\\Hybrid-Cucumber\\HybridCucmber\\src\\test\\resources\\Screenshots\\Admin.png");
			
		}
}
