package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.BaseClass;

public class HomePage extends BaseClass{
	public HomePage(ChromeDriver driver) {
		this.driver=driver;
	}
	public HomePage verifyHomePage() {
		boolean dispalyed=driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		Assert.assertTrue(dispalyed);
		return this;
	}
	public MyHomePage clickCrmSfaLink() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage(driver);
	}
	
}
