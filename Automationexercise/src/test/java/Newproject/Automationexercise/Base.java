package Newproject.Automationexercise;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public static WebDriver driver;
	public static Properties prop;
	public static WebDriver getDriver() throws IOException
	{
		Properties prop= new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Automationexercise\\src\\test\\java\\Newproject\\Automationexercise\\global.properties");
		prop.load(fis);
		
		
		System.setProperty("webdriver.chrome.driver","C:\\workaakashoct\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get(prop.getProperty("url"));
		return driver;
		
	}

}
