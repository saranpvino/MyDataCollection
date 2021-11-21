package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailSort {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		boolean selected = driver.findElement(By.id("chkSelectDateOnly")).isSelected();
		//System.out.println(selected);
		if(selected) {
			driver.findElement(By.id("chkSelectDateOnly")).click();
		}
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("Chengalpattu Jn");
		driver.findElement(By.xpath("//div[@title='Chengalpattu Jn']")).click();
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("Madurai Jn");
		driver.findElement(By.xpath("//div[@title='Madurai Jn']")).click();
		System.out.println("List of Train Names");
		List<WebElement> trainList	=	driver.findElements(By.xpath("(//table[@class='DataTable TrainList TrainListHeader']//tr/td[2]/a)"));
		List<String> obtainedList = new ArrayList<String>(); 
		
		for (WebElement webElement : trainList) {
			String trainName = webElement.getText();
			//System.out.println(trainName);
			obtainedList.add(trainName);
		}
		System.out.println("Train Names:"+obtainedList);
		Collections.sort(obtainedList);
		System.out.println("Train Names Sorted:"+obtainedList);
		Collections.reverse(obtainedList);
		System.out.println("Train Names Reverse: "+obtainedList);
	}

}
