package asserstion;

import org.openqa.selenium.WebElement;

public class Assertion 
{
	public void asset_equal(String actualResult, String ExpectedResult)
	{
		if(actualResult.equals(ExpectedResult))
		{
			System.out.println("Assertion pass");
		}
		else
		{
			System.out.println("Assertion fail");
		}
	}
	
	public void assert_display(WebElement element)
	{
		if(element.isDisplayed())
		{
			System.out.println("Assertion pass");
		}
		else
		{
			System.out.println("Assertion fail");
		}
	}
}
