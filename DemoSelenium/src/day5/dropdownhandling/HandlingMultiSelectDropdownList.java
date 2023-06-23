package day5.dropdownhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiSelectDropdownList 
{
	public static void main(String[] args) 
	{
     System.setProperty("webdriver.chrome.driver", "F:\\Automation_Session\\Workspace\\DemoSelenium\\executables\\chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     
     driver.get("http://omayo.blogspot.com/");
     driver.manage().window().maximize();
     
     //Identify Dropdown List
     WebElement CarDropdown=driver.findElement(By.id("multiselect1"));
     
     //Create an instance of select class and pass above element into its constructor***
     Select selectSkills=new Select(CarDropdown);
     
     //Check whether dropdown is multiselect or not
     System.out.println("Is dropdown allowing to select multiple Option: "+selectSkills.isMultiple());
     
     //Get Option Count
     List<WebElement> Options=selectSkills.getOptions();
     System.out.println("Option Count is: "+Options.size());
     
     //Get Dropdown Option Names
     for(int i=0; i<Options.size(); i++)
     {
    	 System.out.println("Option "+i+": "+Options.get(i).getText());
     }
     
     //Select Options from Dropdown
     selectSkills.selectByIndex(0);
     selectSkills.selectByIndex(2);
     selectSkills.selectByIndex(3);
     //selectSkills.selectByValue("Hyundaix");
     //selectSkills.selectByVisibleText("Audi");
     
     //Get all selected Options
     List<WebElement> selectCars=selectSkills.getAllSelectedOptions();
     System.out.println("Selected Car Count: "+selectCars.size());
     
     //Unselect already selected Options
     /*selectSkills.deselectByIndex(0);
     selectSkills.deselectByValue("Hyundaix");
     selectSkills.deselectByVisibleText("Audi");*/
                      //OR
     selectSkills.deselectAll();
     
	}

}
