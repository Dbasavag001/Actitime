package rough;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test001 {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	
	@Test
	public void cust() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.close();
	}

}
