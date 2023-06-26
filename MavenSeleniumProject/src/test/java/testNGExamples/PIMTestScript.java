package testNGExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class PIMTestScript extends SeleniumUtility 
{
	WebDriver driver;

	@BeforeTest
	public void beforeTestMethod() 
	{
		driver = setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@BeforeMethod
	public void beforeMethodExample() 
	{
		// enter username
		typeInput(driver.findElement(By.name("username")), "Admin");
		// enter password
		typeInput(driver.findElement(By.name("password")), "admin123");
		// click on login button
		clickOnElement(driver.findElement(By.cssSelector(".orangehrm-login-button")));
		// click on PIM link present on HOME page
		clickOnElement(driver.findElement(By.xpath("//span[text()='PIM']")));
	}

	@Test
	public void testPMICreation() 
	{
		// click on Add button
		clickOnElement(driver.findElement(By.cssSelector("button[class='oxd-button oxd-button--medium oxd-button--secondary']")));
		setSleepTime(2000);
		
		// Enter first name and last name
		typeInput(driver.findElement(By.name("firstName")), "Joker");
		typeInput(driver.findElement(By.name("lastName")), "Tom");
		
		// Identify empID input field
		WebElement empIdInputField = driver.findElement(By.xpath("//div[div[label[text()='Employee Id']]]/div[2]/input"));
		
		// clear EMP ID input field
		empIdInputField.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.BACK_SPACE);
		
		// enter EMP id
		typeInput(driver.findElement(By.xpath("//div[div[label[text()='Employee Id']]]/div[2]/input")), "10007");
		
		// click on search button
		clickOnElement(driver.findElement(By.xpath("//button[@type='submit']")));
		setSleepTime(2000);
		
		// click on PIM link present on HOME page
		clickOnElement(driver.findElement(By.xpath("//span[text()='PIM']")));
		setSleepTime(2000);
		
		// search created PIM ID
		typeInput(driver.findElement(By.xpath("//div[div[label[text()='Employee Id']]]/div[2]/input")), "10007");
		setSleepTime(2000);
		clickOnElement(driver.findElement(By.xpath("//button[@type='submit']")));
		setSleepTime(2000);
		int idListCount = driver.findElements(By.cssSelector(".orangehrm-employee-list .oxd-table-row.oxd-table-row--clickable")).size();
		System.out.println("PIM created ids count: " + idListCount);
		// validate PIM is created successfully or not
		Assert.assertTrue((idListCount == 1), "Either PIM not created or ID is wrong");
	}

	// @Test
	public void testPMIDeletion() 
	{
		// TODO:
	}

	// @Test
	public void testPMIModification() 
	{
		// TODO:
	}

	@AfterTest
	public void afterTestMethod() 
	{
		cleanUp();
	}

	@AfterMethod
	public void afterMethodExample() 
	{
		// logout from the application
		clickOnElement(driver.findElement(By.className("oxd-userdropdown-icon")));
		clickOnElement(driver.findElement(By.linkText("Logout")));
	}
}
