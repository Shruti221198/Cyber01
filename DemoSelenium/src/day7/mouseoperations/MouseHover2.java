package day7.mouseoperations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Automation_Session\\Workspace\\DemoSelenium\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		//Create an instance of Actions class and pass browser instance to its constructor
		Actions act=new Actions(driver);
				
		//Get all the main menu list
		List<WebElement> menuList=driver.findElements(By.cssSelector(".navbar-nav>li>a"));
		
		//To perform hover on specific element get th element from list like: 3rd Element(WebTable)
		WebElement webTableLink=menuList.get(2);
		Thread.sleep(2000);
		act.moveToElement(webTableLink, 100, 0).perform();
		

	}

}
