package stepdefinitions;

import org.amazon.com.CommonUtils;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageobjects.PageLogin;

public class StepDefinitions extends CommonUtils {
	
	public WebDriver driver;
	public PageLogin pg;
	
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		CommonUtils cu=new CommonUtils();
		cu.browserLaunch("Chrome");
		
	}

	@When("User opens URL {string}")
	public void user_opens_url(String string) {
		CommonUtils cu=new CommonUtils();
		cu.loadurl(string);
		pg=new PageLogin();
	    
	}

	@Then("Enter username {string} {string} and password")
	public void enter_username_and_password(String string, String string2) {
		CommonUtils cu=new CommonUtils();
		pg.mouseoversignin.click();
		cu.typevalue(pg.username, string);
		pg.tocontinue.click();
		cu.typevalue(pg.password, string2);
			
	   }

	@Then("click on login")
	public void click_on_login() {
		//PageLogin pg=new PageLogin();
		pg.signinsubmit.click();
	}
	
	@Then("validate the username {string} is displayed on homepage or not")
	public void validate_the_username_is_displayed_on_homepage_or_not(String expectedstring) {
	String str1=pg.validation.getText();
	String actualstring=str1.substring(str1.indexOf(" ")+1);
	System.out.println(actualstring);
	Assert.assertEquals(expectedstring, actualstring);
	
	}
	
	@Then("close browser")
	public void closeBrowser() {
		CommonUtils cu=new CommonUtils();
		cu.browserclose();
	}

}
