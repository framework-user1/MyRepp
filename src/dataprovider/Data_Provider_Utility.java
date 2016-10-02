package dataprovider;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class Data_Provider_Utility {

	@DataProvider(name="regDataProvider")
	public static Object[][] regDataProvider() {
		
		Object data[][] = new Object[3][3];
		
		//row#1
		data[0][0] = "username1";
		data[0][1] = "password1";
		data[0][2] = 12345;
		
		//row#2
		data[1][0] = "username2";
		data[1][1] = "password2";
		data[1][2] = 12121;
		
		//row#3
		data[2][0] = "username3";
		data[2][1] = "password3";
		data[2][2] = 32323;
		
		return data;
	}
	
	@DataProvider(name="loginDataProvider")
	public static Object[][] loginDataProvider() {
		
		Object data[][] = new Object[2][2];
		
		//row#1
		data[0][0] = "username1";
		data[0][1] = "password1";
		
		//row#2
		data[1][0] = "username2";
		data[1][1] = "password2";
		
		return data;
	}
	
	@DataProvider(name="searchDataProvider")
	public static Object[][] searchDataProvider() {
		
		Object data[][] = new Object[2][2];
		
		//row#1
		data[0][0] = "hyderabad";
		data[0][1] = "chennai";
		
		//row#2
		data[1][0] = "chennai";
		data[1][1] = "london";
		
		return data;
	}
	
	@DataProvider(name="multiDataProvider")
	public static Object[][] multiDataProvider(Method m) {
		
		Object data[][] = null;
		
		if(m.getName()=="loginTest"){
		
			data = new Object[2][2];
			
			//row#1
			data[0][0] = "username1";
			data[0][1] = "password1";
			
			//row#2
			data[1][0] = "username2";
			data[1][1] = "password2";
			
		}else if(m.getName()=="sendEmailTest"){
			
			data = new Object[3][3];
			
			//row#1
			data[0][0] = "username1";
			data[0][1] = "password1";
			data[0][2] = "test1@gmail.com";
			
			//row#2
			data[1][0] = "username2";
			data[1][1] = "password2";
			data[1][2] = "test2@gmail.com";
			
			//row#3
			data[2][0] = "username3";
			data[2][1] = "password3";
			data[2][2] = "test3@gmail.com";
				
		}
			return data;
	}
}
