package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.ApplicationHeaderPage;
import pom.EnterTimeTrack;
import pom.LoginPage;

public class TestClass {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","D:\\s\\driver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.get("http://localhost/login.do");
			//driver.manage().window().maximize();
			
			LoginPage loginPage = new LoginPage(driver);
			
			loginPage.sendUserName();
			loginPage.sendPasswordName();
			loginPage.clickOnkeepMeLogin();
			loginPage.clickOnLogin();
			
		//	loginPage.LoginToApplication();
			
			ApplicationHeaderPage applicationHeaderPage = new ApplicationHeaderPage(driver);
			
			applicationHeaderPage.clickOntask();
			String url = driver.getCurrentUrl();
			String title = driver.getTitle();
			
			if(url.equals("http://localhost/tasks/otasklist.do"))
			{
				System.out.println("PASS");
			}
			else
			{
				System.out.println("Fail");
			}
			
			if(title.equals("actiTIME - Open Tasks"))
			{
				System.out.println("PASS");
			}
			else
			{
				System.out.println("Fail");
			}
			//applicationHeaderPage.clickOntask();
		//	applicationHeaderPage.clickOnReport();
		//	applicationHeaderPage.clickOnUser();
			applicationHeaderPage.clickOnWorkSchedule();
			
			applicationHeaderPage.clickOntask();
			
			EnterTimeTrack enterTimeTrack = new EnterTimeTrack(driver);
			
			 enterTimeTrack.clickOnNew();
			 //Thread.sleep(10);
		    // enterTimeTrack.clickOnSelectCustomer();
		   //  Thread.sleep(10);
			//  enterTimeTrack.NewCustomer();
			//enterTimeTrack.enterCustomerName();
			//  enterTimeTrack.enterProjectName();
			  enterTimeTrack.entertaskName();
			  enterTimeTrack.clickOnCreateTask();
			  enterTimeTrack.clickOnSaveButton();
			  
			//enterTimeTrack.clickOnNew();
			//enterTimeTrack.clickOnSelectCustomer();
			
			//enterTimeTrack.enterCustomerName();
			//enterTimeTrack.enterProjectName();
			//enterTimeTrack.enterCustomerName();
			//enterTimeTrack.clickOnCreateTask();
			
			
	}

}
