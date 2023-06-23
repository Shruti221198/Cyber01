package day6.calendarinfo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusCalendarInfo 
{
	public static void main(String[] args)
	{
	  System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
		      
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.redbus.in/");
	  
	  //List of Suggestions from From Menu
	  driver.findElement(By.id("src")).sendKeys("Pune");
	  
	  driver.findElement(By.xpath("//li[text()= 'Swargate, Pune']"));
	
	  List<WebElement> fromList=driver.findElements(By.xpath("//li[contains(text(),'Pune')]"));
	  System.out.println("Total SuggestionList from fromList:" +fromList.size());
	  
	  for(int i=0; i<fromList.size(); i++)
	  {
		  if(fromList.get(i).getText().equals("Swargate, Pune"))
		  {
			  fromList.get(i).click();
			  break;
		  }
	  }
	  
	  //List of Suggestions from To Menu
	  driver.findElement(By.xpath("//input[@id='dest']")).click();
	  //driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Goa");
	  
	  List<WebElement> toList=driver.findElements(By.xpath("//li[contains(text(),'Goa')]"));
	  System.out.println("Total SuggestionList from toList:" +toList.size());
	  
	  for(int j=0; j<toList.size(); j++)
	  {
		  if(toList.get(j).getText().equals("Panjim, Goa"))
		  {
			  toList.get(j).click();
			  break;
		  }
	  }
	  
	  
	  //Choose Date From Calendar
	  driver.findElement(By.xpath("//label[normalize-space()='Date']")).click();
	  
	  //To click on arrow as >
	  driver.findElement(By.cssSelector("td[class='next'] button")).click();
	  
	  //Click on Date from Calendar
	  driver.findElement(By.xpath("//td[normalize-space()-'15']")).click();
	  
	  //Click on Search Button
	  driver.findElement(By.xpath("//button[@id='search_btn']")).click();
	  driver.findElement(By.cssSelector("label[for='dtBefore 6am']")).click();
	  driver.findElement(By.cssSelector("label[title='AC']")).click();
	  
	  List<WebElement> msg=driver.findElements(By.xpath("//div[@class=' new-msg']"));
	  System.out.println("msg" +msg.size());
	  
	  for(int k=0; k<msg.size(); k++)
	  {
		  System.out.println("Buses are available: "+msg.get(k).getText());
	  }
	}

}
