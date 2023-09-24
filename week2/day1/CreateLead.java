package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {

		// Launch the browser
		ChromeDriver driver = new ChromeDriver();

		// Load the URL
		driver.get("http://leaftaps.com/opentaps/control/login");

		// Maximize the browser window
		driver.manage().window().maximize();

		// to locate the user name
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");

		// to locate the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// to locate the login button
		driver.findElement(By.className("decorativeSubmit")).click();

		// to click on the link with text
		driver.findElement(By.linkText("CRM/SFA")).click();

		// to click on Leads tab
		driver.findElement(By.linkText("Leads")).click();

		// to click on Create Lead
		driver.findElement(By.linkText("Create Lead")).click();

		// to enter company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Companyname");

		// to enter the first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Test Firstname");

		// to enter the last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Test Lastname");

		// to select the value for Source from the drop down

		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sourcedd = new Select(source);
		sourcedd.selectByValue("LEAD_EMPLOYEE");

		// to select Marketing Campaign value from drop down
		WebElement marketcamp = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select marketcampdd = new Select(marketcamp);
		marketcampdd.selectByVisibleText("Demo Marketing Campaign");

		// to select the value for Ownership drop down

		WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ownershipdd = new Select(ownership);
		ownershipdd.selectByIndex(4);
		
		//to get the page title
				String title =driver.getTitle();
				System.out.println(title);

		//to click on Create Lead Button
		driver.findElement(By.name("submitButton")).click();
		driver.close();
			
	}

}
