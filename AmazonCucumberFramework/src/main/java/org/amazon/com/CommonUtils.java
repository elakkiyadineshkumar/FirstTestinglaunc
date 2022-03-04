package org.amazon.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonUtils{
	
	public static WebDriver driver;
	
		public void browserLaunch(String browsername) {
			
		switch(browsername){
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		case "Firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
		case "Edge":
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;

		}
	}

	public  void maximize() {
		driver.manage().window().maximize(); 
	}

	public  void click(WebElement w) {
		w.click(); 
	}

	public  void loadurl(String url) {
		driver.get(url);
	}

	public  void browserclose() {
		driver.close();
	}
	public void typevalue(WebElement ele,String value) {
		CommonUtils cu=new CommonUtils();
		cu.eWaits(ele, 10).sendKeys(value);

	}
	public void selectbyindex(WebElement w, int a) {
		Select s = new Select(w);
		s.selectByIndex(a);

	}
	public void selectbyvalue(WebElement w,String value) {
		Select s=new Select(w);
		s.selectByValue(value);	
	}
	public  void selectbyvisibletext(WebElement w,String vtext) {
		CommonUtils cu=new CommonUtils();
		Select s=new Select(cu.eWaits(w, 10));
		s.selectByVisibleText(vtext);

	}	
	public WebElement eWaits(WebElement e,int a) {
		WebDriverWait wait=new WebDriverWait(driver,a);
		return wait.until(ExpectedConditions.visibilityOf(e));
		
}
	public void moveToElement(WebElement e) {
		Actions ac=new Actions(driver);
		ac.moveToElement(e);
	}
	
}
