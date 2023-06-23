package day6.propertyfilecalendar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateColorCode2 
{
	public static void main(String[] args) 
	{
	   System.setProperty("webdriver.chrome.driver", "F:\\Automation_Session\\Workspace\\DemoSelenium\\executables\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   driver.manage().window().maximize();
	   
	   driver.get("https://demo.automationtesting.in/Register.html");
	   
	   //driver.findElement(By.id("submitbtn"));
	   //OR
	   WebElement SignInButton=driver.findElement(By.id("submitbtn"));
	   
	   //Selenium get the color in RGBA format
	   
	   String buttonColorCode=SignInButton.getCssValue("background-color");
	   String buttonFontSize=SignInButton.getCssValue("font-size");
	   System.out.println("Button Color Code: "+buttonColorCode);
	   System.out.println("Button Font Size: "+buttonFontSize);
	   
	   
	}

}
