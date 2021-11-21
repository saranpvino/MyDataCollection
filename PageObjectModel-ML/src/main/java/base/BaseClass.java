package base;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadExcel;


public class BaseClass {

	public RemoteWebDriver driver;
	public String excelFileName; // null
	public static Properties prop = new Properties();


	@DataProvider(indices = 0)		//Read index - 0 data from Excel i.e 'EN'
	public String[][] provideData() throws IOException {
		return ReadExcel.readData(excelFileName);
	}

	@Parameters({"browser"})
	@BeforeMethod
	public void preCondition(String browser) {
		switch(browser.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		case "safari":
			WebDriverManager.edgedriver().setup();
			driver = new SafariDriver();
			break;
		case "internetexplorer":
			WebDriverManager.iedriver().setup();
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("The browser is important");
		}
			
		System.out.println(driver);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	@AfterMethod
	public void postCondition() {
		driver.close();

	}

}
