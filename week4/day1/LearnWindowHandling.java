package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		// Set up Driver
		WebDriverManager.chromedriver().setup();
		
		//Disable notifications
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		// Open browser
		ChromeDriver driver = new ChromeDriver(options);

		// To maximize browser
		driver.manage().window().maximize();

		// Implicitly wait for 30sec for every selenium command
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// To load application URL
		driver.get("https://www.irctc.co.in/");

		// SWEET ALERT(just a click after finding WebElement)
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		driver.findElement(By.partialLinkText("FLIGHTS")).click();
		Thread.sleep(2000);
		
		//HANDLING WINDOW
		Set<String> windowHandleSet= driver.getWindowHandles();
		List<String> windowHandleList=new ArrayList<String>(windowHandleSet);
		driver.switchTo().window(windowHandleList.get(1));
		String email = driver.findElement(By.xpath("(//a[@href='mailto:flights@irctc.co.in'])[1]")).getText();
		System.out.println(email);
		
		//SWITCHING FROM ONE WINDOW TO ANOTHER WINDOW TO CLOSE IT
		Thread.sleep(2000);
		driver.switchTo().window(windowHandleList.get(0));
		driver.close();//close first window
		Thread.sleep(2000);
		driver.switchTo().window(windowHandleList.get(1));
		
	}

}
