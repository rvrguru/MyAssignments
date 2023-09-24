package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver cdriver = new ChromeDriver();
		cdriver.get("https://www.facebook.com/");
		cdriver.manage().window().maximize();
		cdriver.close();
	}

}
