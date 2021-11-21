package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	public static void main(String[] args) throws InterruptedException {
		// Set up Driver
		WebDriverManager.chromedriver().setup();

		// Open browser
		ChromeDriver driver = new ChromeDriver();

		// To maximize browser
		driver.manage().window().maximize();

		// To load application URL
		driver.get("http://leaftaps.com/opentaps/");

		// Wait for 2sec after browser gets URL or before printing <h2> text
		Thread.sleep(2000);

		// Read text from WEBELEMENT
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);

		// Getting Username
		WebElement eleUsername = driver.findElement(By.id("username"));
		eleUsername.sendKeys("Demosalesmanager");

		// Getting password
		WebElement elePassword = driver.findElement(By.name("PASSWORD"));
		elePassword.sendKeys("crmsfa");

		// Clicking Login button
		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Leads")).click();

		driver.findElement(By.linkText("Create Lead")).click();

		// TEXT BOXES
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Saranya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Devi");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Saran");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("P");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mrs");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("05/23/1988");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("TestLead");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("1Cr");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("100");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("14562");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("Ticket");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("BLA BLA BLA");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("IMPORTANT NOTE TO CONCENTRATE");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("044");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("123456789");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("0452");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Saran");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("saranpvino@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("http://testleaf.com");
		driver.findElement(By.name("generalToName")).sendKeys("Vinoth");
		driver.findElement(By.name("generalAttnName")).sendKeys("Kumar");
		driver.findElement(By.name("generalAddress1")).sendKeys("TIRUNAGAR");
		driver.findElement(By.name("generalAddress2")).sendKeys("THANAKANKULAM");
		driver.findElement(By.name("generalCity")).sendKeys("MDU");
		driver.findElement(By.name("generalPostalCode")).sendKeys("625");
		driver.findElement(By.name("generalPostalCodeExt")).sendKeys("006");

		// DROP DOWN
		WebElement eleSource = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropdown1 = new Select(eleSource);
		dropdown1.selectByVisibleText("Direct Mail");

		WebElement eleIndustry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dropdown2 = new Select(eleIndustry);
		dropdown2.selectByIndex(7);

		WebElement eleOwnership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dropdown3 = new Select(eleOwnership);
		dropdown3.selectByValue("OWN_PARTNERSHIP");

		WebElement eleMarketingCamp = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		eleMarketingCamp.sendKeys("Affiliated Sites");

		WebElement eleState = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dropdown4 = new Select(eleState);
		dropdown4.selectByValue("AK");
		
		//Get and Print first name
		String firstName = driver.findElement(By.id("createLeadForm_firstName")).getAttribute("value");
		System.out.println(firstName);

		driver.findElement(By.className("smallSubmit")).click();

		//Get and Print Title of page
		String titlePage = driver.getTitle();
		System.out.println(titlePage);
		if (titlePage.contains("View Lead")) {
			System.out.println("I Confirm the title");
		} else {
			System.out.println("The title doesnot have view lead text");
		}

		// selenium 4 only have this minimize browser option
		driver.manage().window().minimize();

		// To close browser
		driver.close();
	}

}
