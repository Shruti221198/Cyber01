package day1.browseropening;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser 
{
	public static void main(String[] args) 
	{
	 /*1. Set the required browser driver executable path using:	System.setProperty( key, value);*/
		
	     //System.setProperty("webdriver.chrome.driver", "F:\\Automation_Session\\Workspace\\DemoSelenium\\executables\\chromedriver.exe");
		      //or
	     //System.setProperty("webdriver.chrome.driver", "F:/Automation_Session/Workspace/DemoSelenium/executables/chromedriver.exe");
		     //or
	    //System.setProperty("webdriver.chrome.driver", "\\executables\\chromedriver.exe";
		    //or
	    String exePath=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		
	/*2. Create an instance of required browser*/
		 ChromeDriver cdriver=new ChromeDriver();
	}
}
