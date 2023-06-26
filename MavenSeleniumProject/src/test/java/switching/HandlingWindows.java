package switching;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class HandlingWindows extends SeleniumUtility
{
  @Test
  public void testWindowHandling() 
  {
		WebDriver driver=setUp("chrome", "https://etrain.info/in");
		System.out.println("Home page current URL: "+getCurrentUrlOfApplication());
		System.out.println("Home page current title: "+getCurrentTitleOfApplication());
		
		//Get current window unique id
		String homeWinId=driver.getWindowHandle();//EC8129D18C193DDA926BAF64A0600F3C
		System.out.println("Home window id: "+homeWinId);
		
		//click on twitter
		clickOnElement(driver.findElement(By.cssSelector(".icon-twitter")));
		setSleepTime(1000);
		
		//after click on twitter click, get all windows id
		Set<String> allWinIds=driver.getWindowHandles();//[EC8129D18C193DDA926BAF64A0600F3C, 210D71947F962864FADADCF89553CDF9]
		System.out.println("All windows id: "+allWinIds);
		
		//get child window id
		allWinIds.remove(homeWinId);
		System.out.println("After removing homeWinId from allWinIds, now allWinIds are "+allWinIds);//[210D71947F962864FADADCF89553CDF9]
		
       //Iterator<String> itr=allWinIds.iterator();
       //String childWinId=itr.next();
				//OR
		String childWinId=allWinIds.iterator().next();
		
		//once you get child window id, you can move your control from Home window to child window
		driver.switchTo().window(childWinId);		
		System.out.println("child page current URL: "+getCurrentUrlOfApplication());
		System.out.println("child page current title: "+getCurrentTitleOfApplication("Twitter"));
		
		//if you want child window later as well, then don't close it else close it
		//driver.close();                  //even after closing child window control won't move to parent window automatically
		setSleepTime(1000);
		
		//now, if you want to perform any operation on Home window, dn move to home window
		driver.switchTo().window(homeWinId);
		System.out.println("Home page current URL: "+getCurrentUrlOfApplication());
		System.out.println("Home page current title: "+getCurrentTitleOfApplication());
		
		//if you want to close all the windows opened by WebDriver dn use
		driver.quit();
		
	   //driver.close();  
  }
}
