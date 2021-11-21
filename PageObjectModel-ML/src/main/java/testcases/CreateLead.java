package testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;
import utils.RetryFailedTests;

public class CreateLead extends BaseClass{
	
	@BeforeTest
	public void setValue() {
		excelFileName = "CreateLead";
	}
	
	@Test(dataProvider = "provideData"/*,retryAnalyzer=RetryFailedTests.class*/ )
	public void runCreateLead(String lang, String username,String password,String company, 
			                  String firstName, String lastName) throws InterruptedException, IOException {
		
		File file = null;
		if(lang.equalsIgnoreCase("EN")) {
			file = new File("src/main/resources/en.properties");
			
		}else if(lang.equalsIgnoreCase("FR")) {
			file = new File("src/main/resources/fr.properties");
		}else if(lang.equalsIgnoreCase("DU")) {
			file = new File("src/main/resources/du.properties");
		}
		
		FileInputStream fs = new FileInputStream(file);
		prop.load(fs);
		
		new LoginPage(driver)
		.enterUsername(username+"1")	//given for retryanalyzer
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
