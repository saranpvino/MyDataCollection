package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class VerifyLogin extends BaseClass{
	@BeforeTest
	public void setValue() {
		excelFileName = "Login";
		testName="Verify Login";
		testDescription="Login with Positive Credentials";
		testCategory="smoke";
		testAuthor="Hari";
	}

	@Test(dataProvider = "sendData")
	public void runVerifyLogin(String username,String password) {
		LoginPage lp = new LoginPage(driver);
		lp.enterUsername(username).enterPassword(password).clickLoginButton().verifyHomePage();
	}
}
