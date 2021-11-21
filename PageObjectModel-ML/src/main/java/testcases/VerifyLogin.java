package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class VerifyLogin extends BaseClass{
	
	@BeforeTest
	public void setValue() {
		excelFileName = "Login";
	}
	
	
	@Test(dataProvider = "provideData")
	public void runVerifyLogin(String username,String password) throws InterruptedException {
		System.out.println(driver);
		
		LoginPage lp = new LoginPage(driver);
	
		lp.enterUsername(username)
		.enterPassword(password)
		.clickLoginButton()
		.verifyHomePage();
	

	}
	

}
