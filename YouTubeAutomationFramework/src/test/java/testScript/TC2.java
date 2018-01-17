package testScript;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.BaseClass;
import pom.Login;

public class TC2 extends TC1
{
	

	@Test(priority=1)
	public void Subscription() throws Exception
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath(prop.getProperty("SubscribeBtn"))).click();
	}
}