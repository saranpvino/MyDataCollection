package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
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
		
		driver.findElement(By.xpath("(//div[@class='x-form-element'])[19]/input")).sendKeys("Saranya");
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class=\"x-grid3-cell-inner x-grid3-col-firstName\"])[1]/a")).click();
		String titlePage= driver.getTitle();
		if(titlePage.contains("View Lead")) {
			System.out.println(titlePage);
		}
		String companyName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println("PREVIOUS COMPANY: "+companyName);
		
		driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a[3]")).click();
		
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("HCL");
		driver.findElement(By.xpath("(//div[@class='fieldgroup-body']//table//tr/td)[40]/input")).click();
		
		String updatedCompany = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println("CURRENT COMPANY: "+updatedCompany);
		
		// selenium 4 only have this minimize browser option
		 //driver.manage().window().minimize();
		 //driver.close();
	}

}
