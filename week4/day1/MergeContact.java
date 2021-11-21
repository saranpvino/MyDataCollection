package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {
	public static void main(String[] args) throws InterruptedException {
		// Set up Driver
		WebDriverManager.chromedriver().setup();

		// Open browser
		ChromeDriver driver = new ChromeDriver();

		// To maximize browser
		driver.manage().window().maximize();

		// Implicitly wait for 30sec for every selenium command
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// To load application URL
		driver.get("http://leaftaps.com/opentaps/");

		// Wait for 2sec before closing browser
		Thread.sleep(2000);

		// Read text from webElement
		String text = driver.findElement(By.xpath("//h2")).getText();
		System.out.println(text);

		// Getting Username
		WebElement eleUsername = driver.findElement(By.xpath("//input[@id='username']"));
		eleUsername.sendKeys("Demosalesmanager");

		// Getting password
		WebElement elePassword = driver.findElement(By.xpath("//input[@name='PASSWORD']"));
		elePassword.sendKeys("crmsfa");

		// Clicking Login button
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();

		driver.findElement(By.xpath("//a[text()='Contacts']")).click();

		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[1]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowHandlesList = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windowHandlesList.get(1));
		driver.findElement(By.xpath("((//div[@class='x-grid3-row   '])[1]//tbody/tr[1]/td//a)[1]")).click();
		driver.switchTo().window(windowHandlesList.get(0));
		
		driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[2]")).click();
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> windowHandlesList1 = new ArrayList<String>(windowHandles1);
		driver.switchTo().window(windowHandlesList1.get(1));
		driver.findElement(By.xpath("((//div[@class='x-grid3-body'])[1]//tbody/tr[1]/td//a)[6]")).click();
		driver.switchTo().window(windowHandlesList1.get(0));
		
		driver.findElement(By.className("buttonDangerous")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		//System.out.println(driver.getTitle());
		String titlePage = driver.getTitle();
		if(titlePage.contains("View")) {
			System.out.println("Yes thats the page");
		}
		else {
			System.out.println("No its not that page");
		}
		// selenium 4 only have this minimize browser option
		// driver.manage().window().minimize();

		// To close browser
		// driver.close();
	}

}
