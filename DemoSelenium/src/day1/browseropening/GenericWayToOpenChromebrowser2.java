package day1.browseropening;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericWayToOpenChromebrowser2 
{
	public static void main(String[] args) 
	{
	/*1. Set the required browser driver executable path using: System.setProperty(key, value);*/
		 System.setProperty("webdriver.chrome.driver", "F:\\Automation_Session\\Workspace\\DemoSelenium\\executables\\chromedriver.exe");
	
	/*2. After setting the path of driver executable path, Create an instance of required browser*/
		 WebDriver driver=new ChromeDriver();
		
	/*Enter Required Application URL*/
		 driver.get("https://www.google.com");
		
	/*Print Page Title*/
		 System.out.println("Current Page Title is: "+driver.getTitle());
		
	/*Print Current Page URL*/
		 System.out.println("Current Page URL is: "+driver.getCurrentUrl());	
		
	/*Current Page Source Code*/
		 String pageSourceCode=driver.getPageSource();
	     //System.out.println("Source Code is: "+pageSourceCode);
	     System.out.println("Page source length: "+pageSourceCode.length());
	     
	/*Close Opened Browser*/
	     driver.close();
	}
}
