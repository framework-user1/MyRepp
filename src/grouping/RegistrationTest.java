package grouping;

import org.testng.annotations.Test;

import dataprovider.Data_Provider_Utility;

public class RegistrationTest {
 
	@Test(dataProviderClass = Data_Provider_Utility.class,dataProvider = "regDataProvider")
	public void registrationTest(String username, String password, int pin) {
		System.out.println(username + " - " + password + " - " + pin);
	}
}
