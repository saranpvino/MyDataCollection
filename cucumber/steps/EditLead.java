package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditLead extends BaseClass {
	@When("Click this {string} Link")
	public void phone_link_click(String link)
	{
		driver.findElement(By.xpath("//span[text()='"+link+"']")).click();	
	}
	@Then("Enter Updated Phone Number {string}")
	public void enter_updated_phone(String phNum) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phNum);
	}
	@When("Click {string} Button")
	public void find_button_click(String button)
	{
		driver.findElement(By.xpath("//button[text()='"+button+"']")).click();	
	}
	@Then("Click First Lead Id")
	public void first_lead_id() throws InterruptedException {
		Thread.sleep(2000);
		leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"))
				.getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}
	@Then("Enter Updated Company Name {string}")
	public void updateLeadForm_companyName(String compName) {
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(compName);
	}
}
