package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/selectable");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Actions builder	=	new Actions(driver);
		WebElement frame1 = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame1);
		WebElement item1 = driver.findElement(By.xpath("//ol[@id='selectable']/li[1]"));
		WebElement item3 = driver.findElement(By.xpath("//ol[@id='selectable']/li[3]"));
		WebElement item5 = driver.findElement(By.xpath("//ol[@id='selectable']/li[5]"));
		//builder.keyDown(Keys.CONTROL).click(item1).click(item3).click(item5).keyUp(Keys.CONTROL).perform();
		//builder.clickAndHold(item1).moveToElement(item5).release().perform();
		builder.keyDown(Keys.SHIFT).clickAndHold(item1).moveToElement(item5).release().keyUp(Keys.SHIFT).perform();
		driver.switchTo().defaultContent();
	}

}
