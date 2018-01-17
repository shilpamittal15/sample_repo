package pom;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.ExcelReading;

public class Login 
{
	public WebDriver driver;
	public Properties prop;
	ExcelReading fatchingExcel;
	
	public Login(WebDriver driver,Properties prop)
	{
		this.driver=driver;
		this.prop=prop;
	}
	
	public void LoginUser(String username, String Password) throws Exception
	{
		System.out.println("this is login code execution from Login class");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//paper-button[@id='button']/yt-formatted-string")).click();
		Thread.sleep(3000);
		
		
		driver.findElement(By.id("identifierId")).sendKeys(username);
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='password']/div/div/div/input")).sendKeys(Password);
		
		driver.findElement(By.xpath("//div[@id='passwordNext']")).click();
		
	}
}
