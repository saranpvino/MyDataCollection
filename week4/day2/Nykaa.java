package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Actions builder = new Actions(driver);
		WebElement brands = driver.findElement(By.xpath("//a[text()='brands']"));
		builder.moveToElement(brands).perform();
		driver.findElement(By.id("brandSearchBox")).sendKeys("L'Oreal Paris");
		driver.findElement(By.xpath("//div[@id='scroller-container']/div[2]/a")).click();
		String titlePage = driver.getTitle();
		if (titlePage.contains("Paris")) {
			// System.out.println(titlePage);
			driver.findElement(By.className("sort-name")).click();
			driver.findElement(By.xpath("(//div[@class='control-value']/following-sibling::div)[4]")).click();
			driver.findElement(By.xpath("//div[@id='first-filter']/div")).click();
			driver.findElement(By.xpath("//span[text()='Hair']")).click();
			driver.findElement(By.xpath("//span[text()='Hair Care']")).click();
			driver.findElement(By.xpath("//div[@class='control-value']/following-sibling::div")).click();
			driver.findElement(By.xpath("//span[text()='Concern']")).click();
			driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
			List<WebElement> filters = driver.findElements(By.xpath("(//div[@id='filters-listing']//div)[3]//span"));
			for (WebElement eachFilter : filters) {
				String filterApplied = eachFilter.getText();
				// System.out.println("FILTERS:"+filterApplied);
				if (filterApplied.contains("Shampoo")) {
					// System.out.println("Yes");
					driver.findElement(By.xpath("(//div[@id='product-list-wrap']/div)[1]")).click();
				}
			}
			Set<String> windowHandles = driver.getWindowHandles();
			List<String> windowHandlesList = new ArrayList<String>(windowHandles);
			driver.switchTo().window(windowHandlesList.get(1));
			WebElement selectElem = driver.findElement(By.xpath("//select[@title='SIZE']"));
			Select dropDown1 = new Select(selectElem);
			dropDown1.selectByValue("0");
			String mrp = driver.findElement(By.xpath("//span[text()='MRP:']/following-sibling::span")).getText();
			String mrpActual = mrp.replaceAll("[\\D]", " ");
			System.out.println("MRP:" + mrpActual);
			driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
			driver.findElement(By.xpath("(//button)[2]")).click();
			driver.switchTo().frame(0);
			String total = driver.findElement(By.xpath("(//div[@class='value'])[4]")).getText();
			String total1 = total.replaceAll("[\\D]", " ").trim();
			System.out.println("TOTAL:"+total1);
			driver.findElement(By.className("second-col")).click();
			driver.findElement(By.xpath("//button[@class='btn full big']")).click();
			String grandTotal = driver.findElement(By.xpath("(//div[@class='value'])[2]/span")).getText();
			String grandTotal1 = grandTotal.replaceAll("[\\D]", " ").trim();
			System.out.println("GRAND TOTAL:" + grandTotal1);
			if(grandTotal1.equals(total1)) {
				System.out.println("Equal");
				driver.quit();
			}
		}

	}

}
