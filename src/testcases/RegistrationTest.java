package testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegistrationTest {
 
	@Test(dataProvider = "regDataProvider")
	public void registrationTest(String username, String password, int pin) {
		System.out.println(username + " - " + password + " - " + pin);
	}
	
	@DataProvider
	public Object[][] regDataProvider() {
		
		Object data[][] = new Object[2][3];
		
		//row#1
		data[0][0] = "username1";
		data[0][1] = "password1";
		data[0][2] = 12345;
		
		//row#2
		data[1][0] = "username2";
		data[1][1] = "password2";
		data[1][2] = 12121;
		
		return data;
	}
}
