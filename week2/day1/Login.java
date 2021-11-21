package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// Set up Driver
		WebDriverManager.chromedriver().setup();

		// Open browser
		ChromeDriver driver = new ChromeDriver();

		// To maximize browser
		driver.manage().window().maximize();

		// To load application URL
		driver.get("http://leaftaps.com/opentaps/");

		// Wait for 2sec before closing browser
		 Thread.sleep(2000);

		// Read text from webElement
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);

		// Getting Username
		WebElement eleUsername = driver.findElement(By.id("username"));
		eleUsername.sendKeys("Demosalesmanager");

		// Getting password
		WebElement elePassword = driver.findElement(By.name("PASSWORD"));
		elePassword.sendKeys("crmsfa");

		// Clicking Login button
		driver.findElement(By.className("decorativeSubmit")).click();

		// selenium 4 only have this minimize browser option
		driver.manage().window().minimize();
		
		// To close browser
		driver.close();
	}

}
