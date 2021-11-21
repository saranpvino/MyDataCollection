package week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundDropDown {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement eleSelect1 = driver.findElement(By.id("dropdown1"));
		Select dropDown1=new Select(eleSelect1);
		dropDown1.selectByIndex(2);
		
		WebElement eleSelect2 = driver.findElement(By.name("dropdown2"));
		Select dropDown2=new Select(eleSelect2);
		dropDown2.selectByVisibleText("Loadrunner");
		
		WebElement eleSelect3 = driver.findElement(By.id("dropdown3"));
		Select dropDown3=new Select(eleSelect3);
		dropDown3.selectByValue("3");
		
		 WebElement eleSelect4 = driver.findElement(By.xpath("(//div[@class='example']/select)[4]"));
		 Select dropDown4=new Select(eleSelect4);
		 List<WebElement> options = dropDown4.getOptions();
		 int size = options.size();
		 System.out.println(size);
		 
		 driver.findElement(By.xpath("(//div[@class='example']/select)[5]")).sendKeys("Selenium");
		 
		 WebElement eleSelect6 = driver.findElement(By.xpath("(//div[@class='example']/select)[6]"));
		 Select dropDown6=new Select(eleSelect6);
		 dropDown6.selectByVisibleText("Selenium");
		 dropDown6.selectByVisibleText("UFT/QTP");
		 dropDown6.selectByVisibleText("Appium");
		 dropDown6.deselectByVisibleText("Selenium");
	}

}
