package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtil 
{
	static WebDriver driver;
	static WebDriverWait wait;
	public static WebDriver setUp(String browsername, String appUrl) 
	{
		if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "F:\\Automation_Session\\Workspace\\DemoSelenium\\executables\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "F:\\Automation_Session\\Workspace\\DemoSelenium\\executables\\geckodriver.exe");
			driver= new FirefoxDriver();
		}
		else if(browsername.equalsIgnoreCase("ie"))
		{
			System.setProperty("wedriver.ie.driver", ".\\executables\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(appUrl);
		wait=new WebDriverWait(driver,20);
		return driver;
	}
}
