package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.CreateLeadPage;
import pages.LoginPage;

public class CreateLead extends BaseClass{
	
	@BeforeTest
	public void setValue() {
		excelFileName = "CreateLead";
	}
	
	@Test(dataProvider = "sendData" )
	public void runCreateLead(String username,String password,String company, 
			                  String firstName, String lastName) throws InterruptedException {
		//LoginPage lp = new LoginPage(driver);
		
		new LoginPage(driver)
		.enterUsername(username)
		.enterPassword(password)
		.clickLoginButton()
		.clickCrmSfaLink()
		.clickLeadsLink()
		.clickCreateLeadLink()
		.enterCompanyName(company)
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.clickCreateLeadButton()
		.verifyFirstName();
		

	}

}
