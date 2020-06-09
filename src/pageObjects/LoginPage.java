package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.baseClass.BaseClassSample;

public class LoginPage extends BaseClassSample {
	
	public LoginPage() {
		
		PageFactory.initElements(driver,this);
	}
	@CacheLookup
		@FindBy(id="email")
    public WebElement username;
	@FindBy(id="pass")
	public WebElement password;
    @FindBy(xpath="//[@value= 'Log In']")
	public WebElement loginBtn;

	public WebElement getUsername() {
		return username;
	}
	
	public WebElement getPassword() {
		return password;
	}
	
	public WebElement getLoginBtn() {
		return loginBtn;
	}

}

