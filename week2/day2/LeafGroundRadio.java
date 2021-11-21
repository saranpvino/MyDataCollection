package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundRadio {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("yes")).click();
		boolean selected = driver.findElement(By.xpath("//label[@for='Checked']/input")).isSelected();
		if (selected) {
			String attribute = driver.findElement(By.xpath("//label[@for='Checked']")).getText();
			System.out.println(attribute);
		}
		boolean selected1 = driver.findElement(By.xpath("(//input[@name='age'])[1]")).isSelected();
		boolean selected2 = driver.findElement(By.xpath("(//input[@name='age'])[2]")).isSelected();
		boolean selected3 = driver.findElement(By.xpath("(//input[@name='age'])[3]")).isSelected();
		if(selected1||selected2||selected3) {
			System.out.println("Age group Selected already");
		}
		else {
			driver.findElement(By.xpath("(//input[@name='age'])[3]")).click();
		}
	}

}
