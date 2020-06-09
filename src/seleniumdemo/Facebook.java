package seleniumdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {
	
	public void launchBrowser() {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\prince\\eclipse-workspace\\Hello World\\driver\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	
	driver.get("https://www.facebook.com/");
	}
	
	public static void main(String[] args) {
		
		Facebook f = new Facebook();
		
		f.launchBrowser();
	}

		
	
	}

