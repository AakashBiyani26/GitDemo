package stepDefinations;

import Newproject.Automationexercise.Base;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Base {
	
	@Before("@MobileTest")
	public void beforeValidation()
	{
		System.out.println("Mobile before hook");
		
		
	}
	
	@After("@MobileTest")
	public void AfterValidation()
	{
		System.out.println("Mobile after hook");
	}
	
	@After("@SeleniumTestOct")
	public void AfterTest()
	{
		driver.close();
	}
	

}
