/*
 * 1. Open Browser and Enter Google URL
 * 2. Search for "Testing Interview Questions" URL
 * 3. Get Suggestion Count
 * 4. From Suggestion Select "Testing Interview Questions For Freshers"
 * 5. Validate Suggestion is selected or not
 */

package day4.assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingInterviewQuestions 
{
   public static void main(String[] args)
   {
     System.setProperty("webdriver.chrome.driver", "F:\\Automation_Session\\Workspace\\DemoSelenium\\executables\\chromedriver.exe");
	 WebDriver driver =new ChromeDriver();
	     
	 driver.get("https://www.google.com/");
	 driver.manage().window().maximize();
	
	 /*implict wait*/
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     
	 /* identify and enter name, will get 0-30sec to identify the element */
	 driver.findElement(By.name("q")).sendKeys("Testing Interview Questions");
	
	 //Identify all Google Suggestions
	 List <WebElement> suggestions=driver.findElements(By.cssSelector("ul[class='G43f7e']>li>div>*:nth-child(2)>*:first-child>*:first-child>span"));
	 System.out.println("Total Suggestions found: "+suggestions.size());
	
	 //Print one by one all suggestions in console
	 for(int i=0; i<=suggestions.size(); i++)
	  {
		//To avoid StaleElementException re-identify the Element
		 suggestions=driver.findElements(By.cssSelector("ul[class='G43f7e']>li>div>*:nth-child(2)>*:first-child>*:first-child>span")); 
		 
		 WebElement suggestionlist=suggestions.get(i);
		 System.out.println("SuggestionList Names "+i+": "+suggestions.get(i).getText());
		 
		 if(suggestionlist.getText().equals("testing interview questions for freshers"))
		 {
			suggestionlist.click();
			break;
		 }
	  } 
    String pageTitle=driver.getTitle();
    String ExpectedTitle="testing interview questions for freshers";
    System.out.println("Search Page Validation: "+pageTitle.contains(ExpectedTitle));
   }
}
