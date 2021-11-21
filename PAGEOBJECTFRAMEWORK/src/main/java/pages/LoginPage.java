package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class LoginPage extends BaseClass{
	//Constructor to keep driver non static for Parallel execution of testcases
	public LoginPage(ChromeDriver driver) {
		this.driver=driver;
	}	
	public LoginPage enterUsername(String uname) {
		driver.findElement(By.id("username")).sendKeys(uname);
		return this;
	}
	public LoginPage enterPassword(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);	
		return this;
	}
	public HomePage clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new HomePage(driver);
	}
}
