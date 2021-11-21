package base;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadDataExcel;


public class BaseClass {
	public ChromeDriver driver;
	
	public String excelFileName;
	
	public static ExtentReports extent;
	public String testName, testDescription, testCategory, testAuthor;
	public static ExtentTest test;
	
	@BeforeSuite
	public void startReport() {
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/result.html");
		reporter.setAppendExisting(true);
		extent = new ExtentReports();
		extent.attachReporter(reporter);
	}
	
	@BeforeClass
	public void testcaseDetails() {
		test = extent.createTest(testName, testDescription);
		test.assignCategory(testCategory);
		test.assignAuthor(testAuthor);
	}
	
	public void takeSnap() throws IOException {
		int ranNum=(int) (Math.random()*999999+999999);
		File src=driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("");
		FileUtils.copyFile(src,dest);
	}

	
	public void reportStep(String msg,String status) throws IOException {
		if(status.equalsIgnoreCase("pass")) {
			test.pass(msg);
		}else if(status.equalsIgnoreCase("fail")) {
			test.fail(msg);
			throw new RuntimeException("Look into Description");
		}

	}
		
	@DataProvider
	public String[][] sendData() throws IOException {
		return ReadDataExcel.readDataExcel(excelFileName);
	}

	@BeforeMethod
	public void beforeMethod() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@AfterMethod
	public void afterMethod() {
		//driver.close();
	}
	
	@AfterSuite
	public void stopReport() {
		extent.flush();
	}
}
