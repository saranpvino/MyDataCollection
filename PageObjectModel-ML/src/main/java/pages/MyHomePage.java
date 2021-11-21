package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;

public class MyHomePage extends BaseClass {
	public MyHomePage(RemoteWebDriver driver) {
		this.driver = driver;
	}

	public MyLeadsPage clickLeadsLink() {
		driver.findElement(By.linkText(prop.getProperty("MyHome_LeadsLink"))).click();
		return new MyLeadsPage(driver);
	}

}
