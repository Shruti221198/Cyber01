package day1.browseropening;

import org.openqa.selenium.firefox.FirefoxDriver;  

public class OpenFirefoxBrowser 
{
	public static void main(String[] args) 
	{
	/*1. Set the required browser driver executable path using:	System.setProperty( key, value);*/
		
    	  //System.setProperty("webdriver.gecko.driver","F:\\Automation_Session\\Workspace\\DemoSelenium\\executables\\geckodriver.exe");
		 	     //or
		  //System.setProperty("webdriver.gecko.driver", "F:/Automation_Session/Workspace/DemoSelenium/executables/geckodriver.exe");
			     //or
		  //System.setProperty("webdriver.gecko.driver", ".\\executables\\geckodriver.exe");
			     //or
		String driverPath=System.getProperty("user.dir")+"\\executables\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", driverPath);
			
	/*2. Create an instance of required browser*/
		FirefoxDriver fdriver=new FirefoxDriver();
	}

}
