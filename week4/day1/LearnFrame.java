package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;

public class LearnFrame {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		
		//Handling Frame(WebElement) before clicking button(WebElement)
		WebElement frame1 = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(frame1);
		//driver.switchTo().frame("iframeResult");
		//Click Try it(element) which is inside frame
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		//Handling Alert
		Alert alert = driver.switchTo().alert();
		/*//Press OK in alert box
		 * Thread.sleep(2000); alert.accept(); String text =
		 * driver.findElement(By.xpath("//p[@id='demo']")).getText();
		 * if(text.contains("OK")) { System.out.println("Confirmed confirm box"); }
		 */

		//Press Cancel in alert box
		Thread.sleep(2000);
		alert.dismiss();
		String text = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		if (text.contains("Cancel")) {
			System.out.println("Cancelled Confirm Box");
		}
		
		//After handling alert, coming out of frame
		driver.switchTo().defaultContent();

	}

}
