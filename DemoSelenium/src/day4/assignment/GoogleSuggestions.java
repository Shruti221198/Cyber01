/*
 * 1. Open Browser and Enter Google URL
 * 2. Search for Selenium
 * 3. Get Suggestion Count
 * 4. Print One by One Suggestion Name
 */

package day4.assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSuggestions 
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
	driver.findElement(By.name("q")).sendKeys("Selenium");
	
	//Identify all Google Suggestions
	List <WebElement> suggestionsList=driver.findElements(By.cssSelector("ul[class='G43f7e']>li>div>*:nth-child(2)>*:first-child>*:first-child>span"));
	System.out.println("Total Suggestion found: "+suggestionsList.size());
	
	//Print one by one all suggestions in console
	for(int i=0; i<suggestionsList.size(); i++)
	{
	  System.out.println("SuggestionList Names: "+suggestionsList.get(i).getText());
	} 
	  /*//To avoid StaleElementException re-identify the Element
	  suggestionsList=driver.findElements(By.cssSelector("ul[class='G43f7e']>li>div>*:nth-child(2)>*:first-child>*:first-child>span"));
	  WebElement suggestions=suggestionsList.get(i);
	  System.out.println("Suggestion List Names: "+i+" "+suggestions.getText());
	  //System.out.println(suggestionList.get(i).getText());
	   * */
	}
}
