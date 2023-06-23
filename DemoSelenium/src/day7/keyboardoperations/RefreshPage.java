package day7.keyboardoperations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefreshPage 
{
	public static void main(String[] args) throws InterruptedException 
	{
	  System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	      
	  driver.manage().window().maximize();
	  
	  driver.get("https://demo.automationtesting.in/Register.html");
	  
	  driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Admin");
	  
      Thread.sleep(3000);
	  
      driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL, "r"));
      
	  //Thread.sleep(2000);
	  //driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Admin");
	  
	  //driver.findElement(By.xpath("//body")).sendKeys(Keys.F5);
	  //driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Admin");
	  
	  //Thread.sleep(2000);
	  
      driver.navigate().refresh();
      //driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Admin");
	  
	  
	}
}


