package day1.assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1b 
{
	public static void main(String[] args) 
	{
		/*Step 1: Launch a Chrome Browser */
		String path="F:\\Automation_Session\\Workspace\\DemoSelenium\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		/* Create an instance of required browser*/
		ChromeDriver chrome=new ChromeDriver();

		/*Step 2: Open URL*/
		chrome.get("https://demo.actitime.com/");
		
		/*Step3: Get Page Title name and Title length*/
		/*Step4: Print Page Title name and Title length on Eclipse Console*/
		String title=chrome.getTitle();
		System.out.println("Title: "+title);
		System.out.println("Titlelength: "+title.length());
		
		/*Step5: Get Page URl and verify if, correct page is opened or not*/
		System.out.println("Current Page URL: "+chrome.getCurrentUrl());
		
		/*Step6: Get Page Source(HTML Source Code) & Page Source Length*/
		/* Print Page Source(HTML Source Code) & Page Source Length*/	
		String source=chrome.getPageSource();
		System.out.println("SourcePage length is "+source.length());
		System.out.println(source);
		
		/*Step7: Close the browser*/
		chrome.close();
	}
}
