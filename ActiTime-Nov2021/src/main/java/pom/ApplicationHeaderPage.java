package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationHeaderPage {
	@FindBy(xpath = "//div[text()='Time-Track']")
	private WebElement timeTrack ;
	
	@FindBy(xpath = "//div[text()='Tasks']")
	private WebElement task ;
	
	@FindBy(xpath = "//table[@id='topnav']//tbody//tr/td[7]//a//div[2]")
	private WebElement report ;
	
	@FindBy(xpath = "//div[text()='Users']")
	private WebElement user ;
	
	@FindBy(xpath = "//div[text()='Work Schedule']")
	private WebElement workSchedule ;
	
	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logOut ;
	
	private Actions actions;
	
	public ApplicationHeaderPage(WebDriver driver)// driver = driver=new chromeDriver()
	{		
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
	}

	public void clickOnTimeTrack() {		
		timeTrack.click();		
	}
	public void clickOntask() {		
		task.click();		
	}
	public void clickOnReport() {		
		report.click();		
	}
	public void clickOnUser() {		
		user.click();		
	}
	public void clickOnWorkSchedule() {		
		workSchedule.click();		
	}
	

	public void clickOnLogout() {
		actions.moveToElement(logOut).click().build().perform();
		
		
	}
	

}
