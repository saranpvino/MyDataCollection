package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundButton {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement homePage = driver.findElement(By.xpath("//button[@id='home']"));
		homePage.click();
		driver.navigate().to("http://leafground.com/pages/Button.html");
		//String homePageLink = homePage.getAttribute("onclick");
		//System.out.println(homePageLink);
		
		System.out.println(driver.findElement(By.xpath("//button[contains(text(),'Position')]")).getLocation());
		
		String cssValue = driver.findElement(By.xpath("//button[contains(text(),'color')]")).getCssValue("background-color");
		System.out.println(cssValue);

		int width = driver.findElement(By.xpath("//button[contains(text(),'size')]")).getSize().getWidth();
		System.out.println(width);

		
	}
}
