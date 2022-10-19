package com.orangeHRM.utils;
import org.testng.annotations.DataProvider;


public class OrangeHRM_TestData {
	@DataProvider(name = "Login")
	public Object[][] Login(){
		return new Object[][] {
			{"Admin", "admin123"},
		};
	}

}
