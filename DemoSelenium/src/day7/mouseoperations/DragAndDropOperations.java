package day7.mouseoperations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropOperations 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Automation_Session\\Workspace\\DemoSelenium\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		//Frame Handling
		WebElement frame=driver.findElement(By.cssSelector(".demo-frame.lazyloaded"));
		driver.switchTo().frame(frame);
		
		//Create an instance of Actions class by passing required browser instance to its constructor
		Actions act=new Actions(driver);
		
		//First identify source and target element from Drag Drop
		List<WebElement> sourceElements=driver.findElements(By.cssSelector("ul#gallery>li"));
		
		WebElement target=driver.findElement(By.id("trash"));
		
		//Perform Drag and Drop Operations
		act.dragAndDrop(sourceElements.get(0), target).build().perform();
		Thread.sleep(1000);
		
		act.dragAndDrop(sourceElements.get(1), target).build().perform();
		Thread.sleep(1000);
		
		act.dragAndDrop(sourceElements.get(2), target).build().perform();
		                       //OR
		//Drap and Drop Operations in loops
		for(int i=0; i<sourceElements.size(); i++)
		{
			act.dragAndDrop(sourceElements.get(i), target).build().perform();
			Thread.sleep(2000);
		}
	}

}
