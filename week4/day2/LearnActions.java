package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnActions {

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
		driver.get("http://leafground.com/pages/table.html");
		// Declare Actions
		Actions builder = new Actions(driver);
		// Double Click header
		WebElement header = driver.findElement(By.xpath("//div/h1"));
		builder.doubleClick(header).perform();
		// Right click on header
		builder.contextClick(header).perform();
		// SELECT ALL control+A(KEYBOARD EVENT)
		builder.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
	}

}
