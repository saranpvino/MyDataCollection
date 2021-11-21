package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement createAccount = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		createAccount.click();
		driver.findElement(By.name("firstname")).sendKeys("Saranya");
		driver.findElement(By.name("lastname")).sendKeys("Devi");
		driver.findElement(By.name("reg_email__")).sendKeys("saranpvino@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("saranpvino@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("12345");

		WebElement eleSelect1 = driver.findElement(By.name("birthday_day"));
		Select dropDown1 = new Select(eleSelect1);
		dropDown1.selectByIndex(22);

		WebElement eleSelect2 = driver.findElement(By.name("birthday_month"));
		Select dropDown2 = new Select(eleSelect2);
		dropDown2.selectByValue("5");

		WebElement eleSelect3 = driver.findElement(By.name("birthday_year"));
		Select dropDown3 = new Select(eleSelect3);
		dropDown3.selectByVisibleText("1988");

		boolean selRadioButton = driver.findElement(By.xpath("//label[text()='Female']")).isSelected();
		if(!selRadioButton) {
			driver.findElement(By.xpath("//label[text()='Female']")).click();
		}
				
	}
}
