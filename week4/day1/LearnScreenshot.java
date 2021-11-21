package week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// Set up Driver
		WebDriverManager.chromedriver().setup();

		// Open browser
		ChromeDriver driver = new ChromeDriver();

		// To maximize browser
		driver.manage().window().maximize();
		
		//Implicitly wait for 30sec for every selenium command
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// To load application URL
		driver.get("http://leafground.com/pages/Alert.html");

		//SIMPLE ALERT
		 driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		 Alert alert = driver.switchTo().alert();
		 Thread.sleep(2000);
		 //String alertText1 = alert.getText();
		 //System.out.println(alertText1);
		 alert.accept();
		 
		 //TAKING SCREENSHOT OF WEBPAGE
		 File src	=	driver.getScreenshotAs(OutputType.FILE);
		 File dest	=	new File("./snaps/pic1.png");
		 FileUtils.copyFile(src, dest);
		 
		 //TAKING SCREENSHOT OF WEBELEMENT
			/*
			 * WebElement elem = driver.findElement(By.id("")); File src2 =
			 * elem.getScreenshotAs(OutputType.FILE); File dest2 = new
			 * File("./snaps/pic2.png"); FileUtils.copyFile(src2, dest2);
			 */
	}

}
