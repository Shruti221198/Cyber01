package day1.assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2b 
{
	public static void main(String[] args) 
	{
	/*Step 1: Launch a Chrome Browser */
		 System.setProperty("webdriver.chrome.driver", "F:\\Automation_Session\\Workspace\\DemoSelenium\\executables\\chromedriver.exe");	 
		
	/* Create an instance of required browser*/ 
		 ChromeDriver chrome=new ChromeDriver();
		
	/*Step2: Open URL in current browser */
		 chrome.get("https://www.facebook.com");
		 
	/*Step3: Fetch HomePage Title*/
	/*Step5: Print HomePage Title on Eclipse Console*/
		 String title=chrome.getTitle();
		 System.out.println("Fetched Homepage Title: "+title);
		
	/*Step4: Verify actual Title with ExpectedTitle*/
	/*Print actual Title with ExpectedTitle */
		 String expectedTitle="facebook123";
		 System.out.println("ExpectedTitle: "+expectedTitle);
		 System.out.println("Equality Check For Title: "+expectedTitle.equals(title));
		
	/*Step6: Close the Browser*/
	  	 chrome.close();
		
		
		
	}

}
