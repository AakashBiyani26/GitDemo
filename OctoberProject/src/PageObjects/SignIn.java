package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import zohosite.PageClass;

public class SignIn  {
	
	public WebDriver driver;
	public SignIn(WebDriver driver) {
		
		this.driver=driver;
		
	}

	
	 
	By Login = By.xpath("//a[@class='zh-login']");
	By loginemail= By.xpath("//input[@id='login_id']");
	
	
	
	public WebElement Loginwithemail () {
		
		return driver.findElement(loginemail);
	}
	 
public WebElement Loginzoho() {
		
		return driver.findElement(Login);
		
	}

}
