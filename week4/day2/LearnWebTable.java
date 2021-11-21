package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebTable {

	public static void main(String[] args) {
		// Set up Driver
		WebDriverManager.chromedriver().setup();

		// Open browser
		ChromeDriver driver = new ChromeDriver();

		// To maximize browser
		driver.manage().window().maximize();
		
		//Implicitly wait for 30sec for every selenium command
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// To load application URL
		driver.get("http://leafground.com/pages/table.html");
		
		//Finding table
		WebElement webTable = driver.findElement(By.id("table_id"));
		
		//Getting all rows
		List<WebElement> tableRows = webTable.findElements(By.tagName("tr"));
		System.out.println("Size of Row: "+tableRows.size());//size of Row
		
		//Get Column Size
		WebElement firstRow = tableRows.get(0);//Getting First <tr>
		List<WebElement> tableCols = firstRow.findElements(By.tagName("th"));
		//Inside first <tr>,there are 6 <th>
		System.out.println("Size of Column: "+tableCols.size());//size of column
		
		System.out.println("All CONTENT FROM TABLE");
		//Print all datas in table
		for (WebElement eachRowData : tableRows) {
			System.out.println(eachRowData.getText());
		}
		
		System.out.println("SECOND COLUMN DATA FROM ALL ROWS");
		//Print Column 2 alone(avoiding <th> so using i=1)
		for (int i = 1; i < tableRows.size(); i++) {
			WebElement row = tableRows.get(i);
			List<WebElement> col = row.findElements(By.tagName("td"));
			String col2Data = col.get(1).getText();
			System.out.println(col2Data);
		}
		
		
	}

}
