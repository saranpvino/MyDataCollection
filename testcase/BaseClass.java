package testcase;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;

public class BaseClass {
	//public static ChromeDriver driver;//(Sequential..ChromeDriver SESSION will be same.so use static)
	public RemoteWebDriver driver;//(Parallel..ChromeDriver SESSION will differ.so should be non static)
	public String excelFileName;
	
	@DataProvider
	public String[][] sendData() throws IOException {
		// Hard Code Values
		/*
		 * String[][] data =new String[2][4]; data[0][0] = "TestLeaf"; data[0][1] =
		 * "Hari"; data[0][2] = "R"; data[0][3] = "99";
		 * 
		 * data[1][0] = "TestLeaf"; data[1][1] = "Sheriba"; data[1][2] = "T"; data[1][3]
		 * = "98";
		 */
		// Declaring Excel using( CLASSNAME or file name(ReadDataExcel.java)
		//ReadDataExcel re = new ReadDataExcel();
		// fetching data from Excel using method in above mentioned class
		//String[][] data = ReadDataExcel.readDataExcel(excelFileName);
		return ReadDataExcel.readDataExcel(excelFileName);
	}

	@Parameters({"url","username","password","browser"})
	@BeforeMethod
	public void beforeMethod(String url,String uname,String pwd,String browser) {
		switch(browser.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		default:
			System.out.println("Give Browser Name since its important");
		
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.className("decorativeSubmit")).click();
		
	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}

}
