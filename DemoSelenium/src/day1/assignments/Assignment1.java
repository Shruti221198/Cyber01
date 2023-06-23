//Perform Login-Logout Operation of Actitime-Demo Application

package day1.assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 
{
	public static void main(String[] args) 
	{
	/*Step 1: Launch a Chrome Browser*/	
		System.setProperty("webdriver.chrome.driver", "F:\\Automation_Session\\Workspace\\DemoSelenium\\executables\\chromedriver.exe");
		
	/* Create an instance of required browser*/
		ChromeDriver driver=new ChromeDriver();
	
	/*Step 2: Open URL*/
		driver.get("https://demo.actitime.com/");
		
	/*Step3: Get Page Title name and Title length*/
		driver.getTitle();
		
		String titlelength=driver.getTitle();
		titlelength.length();
		
	/*Step4: Print Page Title name and Title length on Eclipse Console*/
		
		System.out.println("CurrentPage Title Name is: "+driver.getTitle());
		
		System.out.println("CurrentPage Title Length is: "+titlelength.length());
		
	/*Step5: Get Page URl and verify if, correct page is opened or not*/
		
        driver.getCurrentUrl();
		System.out.println("CurrentPage Title URL is: "+driver.getCurrentUrl());
		
	/*Step6: Get Page Source(HTML Source Code) & Page Source Length*/
		
		String source=driver.getPageSource();
		System.out.println(source);
		System.out.println(source.length());
		
	/* Print Page Source(HTML Source Code) & Page Source Length*/	
		System.out.println("CurrentPage Source is "+source);
		System.out.println("CurrentPage Source Length is: "+source.length());
	
	/*Step7: Close the browser*/
		//driver.close();

	}

}
