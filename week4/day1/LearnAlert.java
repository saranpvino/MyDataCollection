package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
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
				 String alertText1 = alert.getText();
				 System.out.println(alertText1);
				 alert.accept();
				 
				 //CONFIRM BOX
				 driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
				 alert.dismiss();
				 
				 //PROMPT BOX
				 driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
				 alert.sendKeys("Hi");
				 //String alertText2 = alert.getText();
				 //System.out.println(alertText2);
				 alert.accept();
				 
		
	}

}
