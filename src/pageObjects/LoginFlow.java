package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.baseClass.BaseClassSample;


public class LoginFlow extends BaseClassSample {
	
	
	
	public static void main(String[] args) {
		
		launchBrowser("https://www.facebook.com/");
	
	LoginPage l = new LoginPage();
		
	enterText(l.getUsername(),"Prince");
	
	enterText(l.getPassword(),"Hello");
	
	clickEle(l.getLoginBtn());
	}
	
	
	}
