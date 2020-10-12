package ObjectRepository;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

	public class ReddifHome {
		WebDriver driver;
		public ReddifHome( WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver=driver;
			//test case driver of LoginApplication is passed to RediffLogin. this driver is assigned to local driver
			//local driver behaves as a test case driver. test case driver knows to execute in chrome but local
			//driver doesnot know to execute in chrome. from a test case the driver object is passed. 
		}
		
		By ClickHomepage = By.xpath("//a[text()='rediff.com']");
		By searchinput= By.xpath("//form[@class='formgetquote']/input[1]");
		By search= By.xpath("//input[@class='getqbtn']");
		
		
		public WebElement ClickHomePage()
		{
			return driver.findElement(ClickHomepage);
			
		}
		
		public WebElement SearchInput()
		{
			return driver.findElement(searchinput);
		}
        
		public WebElement Search()
		{
			return driver.findElement(search);
		}
        

}
