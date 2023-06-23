package day7.keyboardoperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PressEscButton {

	public static void main(String[] args)  throws InterruptedException
	{
	 System.setProperty("webdriver.chrome.driver", "F:\\Automation_Session\\Workspace\\DemoSelenium\\executables\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 
	 driver.get("https://www.flipkart.com/");
	 driver.manage().window().maximize();
	 
	 //Thread.sleep(3000);
	 
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);
	 
	}

}
