package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/login");
		 Thread.sleep(2000);

		// Getting Username
		WebElement eleUsername = driver.findElement(By.xpath("//input[@id='username']"));
		eleUsername.sendKeys("Demosalesmanager");
		// Getting password
		WebElement elePassword = driver.findElement(By.xpath("//input[@name='PASSWORD']"));
		elePassword.sendKeys("crmsfa");
		// Clicking Login button
		driver.findElement(By.xpath("//input[@value='Login']")).click();	
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
		
		driver.findElement(By.id("firstNameField")).sendKeys("Saranya");
		driver.findElement(By.id("lastNameField")).sendKeys("Devi");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Saran");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("P");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createContactForm_description")).sendKeys("BLA BLA BLA");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("saranpvino@gmail.com");
		
		WebElement eleState = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dropdown1 = new Select(eleState);
		dropdown1.selectByValue("AK");

		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='frameSectionExtra']/a)[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("NOTE DOWN..ITS IMPORTANT");
		
		driver.findElement(By.xpath("(//table)[19]//tr[8]/td[2]/input[@class='smallSubmit']")).click();
		Thread.sleep(2000);
		String titleOfPage = driver.getTitle();
		System.out.println(titleOfPage);
		
		// selenium 4 only have this minimize browser option
		// driver.manage().window().minimize();
		
		// To close browser
		//driver.close();
	}

}
