package base;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	
	

	public static WebDriver launchChromeBrowser() {
		System.setProperty("webdriver.chrome.driver","src" + File.separator + "test" + File.separator + "resources" + File.separator + "Browse" + File.separator + "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}
	
	public static WebDriver launchEdgeDriverBrowser() {
		System.setProperty("webdriver.gecko.driver","src" + File.separator + "test" + File.separator + "resources" + File.separator + "Browse" + File.separator + "geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		return driver;
	}
	
	
	
//	public static WebDriver launchChromeBrowser() {
//		System.setProperty("webdriver.chrome.driver","D:\\s\\driver\\chromedriver.exe");			
//		WebDriver driver = new ChromeDriver();
//		return driver;
//	}
//	
//	public static WebDriver launchFirefoxBrowser() {
//		 System.setProperty("webdriver.gecko.driver","D:\\s\\driver\\geckodriver.exe");			
//		WebDriver driver = new FirefoxDriver();
//		return driver;
//	}
//	
//	public static WebDriver launchEdgeDriverBrowser() {
//		 System.setProperty("webdriver.edge.driver","D:\\s\\driver\\msedgedriver.exe");				
//		WebDriver driver = new EdgeDriver();
//		return driver;
//	}
//	
}
