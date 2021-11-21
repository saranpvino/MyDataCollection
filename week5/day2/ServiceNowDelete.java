package week5.day2;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ServiceNowDelete extends SuperClass {
	//@Test(dataProvider="sendData")
	@Test(dependsOnMethods="week5.day2.ServiceNowAdd.serviceNowAdd")
	public void serviceNowDelete() {
		// 'ALL' Link after filter incident
		driver.findElement(By.xpath("//ul[@aria-label='Modules for Application: Incident']/li[6]//a/div/div")).click();
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.xpath("//div[@class='input-group']/input")).sendKeys(incidentNo, Keys.ENTER);
		driver.findElement(By.xpath("(//td[@class='vt'])[1]/a")).click();
		
		driver.findElement(By.xpath("//button[@id='sysverb_delete']")).click();
		//Alert alert = driver.switchTo().alert();
		//alert.accept();
		
		driver.findElement(By.xpath("//button[@id='ok_button']")).click();
		
		String text = driver.findElement(By.xpath("//tr[@class='list2_no_records']/td")).getText();
		System.out.println(text);
	}
	/*
	 * @DataProvider public String[][] sendData() throws IOException{ ReadDataExcel
	 * re = new ReadDataExcel(); String[][] data = re.readDataExcel(); return data;
	 * }
	 */
}
