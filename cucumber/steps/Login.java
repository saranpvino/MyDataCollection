package steps;

import java.time.Duration;

import org.apache.xalan.xsltc.compiler.util.ErrorMessages;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login extends BaseClass {

	@Given("Enter username as {string}")
	public void enter_username_as_(String uname) {
		driver.findElement(By.id("username")).sendKeys(uname);
	}

	@Given("Enter password as {string}")
	public void enter_password_as_(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
	}

	@When("Click on Login button")
	public void click_on_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	@Then("Title should be matching with {string}")
	public void homepage_should_be_displayed(String actTitle) {
		String titlePage = driver.getTitle();
		/*
		 * if (titlePage.equalsIgnoreCase(actTitle)) { System.out.println("Matching"); }
		 * else { System.out.println("Not Matching"); }
		 */
		Assert.assertEquals(actTitle, titlePage);
	}
	
	@But("Error message should be displayed")
	public void ErrorMessage() {
		System.out.println("Error Message");
	}

}
