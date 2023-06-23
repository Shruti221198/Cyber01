package day4.multipleelementhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationMenuCount 
{

	public static void main(String[] args) 
	{
     System.setProperty("webdriver.chrome.driver", "F:\\Automation_Session\\Workspace\\DemoSelenium\\executables\\chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     
     driver.get("https://demo.automationtesting.in/Register.html");
     driver.manage().window().maximize();
     
     //get all the menulist using Find Elements(By)
     List<WebElement> menuList=driver.findElements(By.cssSelector(".navbar-nav>li>a"));
     
     //Total menu count
     System.out.println("Total Menu Count: "+menuList.size());
     
     //To get specific webelement from the list
     WebElement firstmenu=menuList.get(0);
     
     //To remove text from webelement
     String menuName=firstmenu.getText();
                //or
     //To combine all 3 lines
     System.out.println("First Menu name: "+menuList.get(0).getText());
     
     //To print all menus one by one
     for(int i=0; i<menuList.size(); i++)
     {
    	 System.out.println("Menu name: "+menuList.get(i).getText());
     }
	}

}
