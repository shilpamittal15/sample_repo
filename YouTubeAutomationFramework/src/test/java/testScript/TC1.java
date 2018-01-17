package testScript;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import base.BaseClass;
import pom.Login;
import utility.ExcelReading;
import utility.LogsUtil;

public class TC1 extends BaseClass 
{
	
	Login log;
	LogsUtil logU;
	ExcelReading fatchingExcel;

	@Test(priority=0)
	public void Trending() throws Exception
	{
		log=new Login(driver,prop);
		logU=new LogsUtil();
		fatchingExcel=new ExcelReading(".//ExcelData.xlsx");
		//fatchingExcel.excel(".//ExcelReading.xlsx");
	String UserName=fatchingExcel.getData(0, 1, 0);
		String password=fatchingExcel.getData(0, 1, 0);
		
		log.LoginUser(UserName, password);
		//log.LoginUser("automation1testinguser@gmail.com", "shilpa@123");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='endpoint']/span[contains(text(),'Trending')]")).click();
		logU.logs("Entered in Trends", "TC1");
	}
}
