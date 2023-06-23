package day7.keyboardoperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyPaste 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Automation_Session\\Workspace\\DemoSelenium\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		//Enter FirstName
		WebElement FirstNameInputField=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		
		//Type admin and press ctrl+a button using keys class
		FirstNameInputField.sendKeys("admin", Keys.chord(Keys.CONTROL, "a"));
		                        
		//Press Ctrl+c using keys class
		FirstNameInputField.sendKeys(Keys.chord(Keys.CONTROL, "c"));
		                            //or
		//FirstNameInputField.sendKeys("admin", Keys.chord(Keys.CONTROL, "a"),Keys.chord(Keys.CONTROL, "c"));
		
		//Enter LastNameInputField and press Enter Button using keys class
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(Keys.chord(Keys.CONTROL, "v"));
		                            //or
		WebElement LastNameInputField=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		LastNameInputField.sendKeys(Keys.chord(Keys.CONTROL, "v"));
	}
}
