package day1.assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 
{
	public static void main(String[] args) 
	{
	/*Step 1: Launch a Chrome Browser */	
	      System.setProperty("webdriver.chrome.driver", "F:\\Automation_Session\\Workspace\\DemoSelenium\\executables\\chromedriver.exe");
	
    /* Create an instance of required browser*/ 
	      ChromeDriver driver= new ChromeDriver();
	
	/*Step2: Open URL in current browser */
	      driver.get("https://www.facebook.com");
	   
    /* Get CurrentPage URL*/
	/* Print CurrentPage URL on Eclipse Console*/
	  	  driver.getCurrentUrl();
	  	  System.out.println("CurrentPageUrl: "+driver.getCurrentUrl());
	
	/*Step3: Fetch HomePage Title*/
	      driver.getTitle();
	/*Step5: Print HomePage Title on Eclipse Console*/
	      System.out.println("HomePageTitle: "+driver.getTitle());
	
	/*Step4: Verify actual Title with ExpectedTitle*/
	      String expectedTitle="https://www.facebook.com";
	/*Print actual Title with ExpectedTitle */
	      String title=driver.getTitle();
	      System.out.println("Equality Check For Title: "+expectedTitle.equals(title));
	
	/*Step6: Close the Browser*/
	//driver.close();
	
	

	}

}
