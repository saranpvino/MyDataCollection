package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {
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
		
		driver.findElement(By.xpath("(//a[@class='x-tab-right'])[3]")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("saranpvino@gmail.com");
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		
		String fname = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]")).getText();
		System.out.println(fname);
		
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]")).click();
		driver.findElement(By.xpath("(//div[@class='frameSectionExtra'])[2]/a[1]")).click();
		String pageTitle = driver.getTitle();
		if(pageTitle.contains("Duplicate Lead")) {
			System.out.println(pageTitle);
		}
		
		driver.findElement(By.className("smallSubmit")).click();
		
		String DuplicateLead = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if(fname.equals(DuplicateLead)) {
			System.out.println("Duplicate Lead");
		}
		// selenium 4 only have this minimize browser option
		 driver.manage().window().minimize();
		 driver.close();
	}

}
