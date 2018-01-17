package testScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseClass;
import pom.Login;

public class TC4 extends BaseClass
{
	Login log;

	@Test
	public void playAndLike() throws Exception
	{
		log=new Login(driver,prop);
		log.LoginUser("automation1testinguser@gmail.com", "shilpa@123");
		Thread.sleep(3000);
		List<WebElement> ele=driver.findElements(By.xpath("//div[@id='items']/ytd-grid-video-renderer/div/ytd-thumbnail/a/yt-img-shadow/img[@id='img']"));
		
		int sizeOfEle=ele.size();
		
		System.out.println(sizeOfEle);		
		ele.get(5).click();
		
		
		Thread.sleep(10000);
	}

}
