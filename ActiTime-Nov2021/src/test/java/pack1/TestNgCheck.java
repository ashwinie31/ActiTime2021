package pack1;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class TestNgCheck {
		@BeforeClass
		public void launchBrowser() {
			System.out.println("launchBrowser");		
		}

		@BeforeMethod
		public void loginToApplication() {
			System.out.println("loginToApplication");		
		}
       
		@Test            //by default priority is zero
		public void testE() {
			System.out.println("testE");		
		}		
		@Test(priority =1)
		public void testA() {
			System.out.println("testA");		
		}        
		@Test(priority = 3)
		public void testC() {
			System.out.println("testC");		
		}
		@Test(priority = 2)
		public void testB() {
			System.out.println("testB");		
		}
		@Test(priority = 4)
		public void testD() {
			System.out.println("testD");		
		}
		//invocationCount is used to repeat the test execution
		@Test(invocationCount=4,priority = 5)
		public void testF() {
			System.out.println("testF");		
		}
		
		@AfterMethod
		public void logout() {
			System.out.println("logout");		
		}	
	
		@AfterClass
		public void closedBrowser() {
			System.out.println("closedBrowser");		
		}

	
	

}
