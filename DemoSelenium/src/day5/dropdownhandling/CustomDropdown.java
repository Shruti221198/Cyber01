package day5.dropdownhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomDropdown 
{
	public static void main(String[] args) 
	{
	  System.setProperty("webdriver.chrome.driver", "F:\\Automation_Session\\Workspace\\DemoSelenium\\executables\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	     
	  driver.get("https://thompsonsj.com/bootstrap-select-dropdown/");
	  driver.manage().window().maximize();
	  
	  //
	  WebDriverWait wait=new WebDriverWait(driver,20); 
	  
	  //Identify Dropdown List
	  WebElement Dropdown=driver.findElement(By.id("bsd1-button"));
	     
	  //Click on it
	  Dropdown.click();
	  
	  //Identify all the Options and store them into List<WebElement>
	  List<WebElement> Options=driver.findElements(By.cssSelector(".dropdown-menu.dropdown-menu-right.show>div>a"));
	  
	  //Use Size() to get Option Count
	  System.out.println("Option Count: "+Options.size());
	  
	  //Use for loop to print one by one options
	  for(int i=0; i<Options.size(); i++)
	  {
		  System.out.println(Options.get(i).getText());
	  }
	  
	  Options.get(2).click();
	}

}
