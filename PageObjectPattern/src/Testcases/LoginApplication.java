package Testcases;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepository.ReddifHome;
import ObjectRepository.ReddifLogin;
public class LoginApplication {
	@Test
	public void Login()
	{
		System.setProperty("webdriver.chrome.driver","C:\\workaakashoct\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		//ReddifLogin rd= new ReddifLogin(driver);
		//rd.Emailid().sendKeys("Hello");
		//rd.Password().sendKeys("aakash");
		//rd.Signin().click();
		driver.get("https://www.rediff.com/");
		ReddifHome rh= new ReddifHome(driver);
		
		rh.SearchInput().sendKeys("aakash");
		rh.Search().click();
		
	}

}
