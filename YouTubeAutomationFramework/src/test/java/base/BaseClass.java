package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BaseClass 
{
	public WebDriver driver;
	public Properties prop;
	
	ExtentReports report;
	ExtentTest logger;
	
	@BeforeClass
	public void setUp() throws Exception
	{
		report=new ExtentReports("C:\\Users\\Shilpa Mittal\\workspace\\YouTubeAutomationFramework\\TestReport\\Test.html");
		logger=report.startTest("this is test report");
		
		File f=new File("C:\\Users\\Shilpa Mittal\\workspace\\YouTubeAutomationFramework\\OR.properties");
		FileInputStream fis=new FileInputStream(f);
		prop=new Properties();
		prop.load(fis);
		
		System.setProperty("webdriver.chrome.driver","F:\\Software Setup\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		//driver=new FirefoxDriver();
		
		logger.log(LogStatus.INFO, "browser started");
		
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		//driver.close();
		
		report.endTest(logger);
		report.flush();
	}
}
