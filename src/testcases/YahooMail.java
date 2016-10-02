package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class YahooMail {

	@BeforeSuite
	  public void initializeSeleniumWD() {
		System.out.println("Initializing Selenium WD");
	  }
	
	@AfterSuite
	  public void closeSeleniumWD() {
		System.out.println("Closing Selenium WD");
	  }
	
	@BeforeTest
	  public void connectToDB() {
		System.out.println("Connecting to DB");
	  }
	
	@AfterTest
	  public void closeDBConn() {
		System.out.println("Closing DB");
	  }
	
	@BeforeMethod
	  public void openBrowser() {
		System.out.println("Opening browser");
	  }
	
	@AfterMethod
	  public void closeBrowser() {
		System.out.println("Closing browser");
	  }
	
	@Test
	  public void testsendEmail() {
		System.out.println("Sending email");
	  }
  
	@Test
	  public void testreceiveEmail() {
		System.out.println("Receiving email");
	  }
}
