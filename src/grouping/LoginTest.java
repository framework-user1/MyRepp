package grouping;

import org.testng.Assert;
import org.testng.annotations.Test;

import dataprovider.Data_Provider_Utility;

public class LoginTest {
  
  @Test(priority=1, dataProviderClass=Data_Provider_Utility.class, dataProvider="loginDataProvider")
  public void loginTest(String username, String password) {
	  System.out.println(username + " - " + password);
	  //Assert.assertEquals("A", "B");
  }
	
  @Test(priority=2,dependsOnMethods={"loginTest"})
  public void changePwdTest() {
	  System.out.println("Chenging pwd");
  }
  
  @Test(priority=3,dependsOnMethods={"loginTest","changePwdTest"})
  public void logoutTest() {
	  System.out.println("Logging out");
  }
}
