package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import zohosite.PageClass;

public class HomePage  {
	


	public WebDriver driver;
	public Homepage(WebDriver driver) {
		
		this.driver=driver;
		
	}

	
	

	
	public void Gotosignup() {
		
		driver.findElement(By.xpath("//a[@class='zh-signup']")).click();
	}
	
   
	public void Gotosupport() {
		
		driver.findElement(By.xpath("//a[@class='zh-support']")).click();
	}
	
	public void Zohoedu() {
		
	}
	
	public void ValidateFooterLinks() {
		
	}



}



