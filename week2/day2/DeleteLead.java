package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/main");

		// Getting Username
		WebElement eleUsername = driver.findElement(By.xpath("//input[@id='username']"));
		eleUsername.sendKeys("Demosalesmanager");
		// Getting password
		WebElement elePassword = driver.findElement(By.xpath("//input[@name='PASSWORD']"));
		elePassword.sendKeys("crmsfa");
		// Clicking Login button
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Leads")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("");
		driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("044");
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("123456789");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		String partyID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]")).getText();
		//System.out.println(partyID);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='frameSectionBody']//li[3]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='x-form-element'])[18]/input")).sendKeys(partyID);
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();
		String noRecords = driver.findElement(By.xpath("//div[contains(text(),'No')]")).getText();
		System.out.println(noRecords);
		// To close browser
		driver.close();		
		// selenium 4 only have this minimize browser option
		// driver.manage().window().minimize();
	}

}
