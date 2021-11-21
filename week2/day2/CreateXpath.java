package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateXpath {
	public static void main(String[] args) throws InterruptedException {
		// Set up Driver
		WebDriverManager.chromedriver().setup();

		// Open browser
		ChromeDriver driver = new ChromeDriver();

		// To maximize browser
		driver.manage().window().maximize();
		
		//Implicitly wait for 30sec for every selenium command
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// To load application URL
		driver.get("http://leaftaps.com/opentaps/");

		// Wait for 2sec before closing browser
		 Thread.sleep(2000);

		// Read text from webElement
		String text = driver.findElement(By.xpath("//h2")).getText();
		System.out.println(text);

		// Getting Username
		WebElement eleUsername = driver.findElement(By.xpath("//input[@id='username']"));
		eleUsername.sendKeys("Demosalesmanager");

		// Getting password
		WebElement elePassword = driver.findElement(By.xpath("//input[@name='PASSWORD']"));
		elePassword.sendKeys("crmsfa");

		// Clicking Login button
		driver.findElement(By.xpath("//input[@value='Login']")).click();	
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		
		// selenium 4 only have this minimize browser option
		// driver.manage().window().minimize();
		
		// To close browser
		//driver.close();
	}

}
