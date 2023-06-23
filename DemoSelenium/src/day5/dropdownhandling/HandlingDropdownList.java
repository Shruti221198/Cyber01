package day5.dropdownhandling;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdownList 
{
	public static void main(String[] args) 
	{
     System.setProperty("webdriver.chrome.driver", "F:\\Automation_Session\\Workspace\\DemoSelenium\\executables\\chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     
     driver.get("https://demo.automationtesting.in/Register.html");
     driver.manage().window().maximize();
     
     //***Identify dropdown List***
     WebElement SkillDropdown=driver.findElement(By.id("Skills"));
     
     //***Create an instance of select class and pass above element into its constructor***
     Select SelectSkill=new Select(SkillDropdown);
     
     //***Check whether Dropdown is multiselect Dropdown or not***
     System.out.println("Is dropdown allowing you to select multiple option: "+SelectSkill.isMultiple());
     
     //***Get Default or already select Option***
     WebElement selectedOption=SelectSkill.getFirstSelectedOption();
     String selectedOptionName=selectedOption.getText();
     System.out.println("Already selected Option Name: "+selectedOptionName);
     //or
     System.out.println("Already selected Option Name is: "+SelectSkill.getFirstSelectedOption().getText());
     
     //***Get Option Count***
     List<WebElement> Options=SelectSkill.getOptions();
     System.out.println("Option count is: "+Options.size());
     
     //***Get Dropdown Options Names***
     for(int i=0; i<Options.size(); i++)
     {
    	 System.out.println("Option " +i+ ": "+Options.get(i).getText());
     }
     
     //TODO Validation Dropdown Skills are getting displayed in Ascending Skills.
     
     //Select Options from dropdown
     SelectSkill.selectByIndex(4);
     System.out.println("Already selected Option Name: "+SelectSkill.getFirstSelectedOption().getText());
     //or
     SelectSkill.selectByValue("Backup Management");
     System.out.println("Already selected Option Name: "+SelectSkill.getFirstSelectedOption().getText());
     //or
     SelectSkill.selectByVisibleText("Analytics");
     System.out.println("Already selected Option Name: "+SelectSkill.getFirstSelectedOption().getText());
     
     //Checking the Order of Skills
     String act_skillName="";
     
     //Get Dropdown Option Names
     for(int i=1; i<Options.size(); i++)
     {
    	 if((Options.size()-1)!=i)
    	 {
    		 
    		act_skillName=act_skillName+Options.get(i).getText()+", ";	 
    	 }
    	 else
    	 {
    		 act_skillName=act_skillName+Options.get(i).getText();
    	 }
     }
     //Expected Skills
     String exp_skillName="Adobe InDesign, Adobe Photoshop, Analytics, Android, APIs, Art Design, AutoCAD, Backup Management, C, C++, Certifications, Client Server, Client Support, Configuration, Content Managment, Content Management Systems (CMS), Corel Draw, Corel Word Perfect, CSS, Data Analytics, Desktop Publishing, Design, Diagnostics, Documentation, End User Support, Email, Engineering, Excel, FileMaker Pro, Fortran, HTML, Implementation, Installation, Internet, iOS, iPhone, Linux, Java, Javascript, Mac, Matlab, Maya, Microsoft Excel, Microsoft Office, Microsoft Outlook, Microsoft Publisher, Microsoft Word, Microsoft Visual, Mobile, MySQL, Networks, Open Source Software, Oracle, Perl, PHP, Presentations, Processing, Programming, PT Modeler, Python, QuickBooks, Ruby, Shade, Software, Spreadsheet, SQL, Support, Systems Administration, Tech Support, Troubleshooting, Unix, UI / UX, Web Page Design, Windows, Word Processing, XML, XHTML";
     System.out.println("skillName: "+act_skillName);
     System.out.println("exp_skillName: "+exp_skillName);
     System.out.println("Skills are in sorted order or not: "+act_skillName.equals(exp_skillName));
     
     //TODO: Perform Validations on following
     //1. Year(ascending order validations)
     //2. Month(Month Sequence validations)
     //3. Days(ascending order validations)
     
     Select DayDropdown=new Select(driver.findElement(By.id("daybox")));
     List<Integer> Days=new ArrayList<Integer>();
     for(int i=1; i < DayDropdown.getOptions().size(); i++)
     {
    	String Day=DayDropdown.getOptions().get(i).getText();
    	Days.add(Integer.parseInt(Day));
     }
     List<Integer> DupDays=new ArrayList<Integer>(Days);
    	 //dupdays.AddAll(days);
     Collections.sort(DupDays);
     System.out.println(Days.equals(DupDays));
     
     //TODO: Validate Year and Month Dropdown
     /* 
      * Multiselect
      * Default Value
      * Option Count
      * Print One by One Options
      * Order
      */
	}
	
}
