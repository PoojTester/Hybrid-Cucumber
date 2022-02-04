package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Adminpage {
	WebDriver driver;
	public void admintestcase() {
	    driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']")).click();
	    driver.findElement(By.xpath("//*[@id='menu_admin_UserManagement']")).click();
	    driver.findElement(By.xpath("//*[@id='menu_admin_viewSystemUsers']")).click();
	    driver.findElement(By.xpath("//input[@name='searchSystemUser[userName]']")).sendKeys("Admin");
	    Select username=new Select(driver.findElement(By.xpath("//*[@id='searchSystemUser_userType']")));
	    username.selectByIndex(2);
	    driver.findElement(By.xpath("//*[@id='searchSystemUser_employeeName_empName']")).sendKeys("Arslan Momin");
	    Select status=new Select(driver.findElement(By.xpath("//*[@id='searchSystemUser_status']")));
	    status.selectByIndex(1);
	    driver.findElement(By.xpath("//*[@id='searchBtn']")).click();
	    }
	
	}
