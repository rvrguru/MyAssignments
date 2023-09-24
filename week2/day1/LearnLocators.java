package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {

	public static void main(String[] args) {
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		// Load the URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		// Maximize the browser window
		driver.manage().window().maximize();
		
		//to locate the user name
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		//to locate the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//to locate the login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//to click on the link with text 
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//to click on Leads tab
		driver.findElement(By.linkText("Leads")).click();
		
		//to verify the tile of the landing page
		String title =driver.getTitle();
		System.out.println(title);
		//to click on logout
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
		
	}

}
