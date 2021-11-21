package week5.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ServiceNowAdd extends SuperClass{

	@Test()
	public void serviceNowAdd() throws InterruptedException, IOException {
		//'ALL' Link after filter incident
		driver.findElement(By.xpath("//ul[@aria-label='Modules for Application: Incident']/li[6]//a/div/div")).click();
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.id("sysverb_new")).click();
		String incidentNum = driver.findElement(By.id("incident.number")).getAttribute("value");
		//System.out.println(incidentNum);
		driver.findElement(By.xpath("(//span[@class='icon icon-search'])[1]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowList	=	new ArrayList<String>(windowHandles);
		driver.switchTo().window(windowList.get(1));
		driver.findElement(By.xpath("//tbody[@class='list2_body']/tr[1]/td[3]/a")).click();
		driver.switchTo().window(windowList.get(0));
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.xpath("//form[@id='incident.do']//input[@aria-label='Short description']")).sendKeys("Hello World");
		driver.findElement(By.xpath("(//button[@name='not_important'])[1]")).click();
		driver.findElement(By.xpath("//div[@class='input-group']/input")).sendKeys(incidentNum,Keys.ENTER);
		String incident = driver.findElement(By.xpath("//a[@class='linked formlink']")).getText();
		if(incidentNum.equals(incident)) {
			WebElement incidentElem = driver.findElement(By.xpath("//a[@class='linked formlink']"));
			File src = incidentElem.getScreenshotAs(OutputType.FILE);
			File dest	=	new File("./snaps/incident.png");
			FileUtils.copyFile(src, dest);
		}
		else {
			System.out.println("Not an Incident");
		}
		//System.out.println(incident);
		//Assigning local variable 'incident' to global variable 'incidentNo'
		incidentNo=incident;
		//System.out.println("global:"+incidentNo);
	}

}
