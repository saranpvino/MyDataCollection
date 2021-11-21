package week5.day2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ServiceNowUpdate extends SuperClass {
	
	//@Test(dataProvider="sendData")
	@Test(dependsOnMethods="week5.day2.ServiceNowAdd.serviceNowAdd")
	public void serviceNowUpdate() {
		//'ALL' Link after filter incident
		driver.findElement(By.xpath("//ul[@aria-label='Modules for Application: Incident']/li[6]//a/div/div")).click();
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.xpath("//div[@class='input-group']/input")).sendKeys(incidentNo,Keys.ENTER);
		driver.findElement(By.xpath("(//td[@class='vt'])[1]/a")).click();

		WebElement selElem1 = driver.findElement(By.xpath("//div[@id='element.incident.state']//select"));
		Select dropDown1 = new Select(selElem1);
		dropDown1.selectByValue("2");

		WebElement selElem2 = driver.findElement(By.xpath("//div[@id='element.incident.urgency']//select"));
		Select dropDown2 = new Select(selElem2);
		dropDown2.selectByValue("1");

		driver.findElement(By.xpath("//button[@id='sysverb_update']")).click();

		String status = driver.findElement(By.xpath("(//td[@class='vt'])[6]")).getText();
		if (status.contains("In Progress")) {
			System.out.println("Verified..Status is "+status);
		}
	}
	
	/*
	 * @DataProvider public String[][] sendData() throws IOException{ ReadDataExcel
	 * re = new ReadDataExcel(); String[][] data = re.readDataExcel(); return data;
	 * }
	 */
}