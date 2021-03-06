package stepDefinations;
import java.util.List;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import junit.framework.Assert;

import static org.testng.Assert.assertTrue;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Newproject.Automationexercise.Base;
import PageObjects.Homepage;

@RunWith(Cucumber.class)
public class MyStepDefinitions {
	public WebDriver driver;

    @Given("^User is on Greenkart landing page$")
    public void user_is_on_greenkart_landing_page() throws Throwable {
    	driver = Base.getDriver();
		
    }
    
    
    	
    @When("^User searched for \"([^\"]*)\" vegetable$")
    public void user_searched_for_something_vegetable(String strArg1) throws Throwable {
    	Homepage h = new Homepage(driver);
    	h.getsearch().sendKeys(strArg1);
    
    }
    
    @And("^Added items to cart$")
    public void added_items_to_cart() throws Throwable {
        driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
    }
    
    @And("^users proceed to checkout page for purchase$")
    public void users_proceed_to_checkout_page_for_purchase() throws Throwable {
        driver.findElement(By.xpath("//a[@class='cart-icon']/img")).click();
        driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
    }
    
    @Then("^verify selected \"([^\"]*)\" items are displayed in checkout page$")
    public void verify_selected_something_items_are_displayed_in_checkout_page(String strArg1) throws Throwable {
        System.out.println(driver.findElement(By.xpath("//p[text()='Brinjal - 1 Kg']")).getText());
    }
        		

    
        		
    

    @Then("^\"([^\"]*)\" results are displayed$")
    public void something_results_are_displayed(String strArg1) throws Throwable {
    	Assert.assertTrue(driver.findElement(By.xpath("//h4[text()='Cucumber - 1 Kg']")).getText().contains(strArg1));
        
    }

}


	


