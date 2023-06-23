package day1.browseropening;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericWayToOpenChromeBrowser 
{
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "F:\\Automation_Session\\Workspace\\DemoSelenium\\executables\\chromedriver.exe");
			       //or
	//System.setProperty("webdriver.chrome.driver", "F:/Automation_Session/Workspace/DemoSelenium/executables/chromedriver.exe");
			       //or
	//System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
			      //or	
	//String exePath=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
	//System.setProperty("webdriver.chrome.driver", exePath);
			
	WebDriver driver=new ChromeDriver();
	}
}
