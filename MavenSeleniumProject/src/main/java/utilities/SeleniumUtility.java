package utilities;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumUtility 
  {
	public static WebDriver driver;    //WebDriver Static because it will load at compile time and will require single memory allocation
	public static WebDriverWait wait;
	protected Properties properties;
	protected Actions action;
	protected FileInputStream fis;
	protected static String filePath;
	/**
	 * using this method we can load our property and also open desired browser
	 */
	static 
	{
		filePath = System.getProperty("user.dir") + "\\src\\test\\resources\\testData\\testAppData.properties";
	}

	public WebDriver setUp(String browserName, String appUrl) 
	{
	  //Loaded Property File - whenever we require property file in a project by using this method we can directly load. Loaded using setup method
	  properties = new Properties();
		try 
		{
			fis = new FileInputStream(filePath);
			properties.load(fis);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		//Browser Setup
		if (browserName.equalsIgnoreCase("chrome")) 
		{
			  WebDriverManager.chromedriver().setup();
		     driver = new ChromeDriver();
		} 
		   else if (browserName.equalsIgnoreCase("firefox")) 
		{
			  WebDriverManager.firefoxdriver().setup();
			  driver = new FirefoxDriver();
		} 
		   else if (browserName.equalsIgnoreCase("ie")) 
		{
			  WebDriverManager.iedriver().setup();
			  driver = new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();                               //Maximize Screen
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);   //implicit Wait
		wait = new WebDriverWait(driver, 20);                              //WebDriver Wait
		driver.get(appUrl);                                                //URL
		action = new Actions(driver);                                      //Action Class
		return driver;                                                     //driver instance
	}
	
	//Any data required from Property File we need to call this method "getValueFromPropertyFile(String key)", we need to pass property file key, it will return property
	public String getValueFromPropertyFile(String key) 
	{
		return properties.getProperty(key);
	}

	//If we want driver instance, we need to use "getDriver()"
	public static WebDriver getDriver() 
	{
		return driver;
	}

	//If we need to type Input, we need method "typeInput", we pass WebElement, and need to type text which we want in that Field 
	public void typeInput(WebElement element, String input) 
	{
		waitForElementToBeClickable(element);                   //wait for WebElement internally, jo bhi webelement pass karoge uskeliye wait karega
		element.clear();                                        //internally clear
		element.sendKeys(input);                                //and add input
	}

	public void clickOnElement(WebElement element)             //Before clicking on Element, we will check whether element is clickable or not, If yes, then only click
	{
		waitForElementToBeClickable(element);                 //If No then, wait for that condition
		element.click();                     
	}

	public void performMouseOverOperation(WebElement element)  //To perform Mouse Operations
	{
		action.moveToElement(element).perform();
	}

	public void performRightClickOperation(WebElement element) //If we want to Right Click
	{ 
		action.moveToElement(element).contextClick().build().perform();
	}

	public void performDragAndDrop(WebElement source, WebElement target)  //If we want to Drag & Drop
	{ 
		action.dragAndDrop(source, target).build().perform();
	}

	public void takeScreenShotOfThePage(String location)      //
	{
		// downcast the driver to access TakesScreenshot method
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		// capture screenshot as output type FILE
		File file = ts.getScreenshotAs(OutputType.FILE);
		
		try 
		{
			// save the screenshot taken in destination path
			FileUtils.copyFile(file, new File(location));
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

	public String getRequiredAttributeValue(WebElement element, String attribute) 
	{
		waitForElementDisplayed(element);                //Will Check if element is displayed or not, if yes then its ok
		setSleepTime(2000);
		return element.getAttribute(attribute);         //If 'NOT' then it will go to getattribute whatever attribute name we will pass it, we wil get return attribute value
	}

	/**
	 * Method to get the title of current page
	 */
	public String getCurrentTitleOfApplication(String title)      //If we want app title, we use getTitle
	{
		wait.until(ExpectedConditions.titleContains(title));      //Sometimes we need to wait for title, we use titlecontains
		return driver.getTitle();
	}

	/**
	 * Method to get the title of current page
	 */
	public String getCurrentTitleOfApplication()                 //If we don't need to wait we use getTitle          
	{
		return driver.getTitle();
	}

	/**
	 * Method to get the current url of the application
	 */
	public String getCurrentUrlOfApplication()                    //Will return getURL
	{
		return driver.getCurrentUrl();
	}

	public boolean isElementExist(WebElement element)           //If Element Exists or not for this we will check using Element Displayed
	{
		waitForElementDisplayed(element);
		return element.isDisplayed();
	}

	public boolean isCheckBoxSelected(WebElement element) 
	{
		waitForElementDisplayed(element);                      //To check if checkbox is selected or not
		return element.isSelected();
	}

	/**
	 * Utility to handle HTML dropdown list
	 */
	public void handleHtmlDropdownListWithVisibleText(WebElement element, String visibileText) 
	{
		waitForElementDisplayed(element);
		Select select = new Select(element);
		select.selectByVisibleText(visibileText);
	}

	/**
	 * Utility to handle HTML dropdown list
	 */
	public void handleHtmlDropdownListWithIndex(WebElement element, int index)       //To select value from dropdown on index basis 
	{
		waitForElementDisplayed(element);
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	/**
	 * Utility to handle HTML dropdown list
	 */
	protected List<WebElement> getHtmlDropdownListSize(WebElement element)     //If we want dropdown option count
	{
		waitForElementDisplayed(element);
		Select select = new Select(element);
		return select.getOptions();
	}

	/**
	 * Utility to handle HTML dropdown list
	 */
	protected WebElement getFirstSelectedOptionFromHtmlDropdownList(WebElement element)  //If we want first selected Options
	{
		waitForElementDisplayed(element);               //Whichever option you select we will get count
		Select select = new Select(element);
		return select.getFirstSelectedOption();
	}

	/**
	 * Utility to handle HTML dropdown list
	 */
	protected List<WebElement> getAllSelectedOptionFromMultiSelectDropdownList(WebElement element) 
	{
		waitForElementDisplayed(element);
		Select select = new Select(element);
		return select.getAllSelectedOptions();
	}

	/**
	 * Utility to handle iframes
	 */
	protected void switchToIFrameWithWebElement(WebElement element) 
	{
		waitForElementDisplayed(element);
		driver.switchTo().frame(element);
	}

	/**
	 * Utility to handle iframes
	 */
	protected void switchToIFrameWithIndex(int index) 
	{
		driver.switchTo().frame(index);
	}

	/**
	 * Utility to handle iframes
	 */
	protected void switchFromIFrameToMainPage() 
	{
		driver.switchTo().defaultContent();
	}

	/**
	 * This is sleep method from java only use it when uttermost required
	 * 
	 * @param millis time in mili seconds
	 */
	protected void setSleepTime(long millis)          //Used Rarely- Thread.sleep throws one exception, so we created one method setSleepTime(long millis) 
	{
		try 
		{
			Thread.sleep(millis);
		} 
		catch (InterruptedException e) 
		{

		}
	}

	/**
	 * Method to refresh Page
	 */
	protected void refreshPage() 
	{
		driver.navigate().refresh();
	}

	/**
	 * Method to wait for an element till it's not display .
	 * 
	 * @param by
	 */
	public void waitForElementDisplayed(WebElement element) 
	{
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	/**
	 * Method to wait for an element till it's not clickable.
	 * 
	 * @param by
	 */
	public void waitForElementToBeClickable(WebElement element) 
	{
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public WebElement getActiveElementFromUI() 
	{
		return driver.switchTo().activeElement();
	}

	public void cleanUp() 
	{
		driver.close();
	}

}