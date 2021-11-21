package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro+",Keys.ENTER);
		String price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		String price1 = price.replaceAll("[\\D]", "").trim();
		System.out.println(price1);
		String customerRating = driver.findElement(By.xpath("(//span[@class='a-size-base'])[1]")).getText();
		System.out.println(customerRating);
		driver.findElement(By.xpath("(//span[@class='a-declarative'])[1]/parent::span")).click();
		//Actions builder = new Actions(driver);
		//builder.moveToElement(starRating).perform();
		String ratingPercent = driver.findElement(By.xpath("(//span[@class='a-size-base']/a)[2]")).getText();
		System.out.println(ratingPercent);
		driver.findElement(By.xpath("(//div[@class='a-section a-spacing-none'])[3]//a/span")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowHandlesList	=	new ArrayList<String>(windowHandles);
		driver.switchTo().window(windowHandlesList.get(1));
		File src=driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("./snaps/oneplus.png");
		FileUtils.copyFile(src, dest);
		driver.findElement(By.id("add-to-cart-button")).click();
		//driver.switchTo().window(windowHandlesList.get(2));
		String subTotal = driver.findElement(By.xpath("(//div[@class='a-column a-span11 a-text-left a-spacing-top-large']//span)[4]")).getText();
		String subTotal1 = subTotal.replaceAll("[\\D]", "").trim();
		System.out.println(subTotal1);
		if(subTotal1.contains(price1)) {
			System.out.println("Equal");
			driver.quit();
		}
	}

}
