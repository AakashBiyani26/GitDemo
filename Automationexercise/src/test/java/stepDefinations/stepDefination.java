package stepDefinations;



import java.util.List;

import org.junit.runner.RunWith;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
public class stepDefination {
	
	@Given("^validate browser$")
    public void validate_browser() throws Throwable {
		System.out.println("Browser is validated");
        
    }

    @When("^Browser is triggered$")
    public void browser_is_triggered() throws Throwable {
    	System.out.println("Browser is triggered");
        
    }

    @Then("^check if browser is started$")
    public void check_if_browser_is_started() throws Throwable {
    	System.out.println("Browser is started");
        
    }

	

	@Given("^User is on landing page$")
	public void user_is_on_landing_page() {
		System.out.println("Navigated to landing page");
		
	}
	
	
	@When("^User login to application with (.+) and password (.+)$")
    public void user_login_to_application_with_and_password(String username, String password) throws Throwable {
		System.out.println(username) ;
		 System.out.println(password) ;
    }
	
	 @When("^User login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
	    public void user_login_into_application_with_something_and_password_something(String strArg1, String strArg2) throws Throwable {
		 System.out.println(strArg1) ;
		 System.out.println(strArg2) ;
	    }
	
	 @When("^User signup with following details$")
	 public void user_signup_with_following_details(DataTable data) throws Throwable {
		List<List<String>> obj = data.raw();
		System.out.println(obj.get(0).get(0));
		System.out.println(obj.get(0).get(1));
		System.out.println(obj.get(0).get(2));
		System.out.println(obj.get(0).get(3));
		
		
		
        
    }
        
	
	@Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
        
    }

    @And("^cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are_something(String Arg1) throws Throwable {
    	System.out.println(Arg1) ;
    }

		
		
	   
	}
	
	

	