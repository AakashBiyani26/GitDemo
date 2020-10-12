import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class octpr {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\workaakashoct\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Brinjal");
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		String txt =driver.findElement(By.xpath("//div[@class='cart-info']/table/tbody/tr[2]/td[3]")).getText();
		if (txt=="35") {
		     System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		
			
			
		}

	}
}

