package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrack {


	@FindBy(xpath="//span[text()='New']")
	private WebElement New;
	
	@FindBy(xpath="//button[text()='- Select Customer -']")
	private WebElement selectCustomer;
	
	@FindBy(xpath="(//a[text()='- New Customer -']")
	private WebElement newCustomer;
	
	@FindBy(xpath="//input[@id='createTasksPopup_newCustomer']")
	private WebElement enterCustomerName;
	
	@FindBy(xpath="//input[@id='createTasksPopup_newProject']")
	private WebElement enterProjectName;
	
	@FindBy(xpath="(//input[@placeholder='Enter task name'])[1]")
	private WebElement entertaskName1;
	

	@FindBy(xpath="(//input[@placeholder='Enter task name'])[2]")
	private WebElement entertaskName2;
	

	@FindBy(xpath="(//input[@placeholder='Enter task name'])[3]")
	private WebElement entertaskName3;
	
	@FindBy(xpath="//span[text()='Create Tasks']")
	private WebElement createTask;
	

	@FindBy(xpath="//a[text()='Ashwini']")
	private WebElement ashwiniUser;
	
	@FindBy(xpath = "//input[@id='SubmitTTButton']")
	private WebElement saveButton ;
	
	
	public Actions action;
	
	public EnterTimeTrack(WebDriver driver){
		PageFactory.initElements(driver, this);
		action = new Actions(driver);
	}	
	public void clickOnNew(){
		New.click();
	}
		public void clickOnSelectCustomer() throws InterruptedException{
		selectCustomer.sendKeys("Lina");
		Thread.sleep(10);
		action.moveToElement(newCustomer).click().build().perform();
		Thread.sleep(10000);
				
		}
	

     //   public void NewCustomer(){
       // 	newCustomer.click(); 
        //	}
	 
	public void enterCustomerName(){
		enterCustomerName.sendKeys("Lina");
	}
	
	public void enterProjectName(){
	enterProjectName.sendKeys("DemoProjectNov2022");
	}
	
	public void entertaskName(){
		entertaskName1.sendKeys("ABC");
	    entertaskName2.sendKeys("XYZ");
	    entertaskName3.sendKeys("PQR");
		}
	
	public void clickOnCreateTask(){
		createTask.click();
	}
	
	public void clickOnSaveButton() {		
		saveButton.click();		
	}


}
