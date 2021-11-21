package week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleFrame {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// SCREENSHOT
		driver.switchTo().frame(0);
		WebElement button1 = driver.findElement(By.xpath("//button[@id='Click']"));
		File src = button1.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/button1.png");
		FileUtils.copyFile(src, dest);
		driver.switchTo().defaultContent();
		
		// NESTED FRAME
		driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='wrapframe'][2]/iframe")));
		driver.switchTo().frame("frame2");
		// driver.switchTo().frame(2);
		driver.findElement(By.id("Click1")).click();
		driver.switchTo().defaultContent();
		
		// Total number of frames
		driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='wrapframe'][3]/iframe")));
		driver.switchTo().frame("frame2");
		driver.switchTo().defaultContent();
		List<WebElement> frameList = driver.findElements(By.tagName("iframe"));
		int sizeOfFrame = frameList.size();
		System.out.println(sizeOfFrame);
	}
}
