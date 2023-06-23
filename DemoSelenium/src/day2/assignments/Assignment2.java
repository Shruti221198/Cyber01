//Perform Login-Logout Operation of VTiger-Demo Application

package day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Automation_Session\\Workspace\\DemoSelenium\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		/*
		WebElement usernameInputField=driver.findElement(By.name("username"));
		usernameInputField.clear();
		usernameInputField.sendKeys("admin");
		*/
		                //or
		driver.findElement(By.id("username"));
		
		/*
		WebElement passwordInputField=driver.findElement(By.id("password"));
		passwordInputField.clear();
		passwordInputField.sendKeys("Test@123");
		*/
		                //or
		driver.findElement(By.id("password"));
		
		/*
		WebElement SignInButton=driver.findElement(By.tagName("button"));
		SignInButton.click();
		*/
		                 //or
		driver.findElement(By.tagName("Button")).click();
		                //or
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
	    //driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		  
		driver.close();
	}
}
