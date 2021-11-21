package week4.day2;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Men Hover
		WebElement mensWear = driver.findElement(By.xpath("(//span[@class='catText'])[6]"));
		Actions builder = new Actions(driver);
		builder.moveToElement(mensWear).perform();

		// Click sports shoe then training shoes
		driver.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]")).click();
		String shoeCount = driver.findElement(By.className("category-count")).getText();
		String trimShoeCount = shoeCount.replaceAll("[\\D]", " ").trim();
		System.out.println(trimShoeCount);
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();

		// Sort low to high
		driver.findElement(By.xpath("//div[@class='sort-selected']")).click();
		driver.findElement(By.xpath("//ul[@class='sort-value']/li[2]")).click();
		Thread.sleep(1000);

		// LIST to check price values low to high
		List<WebElement> priceElement = driver.findElements(By.xpath("(//span[contains(@id,'display-price')])"));
		List<String> priceList = new ArrayList<String>();
		for (int i = 0; i < priceElement.size(); i++) {
			priceList.add(priceElement.get(i).getText());
		}
		System.out.println(priceList);// To check low to high price values

		// Select Range
		WebElement price1 = driver.findElement(By.xpath("//input[@name='fromVal']"));
		price1.clear();
		price1.sendKeys("900");
		WebElement price2 = driver.findElement(By.xpath("//input[@name='toVal']"));
		price2.clear();
		price2.sendKeys("1200");
		driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();

		Thread.sleep(1000);

		// select colour
		driver.findElement(By.xpath("//label[@for='Color_s-Black']")).click();
		// builder.moveToElement(black).click().perform();

		// Checking filters
		String colortext = driver.findElement(By.xpath("(//div[@class='filters'])[2]/div[2]/a"))
				.getAttribute("data-value");
		System.out.println("COLOUR SELECTED IN FILTER:" + colortext);

		String priceText = driver.findElement(By.xpath("(//a[@class='clear-filter-pill'])[1]")).getText();
		System.out.println("PRICE RANGE SELECTED IN FILTER:" + priceText);

		// hover to get quick view
		WebElement hoverElem = driver.findElement(
				By.xpath("//div[@class='col-xs-6 last-no-border  favDp product-tuple-listing js-tuple ']"));
		builder.moveToElement(hoverElem).perform();
		driver.findElement(By.xpath("//div[@class='clearfix row-disc']/div")).click();
		Thread.sleep(1000);
		String priceFinal = driver.findElement(By.xpath("//div[@class='product-price pdp-e-i-PAY-l clearfix']/span[1]")).getText();
		String discountPercent = driver.findElement(By.xpath("//div[@class='product-price pdp-e-i-PAY-l clearfix']/span[2]")).getText();
		System.out.println("FINAL PRICE: Rs."+priceFinal.trim());
		System.out.println("DISCOUNT PERCENT: "+discountPercent);
		WebElement shoePic = driver.findElement(By.xpath("(//img[@class='cloudzoom'])[1]"));
		File src=shoePic.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/shoe.png");
		FileUtils.copyFile(src, dest);
		driver.close();
	
	}

}
