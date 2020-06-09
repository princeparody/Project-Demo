package com.baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClassSample {
	
	public static WebDriver driver;
	
	public static void launchBrowser(String url) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\prince\\eclipse-workspace\\Hello World\\driver\\geckodriver.exe");
	    driver = new FirefoxDriver();
		
		driver.get(url);

	}
	
	public static void enterText(WebElement el,String value) {
		el.sendKeys(value);
	}

	public static void clickEle(WebElement el) {
		el.click();
	}
}
