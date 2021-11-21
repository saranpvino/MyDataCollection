package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundEdit {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("email")).sendKeys("saranpvino@gmail.com");
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("Hi");
		String getText = driver.findElement(By.xpath("//input[@value='TestLeaf']")).getAttribute("value");
		System.out.println(getText);
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
		boolean enabled = driver.findElement(By.xpath("//label[@for='disabled']/following-sibling::input")).isEnabled();
		if(!enabled) {
			System.out.println("Disabled");
		}
		
	}
}
