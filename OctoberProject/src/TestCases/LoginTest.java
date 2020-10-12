package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.HomePage;
import PageObjects.SignIn;
import zohosite.PageClass;

public class LoginTest {

	 
	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		


		System.setProperty("webdriver.chrome.driver","C:\\workaakashoct\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(); //driver in this line is already initalized
		driver.get("https://www.zoho.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	SignIn sign = new SignIn(driver); //this driver will asm parameter is now going to hold the value as in
		//line 13 driver
	
	sign.Loginzoho().click();
	sign.Loginwithemail().sendKeys("ak@gmail.com");
	    
		
		//SignIn signin = new SignIn();
		//signin.Loginwithemail().sendKeys("ak@gmail.com");
		
		
		
		
		
		
		
		
	

	}

}
