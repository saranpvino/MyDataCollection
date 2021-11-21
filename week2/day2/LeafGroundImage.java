package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundImage {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//img[@src='../images/home.png']")).click();
		Thread.sleep(2000);
		driver.navigate().to("http://leafground.com/pages/Image.html");
		
		String attribute = driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']")).getAttribute("onclick");
		if(attribute	==	null) {
			System.out.println("Broken Image");
		}
		
		driver.findElement(By.xpath("//img[@src='../images/keyboard.png']")).click();
		Thread.sleep(2000);
		driver.navigate().to("http://leafground.com/pages/Image.html");
		 
		
	}

}
