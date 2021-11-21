package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitToAppear {

	public static void main(String[] args) {
		// Set up Driver
		WebDriverManager.chromedriver().setup();

		// Open browser
		ChromeDriver driver = new ChromeDriver();

		// To maximize browser
		driver.manage().window().maximize();

		// Implicitly wait for 30sec for every selenium command
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// To load application URL
		driver.get("http://leafground.com/pages/appear.html");
		//Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement button = driver.findElement(By.id("btn"));
		wait.until(ExpectedConditions.visibilityOf(button));
		//String text = driver.findElement(By.tagName("strong")).getText();
		System.out.println(button.getText());
	}

}
