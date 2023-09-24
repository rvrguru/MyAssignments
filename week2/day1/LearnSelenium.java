package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LearnSelenium {

	public static void main(String[] args) {
		//Launch the browser
		ChromeDriver cdriver = new ChromeDriver();
		//EdgeDriver edriver = new EdgeDriver();
		//GeckoDriver fdriver = new GeckoDriver();
		cdriver.get("http://leaftaps.com/opentaps/control/main");

	}

}
