package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReddifLogin {
	WebDriver driver;
	public ReddifLogin( WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		//test case driver of LoginApplication is passed to RediffLogin. this driver is assigned to local driver
		//local driver behaves as a test case driver. test case driver knows to execute in chrome but local
		//driver doesnot know to execute in chrome. from a test case the driver object is passed. 
	}
	

	By username= By.xpath("//input[@id='login1']");
	By password= By.xpath("//input[@id='password']");
	By signin= By.xpath("//input[@name='proceed']");
	
	public WebElement Emailid()
	{
		return driver.findElement(username);
		
	}
	
	public WebElement Password()
	{
		return driver.findElement(password);
		
	}
	
	public WebElement Signin()
	{
		return driver.findElement(signin);
		
	}
	

}
