package day1.browseropening;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericWayToOpenFirefoxBrowser 
{
	public static void main(String[] args) 
	{
   	 //System.setProperty("webdriver.gecko.driver","F:\\Automation_Session\\Workspace\\DemoSelenium\\executables\\geckodriver.exe");
			    //or
	 //System.setProperty("webdriver.gecko.driver", "F:/Automation_Session/Workspace/DemoSelenium/executables/geckodriver.exe");
			   //or
	 //System.setProperty("webdriver.gecko.driver", ".\\executables\\geckodriver.exe");
			  //or
	String driverPath=System.getProperty("user.dir")+"\\executables\\geckodriver.exe";
	System.setProperty("webdriver.gecko.driver", driverPath);
			
	WebDriver driver=new FirefoxDriver();
	}
}
