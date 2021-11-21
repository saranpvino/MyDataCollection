package week5.day2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ServiceNowAssign extends SuperClass {
	//@Test(dataProvider="sendData")
	 						//packagename.classname.methodname
	@Test(dependsOnMethods={"week5.day2.ServiceNowAdd.serviceNowAdd","week5.day2.ServiceNowUpdate.serviceNowUpdate"})
	public void serviceNowAssign() throws InterruptedException {
		//'Open' Link after filter incident
		driver.findElement(By.xpath("//ul[@aria-label='Modules for Application: Incident']/li[3]//a/div/div")).click();
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.xpath("//div[@class='input-group']/input")).sendKeys(incidentNo, Keys.ENTER);
		driver.findElement(By.xpath("(//td[@class='vt'])[1]/a")).click();
		driver.findElement(By.xpath("(//span[@class='icon icon-search'])[5]")).click();

		// Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowList = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windowList.get(1));
		driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys("Software", Keys.ENTER);
		driver.findElement(By.xpath("(//input[@placeholder='Search'])[2]")).sendKeys("Software", Keys.ENTER);
		driver.findElement(By.xpath("(//tr[@class='list_row list_odd']/td[3]/a)[1]")).click();
		Thread.sleep(2000);
		driver.switchTo().window(windowList.get(0));
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.xpath("//textarea[@id='activity-stream-textarea']")).sendKeys("Hiiii");
		driver.findElement(By.xpath("//button[@id='sysverb_update']")).click();
		String assignGroup = driver.findElement(By.xpath("(//td[@class='vt'])[8]")).getText();
		if (assignGroup.contains("Software")) {
			System.out.println("Verified..Group is " + assignGroup);
		}
	}
	/*
	 * @DataProvider public String[][] sendData() throws IOException{ ReadDataExcel
	 * re = new ReadDataExcel(); String[][] data = re.readDataExcel(); return data;
	 * }
	 */
}
