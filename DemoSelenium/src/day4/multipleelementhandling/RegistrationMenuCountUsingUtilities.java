package day4.multipleelementhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.SeleniumUtil;

public class RegistrationMenuCountUsingUtilities 
{

   public static void main(String[] args) 
   {
    WebDriver driver=SeleniumUtil.setUp("chrome", "https://demo.automationtesting.in/Register.html");
    
    /*get all the menu using Find Elements(By)*/
    List<WebElement> menuList=driver.findElements(By.cssSelector(".navbar-nav>li>a"));
    
    /*Total menu count*/
    System.out.println("Total Menu Count: "+menuList.size());
    
    /*To remove particular Element*/
    WebElement firstmenu=menuList.get(0);
    
    /*To remove text from webelement*/
    String menuName=firstmenu.getText();
               //or
    /*To combine all 3 lines*/
    System.out.println("First Menu name: "+menuList.get(0).getText());
    
      /*To print all menus one by one
      for(int i=0; i<menuList.size(); i++)
      {
   	   System.out.println("Menu name: "+menuList.get(i).getText());
      } 
    */ 
	}
}
