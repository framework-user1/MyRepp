package grouping;

import org.testng.annotations.Test;

import dataprovider.Data_Provider_Utility;

public class SameDataProvider {
  
  @Test(priority=1, dataProviderClass=Data_Provider_Utility.class, dataProvider="multiDataProvider")
  public void loginTest(String username, String password) {
	  //System.out.println(username + " - " + password);
  }
  
  @Test(priority=1, dataProviderClass=Data_Provider_Utility.class, dataProvider="multiDataProvider")
  public void sendEmailTest(String to, String cc, String bcc) {
	  System.out.println(to + " - " + cc + " - " + bcc);
  }
 
}
