package demo.webdrivermanagerexamples;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;

public class GetScreenshots2 
{
	public static void main(String[] args) throws IOException  
	{
	    SeleniumUtility m1=new SeleniumUtility();
	    WebDriver driver=m1.setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
	      
	    //Type Cast WebDriver Instance into TakesScreenshot Interface
	    String filelocation=".\\screenshots\\vtiger_"+System.currentTimeMillis()+".jpg";
	    getScreenshot(driver, filelocation);
	}
	
	public static void getScreenshot(WebDriver driver, String filePath)
	{   //downcast driver to access TakesScreenshot method
		TakesScreenshot ts= (TakesScreenshot) driver;
		
		//capture screenshot as output Type FILE
		File file = ts.getScreenshotAs(OutputType.FILE);
		try 
		{
			//Save the screenshot taken in destination path
			FileUtils.copyFile(file, new File(filePath));
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
				
	}

}

//String fileLocation=".\\screenshots\\vtiger_"+System.currentTimeMillis()+".jpg";
