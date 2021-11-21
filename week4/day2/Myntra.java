package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myntra {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement men = driver.findElement(By.xpath("(//div[@class='desktop-navContent'])[1]"));
		Actions builder = new Actions(driver);
		builder.moveToElement(men).perform();
		driver.findElement(By.xpath("(//ul[@class='desktop-navBlock']/li)[7]")).click();
		String jacketsMen1 = driver.findElement(By.xpath("//span[@class='title-count']")).getText();
		String jacketsMen = jacketsMen1.replaceAll("[\\D]", " ").trim();
		int jacketForMen = Integer.parseInt(jacketsMen);
		System.out.println("Jackets For Men:" + jacketForMen);
		// Categories count
		String countJackets1 = driver.findElement(By.xpath("(//span[@class='categories-num'])[1]")).getText();
		String countRainJackets1 = driver.findElement(By.xpath("(//span[@class='categories-num'])[2]")).getText();
		String countJackets = countJackets1.replaceAll("[\\D]", " ").trim();
		String countRainJackets = countRainJackets1.replaceAll("[\\D]", " ").trim();
		// System.out.println(countJackets+" : "+countRainJackets);
		int Jackets = Integer.parseInt(countJackets);
		int rainJackets = Integer.parseInt(countRainJackets);
		int totalJackets = Jackets + rainJackets;
		System.out.println("TOTAL Jackets under Category:" + totalJackets);
		if (jacketForMen == totalJackets) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}
		driver.findElement(By.xpath("(//div[@class='common-checkboxIndicator'])[1]")).click();
		driver.findElement(By.className("brand-more")).click();
		driver.findElement(By.xpath("//input[@class='FilterDirectory-searchInput']")).sendKeys("Duke");
		driver.findElement(By.xpath("(//div[@class='common-checkboxIndicator'])[11]")).click();
		driver.findElement(By.xpath("//span[@class='myntraweb-sprite FilterDirectory-close sprites-remove']")).click();
		// String duke =
		// driver.findElement(By.xpath("(//h3[@class='product-brand'])[1]")).getText();
		// System.out.println(duke);
		List<WebElement> dukeElem = driver.findElements(By.xpath("(//h3[@class='product-brand'])"));
		List<String> dukeList = new ArrayList<String>();
		for (WebElement eachDuke : dukeElem) {
			// System.out.println(eachDuke.getText());
			String duke = eachDuke.getText();
			dukeList.add(duke);
		}
		// System.out.println(dukeList);
		if (dukeList.contains("Duke") == true) {
			System.out.println("Yes, It is Duke");
		} else {
			System.out.println("No, It is not Duke");
		}
		WebElement sortBy = driver.findElement(By.xpath("//div[@class='sort-sortBy']"));
		builder.moveToElement(sortBy).perform();
		driver.findElement(By.xpath("//ul[@class='sort-list']/li[3]")).click();
		driver.findElement(By.xpath("//ul[@class='results-base']/li[1]")).click();
		List<String> windowList = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windowList.get(1));
		String price1 = driver.findElement(By.xpath("//span[@class='pdp-price']/strong")).getText();
		String price = price1.replaceAll("[\\D]", " ").trim();
		System.out.println("PRice of Jacket:" + price);
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/jacket.png");
		FileUtils.copyFile(src, dest);
		driver.findElement(By.xpath("//span[@class='myntraweb-sprite pdp-notWishlistedIcon sprites-notWishlisted pdp-flex pdp-center ']/parent::div")).click();
		driver.quit();
	}

}
