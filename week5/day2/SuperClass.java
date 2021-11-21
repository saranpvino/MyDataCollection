package week5.day2;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;

public class SuperClass {
	public ChromeDriver driver;
	public static String incidentNo;

	@Parameters({"url","password","username","filter"})
	@BeforeMethod
	public void beforeMethod(String url,String pwd,String uname,String filter) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.id("user_name")).sendKeys(uname);
		driver.findElement(By.id("user_password")).sendKeys(pwd);
		driver.findElement(By.id("sysverb_login")).click();
		driver.findElement(By.xpath("//input[@id='filter']")).sendKeys(filter);
	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}

}
