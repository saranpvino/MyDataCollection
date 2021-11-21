package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.name("UserFirstName")).sendKeys("Saranya");
		driver.findElement(By.name("UserLastName")).sendKeys("Devi");
		driver.findElement(By.name("UserEmail")).sendKeys("saranpvino@gmail.com");
		driver.findElement(By.name("CompanyName")).sendKeys("XYZ");
		driver.findElement(By.name("UserPhone")).sendKeys("123456789");
		
		driver.findElement(By.name("UserTitle")).sendKeys("IT Manager");
		WebElement eleSelect2 = driver.findElement(By.xpath("//select[@name='CompanyEmployees']"));
		Select dropDown2	=	new Select(eleSelect2);
		dropDown2.selectByValue("250");
		WebElement eleSelect3 = driver.findElement(By.name("CompanyCountry"));
		Select dropDown3	=	new Select(eleSelect3);
		dropDown3.selectByVisibleText("India");
		
		driver.findElement(By.xpath("//div[@class='checkbox-ui']")).click();
		Thread.sleep(2000);
		driver.close();
	}
}
