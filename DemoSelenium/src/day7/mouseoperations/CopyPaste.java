package day7.mouseoperations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyPaste 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Automation_Session\\Workspace\\DemoSelenium\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		//Enter First Name
		WebElement FirstNameInputField=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		
		//Create an instance of Actions class and pass browser instance to its constructor
		Actions act=new Actions(driver);
		
		//Type Admin and double click on it using Actions class
		FirstNameInputField.sendKeys("admin");
		act.moveToElement(FirstNameInputField).doubleClick().keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		//Enter Last Name and press ENTER Button using keys class
		WebElement LastNameInputField=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		LastNameInputField.sendKeys(Keys.chord(Keys.CONTROL, "v"));
		                                      //OR
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(Keys.chord(Keys.CONTROL, "v"));
	}
}
