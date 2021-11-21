package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchApplication {

	public static void main(String[] args) throws InterruptedException {
		//Set up Driver
		WebDriverManager.chromedriver().setup();
		
		//Open browser
		ChromeDriver driver = new ChromeDriver();
		
		//To maximize browser
		driver.manage().window().maximize();
		
		//To load application URL
		driver.get("http://leaftaps.com/opentaps/");
		
		//Wait for 2sec before closing browser
		Thread.sleep(2000);
		//To close browser
		driver.close();
		
	}

}
