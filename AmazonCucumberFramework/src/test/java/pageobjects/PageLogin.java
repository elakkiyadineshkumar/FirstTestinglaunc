package pageobjects;

import org.amazon.com.CommonUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageLogin extends CommonUtils{
	
	//public static WebDriver driver;
	
	public PageLogin() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//*[@id=\"nav-link-accountList-nav-line-1\"]")
	public WebElement mouseoversignin;
	
	@FindBy(xpath="(//span[text()='Sign in'])[1]")
	public WebElement signin;
	
	@FindBy(id="ap_email")
	public WebElement username;
	
	@FindBy(id="continue")
	public WebElement tocontinue;
	
	@FindBy(xpath="//input[@id='ap_password']")
	public WebElement password;
	
	@FindBy(id="signInSubmit")
	public WebElement signinsubmit;
	
	@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")
	public WebElement validation;
	
	
	

	
	

}
