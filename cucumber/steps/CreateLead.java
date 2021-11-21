package steps;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead extends BaseClass {
	//Click on linkText
	@When("Click on {string} link")
	public void clickCRMSFA(String partialText) {
		driver.findElement(By.linkText(partialText)).click();

	}
	//DYNAMIC XPATH
	@Then("{string} Page should be displayed")
	public void verifyPage(String partialText) {
		boolean displayed = driver.findElement(By.xpath("//div[contains(text(),'" + partialText + "')]")).isDisplayed();
		Assert.assertTrue(displayed);
	}

	@Then("Enter Company Name {string}")
	public void enter_company_name_test_leaf(String compName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(compName);
	}

	@Then("Enter First Name {string}")
	public void enter_first_name_saran(String fName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
	}

	@Then("Enter Last Name {string}")
	public void enter_last_name_p(String lName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
	}

	@Then("Enter Phone Number {string}")
	public void enter_phone_number(String phNum) {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phNum);
	}

	@When("Click Submit Button")
	public void click_submit_button() {
		driver.findElement(By.name("submitButton")).click();
	}
}
