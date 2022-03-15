package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	@FindBy(xpath = "//input[@name='username']")
	private WebElement userName ;
	

	@FindBy(xpath = "//input[@name='pwd']")
	private WebElement password ;
	

	@FindBy(xpath = "//input[@name='remember']")
	private WebElement keepMeLoginCheckbox ;
	

	@FindBy(xpath = "//a[@id='loginButton']")
	private WebElement login ;
	
	private WebDriver driver;
	
	private WebDriverWait wait;
	
	public LoginPage(WebDriver driver)// driver = driver=new chromeDriver()
	{		
		PageFactory.initElements(driver, this);
		this.driver = driver;
		wait = new WebDriverWait(driver,20);    // 20 sec
	}
	
	public void sendUserName() {
		wait.until(ExpectedConditions.visibilityOf(userName));
		userName.sendKeys("admin");
	}
	
	public void sendPasswordName() {
		wait.until(ExpectedConditions.visibilityOf(password));
		password.sendKeys("manager");
	}
	
	public void clickOnkeepMeLogin() {
		wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(keepMeLoginCheckbox));
		
		if(  !(keepMeLoginCheckbox.isSelected()))
		{
			keepMeLoginCheckbox.click();
		}else
		{
			System.out.println("keep Me Login Checkbox already selected");
		}
	}
	
	//methods
	public void clickOnLogin() {
	
		login.click();
	}
	
	//we use in only one method to combine all
//	public void LoginToApplication() {
//		userName.sendKeys("admin");
//		password.sendKeys("manager");
//		
//		if(  !(keepMeLoginCheckbox.isSelected()))
//		{
//			keepMeLoginCheckbox.click();
//		}else
//		{
//			System.out.println("keep Me Login Checkbox already selected");
//		}
//		login.click();
//	}
//	
	
	
	
	
	
	
	
	
	

}
