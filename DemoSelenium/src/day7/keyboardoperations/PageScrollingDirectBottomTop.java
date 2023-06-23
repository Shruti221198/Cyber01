package day7.keyboardoperations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageScrollingDirectBottomTop 
{
	public static void main(String[] args) throws InterruptedException
	{
      System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      
      driver.manage().window().maximize();
      
      driver.get("https://www.flipkart.com/");
      
      driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);
      
      //scrolling till bottom of the page
      Thread.sleep(1000);
      driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL, Keys.END));
      
      Thread.sleep(2000);
     
      //scrolling till top of the page
      driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL, Keys.HOME));
      
	}

}
