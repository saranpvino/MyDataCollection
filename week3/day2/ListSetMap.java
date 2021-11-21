package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListSetMap {

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
		Thread.sleep(2000);
		System.out.println("LIST of Train Names..DUPLICATE OCCUR");
		List<WebElement> trainList	=	driver.findElements(By.xpath("(//table[@class='DataTable TrainList TrainListHeader']//tr/td[2]/a)"));
		//LIST Interface
		List<String> obtainedList = new ArrayList<String>(); 
		for (WebElement webElement : trainList) {
			String trainName = webElement.getText();
			//System.out.println(trainName);
			obtainedList.add(trainName);
		}
		System.out.println(obtainedList);
		System.out.println("Size of List1: "+obtainedList.size());
		
		//SET interface to get Erail list unique
		System.out.println("SET of Train Names..DUPLICATE should NOT OCCUR");
		Set<String> obtainedSet = new HashSet<String>();
		for (WebElement webElement : trainList) {
			String trainName = webElement.getText();
			//System.out.println(trainName);
			obtainedSet.add(trainName);
		}
		System.out.println(obtainedSet);
		System.out.println("Size of Set: "+obtainedSet.size());
		
		//From Set to List again
		List<String> obtainedList2 = new ArrayList<String>(); 
		for (String string : obtainedSet) {
			obtainedList2.add(string);
		}
		System.out.println("LIST2: "+obtainedList2);
		System.out.println("Size of List2: "+obtainedList2.size());
		
		//From Set or List to Map
		Map<Integer,String> obtainedMap	=	new HashMap<Integer,String>();
		int count=0;
		for (String string : obtainedSet) {
			obtainedMap.put(count, string);
			count++;
		}
		System.out.println("Map: "+obtainedMap);
		System.out.println("Size of Map: "+obtainedMap.size());
		for (Entry<Integer,String> eachEntry : obtainedMap.entrySet()) {
			  System.out.println("KEY: "+eachEntry.getKey());
			  System.out.println("VALUE: "+eachEntry.getValue());
		}
		System.out.println(obtainedMap.get(2));//Key
		System.out.println(obtainedMap.getOrDefault(21,"SPL"));//get Key 21..if not 21,then return default value SPL
		obtainedMap.remove(19);//Key
		obtainedMap.remove(18,"MS QLN EXPRESS");//key and value
		if(obtainedMap.containsKey(12))
			System.out.println("YES Its there");
		if(!(obtainedMap.containsKey(18))&&!(obtainedMap.containsValue("MS QLN EXPRESS")))
			System.out.println("It has been removed");
		
		System.out.println("Map after removing: "+obtainedMap);
		System.out.println("Size of Map: "+obtainedMap.size());

	}
}
