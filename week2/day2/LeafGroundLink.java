package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundLink {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//a[text()='Go to Home Page'])[1]")).click();
		Thread.sleep(2000);
		driver.navigate().to("http://leafground.com/pages/Link.html");
		
		String hyperLink2 = driver.findElement(By.xpath("//a[text()='Find where am supposed to go without clicking me?']")).getAttribute("href");
		Thread.sleep(2000);
		driver.navigate().to(hyperLink2);
		Thread.sleep(2000);
		driver.navigate().to("http://leafground.com/pages/Link.html");
		
		driver.findElement(By.xpath("//a[text()='Verify am I broken?']")).click();
		String currentUrl = driver.getCurrentUrl();
		if(currentUrl.contains("error.html")) {
			System.out.println("Yes Broken");
			Thread.sleep(2000);
			driver.navigate().to("http://leafground.com/pages/Link.html");
		}
		
		driver.findElement(By.xpath("//label[@for='position']/preceding-sibling::a")).click();
		Thread.sleep(2000);
		driver.navigate().to("http://leafground.com/pages/Link.html");
		
		driver.findElement(By.xpath("//a[@href='#']")).click();
		int size = driver.findElements(By.tagName("a")).size(); 
		System.out.println(size);
	}

}
