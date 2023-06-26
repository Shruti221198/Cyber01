package demo.webdrivermanagerexamples;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;

public class GetScreenshots 
{
	public static void main(String[] args) throws IOException 
	{
      SeleniumUtility m1=new SeleniumUtility();
      WebDriver driver=m1.setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
      
      //Type Cast WebDriver Instance into TakesScreenshot Interface
      String filelocation=".\\screenshots\\vtiger_LoginPage.jpg";
      
      TakesScreenshot ts = (TakesScreenshot) driver;
      
      File file = ts.getScreenshotAs(OutputType.FILE);
      
      FileUtils.copyFile(file, new File(filelocation));
      
	}

}
