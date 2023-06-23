package day3.uicomponentvalidations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 
{
	public static void main(String[] args) 
	{
		/*set required browser driver executable path using System.setProperty(key,value);*/
	    System.setProperty("webdriver.chrome.driver", "F:\\Automation_Session\\Workspace\\DemoSelenium\\executables\\chromedriver.exe");
		
	    /*create instance of required browser class*/
	    WebDriver driver=new ChromeDriver();
	    
	    /*implicitWait*/
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
		/*Enter the required URL*/			
		driver.get("https://demo.automationtesting.in/Register.html");
		
		/*identify firstname input field*/
		WebElement firstNameInputField=driver.findElement(By.className("form-control"));
		//l ng-pristine ng-invalid ng-invalid-required ng-touched
		/*
		 * Visible--- isDisplayed()
		 * Editable--- isEnabled()
		 * Default value--- getAttribute(String attributename)
		*/
		System.out.println("First name input field is visible or not? "+firstNameInputField.isDisplayed());
		System.out.println("First name input field is editable or not? "+firstNameInputField.isEnabled());
		String firstNameInputFieldValue=firstNameInputField.getAttribute("placeholder");
		System.out.println("Default Value validation status is: " +firstNameInputFieldValue.equals("First Name"));
		
		/*Identify male radio button*/
		WebElement maleRadioButton=driver.findElement(By.name("radiooptions"));
		
		/*
		 * Visible
		 * Functional
		 * Bydefault should not be selected
		 * select and verify now is it selected or not
		 */
		System.out.println("Male Radio Button is visible or not? "+maleRadioButton.isDisplayed());
		System.out.println("Male Radio Button is functional or not? "+maleRadioButton.isEnabled());
		System.out.println("Male Radio Button default selection status?" +maleRadioButton.isSelected());
		maleRadioButton.click();
		
		/*Identify Submit Button*/
		WebElement SubmitButton=driver.findElement(By.id("submitbtn"));
		
		/*
		 *Visible-- isDisplayed()
		 * Functional-- isEnabled()
		 * Default value- Button name is coming from inner HTML Text, so we will be using getText() 
		*/
		System.out.println("Submit Button is visible or not? "+SubmitButton.isDisplayed());
		System.out.println("Submit Button is functional or not? "+SubmitButton.isEnabled());
		
		String ActualButtonName=SubmitButton.getText();
		System.out.println("Submit Button name Validation Status? "+ActualButtonName.equals("Submit"));
	}
}
