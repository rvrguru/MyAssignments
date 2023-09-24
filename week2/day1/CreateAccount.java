package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

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

		// to click on Accounts Tab
		driver.findElement(By.linkText("Accounts")).click();

		// to click on Create Accounts
		driver.findElement(By.linkText("Create Account")).click();

		// to locate the Account name and enter the value
		driver.findElement(By.id("accountName")).sendKeys("IBM Incorp");

		// to enter the description
		driver.findElement(By.name("description")).sendKeys("IBM Incorp Desc");

		// to select the value for Industry drop down

		WebElement industry = driver.findElement(By.name("industryEnumId"));
		Select industrydd = new Select(industry);
		industrydd.selectByVisibleText("Computer Software");

		// to select the value for Ownership drop down

		WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		Select ownershipdd = new Select(ownership);
		ownershipdd.selectByIndex(4);

		// to select the value for Source drop down

		WebElement source = driver.findElement(By.id("dataSourceId"));
		Select sourcedd = new Select(source);
		sourcedd.selectByValue("LEAD_EMPLOYEE");

		// to select the value for Coutnry drop down

		WebElement country = driver.findElement(By.id("generalCountryGeoId"));
		Select countrydd = new Select(country);
		countrydd.selectByVisibleText("India");

		// To select the value for State/Province

		WebElement stateprovince = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select stateprovincedd = new Select(stateprovince);
		stateprovincedd.selectByValue("IN-TN");
		
		//to get the page title
		String title =driver.getTitle();
		System.out.println(title);
		
		// to click on CreateAccount Button
		driver.findElement(By.className("smallSubmit")).click();
		
		driver.close();

	}

}
