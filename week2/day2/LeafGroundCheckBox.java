package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundCheckBox {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//div[@class='example']//input)[1]")).click();
		driver.findElement(By.xpath("(//div[@class='example']//input)[3]")).click();
		
		boolean selected1 = driver.findElement(By.xpath("(//div[@class='example']//input)[6]")).isSelected();
		if(selected1) {
			System.out.println(driver.findElement(By.xpath("(//div[@class='example']/div)[6]")).getText());
		}
		
		boolean selected2 = driver.findElement(By.xpath("(//div[@class='example']//input)[8]")).isSelected();
		if(selected2) {
			driver.findElement(By.xpath("(//div[@class='example']//input)[8]")).click();
		}
		driver.findElement(By.xpath("(//div[@class='example']//input)[9]")).click();
		driver.findElement(By.xpath("(//div[@class='example']//input)[10]")).click();
		driver.findElement(By.xpath("(//div[@class='example']//input)[11]")).click();
		driver.findElement(By.xpath("(//div[@class='example']//input)[12]")).click();
		driver.findElement(By.xpath("(//div[@class='example']//input)[13]")).click();
	}

}
