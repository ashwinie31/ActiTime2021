package pack1;

	import org.openqa.selenium.WebDriver;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;

	import base.Browser;
	import pom.ApplicationHeaderPage;
	import pom.LoginPage;

	public class NewTest12 extends Browser {
	private WebDriver driver;
	private ApplicationHeaderPage applicationHeaderPage;
	private LoginPage loginPage ;
	  	
	  @BeforeTest
	  @Parameters("browser")
	  public void launchBrowser(String browserName) {
		  System.out.println("launchBrowser");
		  
		if(browserName.equals("Chrome")) {	
			
		 driver =launchChromeBrowser();
		}
//		if(browserName.equals("Firefox")) {	
//			
//			driver = launchFirefoxBrowser();
//			}
			
		if(browserName.equals("EdgeDriver")) {	
			
			 driver = launchEdgeDriverBrowser();
			}	     
	  }
	   
	  @BeforeClass
	  public void createObjectOdPOMClasses () {
		  driver.manage().window().maximize();
		  applicationHeaderPage = new ApplicationHeaderPage(driver);           
		              loginPage = new LoginPage(driver);  
		  	  
	  }
	 @BeforeMethod
	  public void loginToApplication() {
		 System.out.println("loginToApplication");		
		 driver.get("http://localhost/login.do");			    

			loginPage.sendUserName();
			loginPage.sendPasswordName();
			loginPage.clickOnkeepMeLogin();
			loginPage.clickOnLogin();	
	  }

	  @Test(priority =1)
	  public void clickOnUserkPage() {
		  System.out.println("clickOnUser");  	  
		  applicationHeaderPage.clickOnUser();
			String url = driver.getCurrentUrl();
			System.out.println(url);
			String title = driver.getTitle();
			System.out.println(title);
			
		}

	  @Test (priority =2)
	  public void clickOnWorkScheduletPage() {
		  System.out.println("clickOnWorkSchedule");  	  
		  applicationHeaderPage.clickOnWorkSchedule();
			String url = driver.getCurrentUrl();
			System.out.println(url);
			String title = driver.getTitle();
			System.out.println(title);
			
		}

	  @AfterMethod
	  public void logout() {
		  System.out.println("logout");	
		  applicationHeaderPage.clickOnLogout();
		  
	  }
	  @AfterClass
	  public void clearPOMObject() {
		  System.out.println("logout");	
		 applicationHeaderPage=null;
		  loginPage = null;
	  }


	  @AfterTest
	 public void closedBrowser() {
		  System.out.println("closedBrowser");	
		  driver.quit();
		 driver =null;
		  System.gc();//Delete the all object without reference.
	  
	  }

}
