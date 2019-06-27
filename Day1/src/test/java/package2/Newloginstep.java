package package2;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Newloginstep 
{
	@Given("User enter{string}")
	public void user_enter(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println(string);
	}

	@When("User give {string}")
	public void user_give(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println(string);
	}

	@When("user click on login")
	public void user_click_on_login() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("user click on login button");
	}

	@Then("user is on home page")
	public void user_is_on_home_page() {
		System.out.println("user on homepage");
	}
	
	@Given("I want to enter user name {string}")
	public void i_want_to_enter_user_name(String string) {
		System.out.println(string);
	}

	@When("I want to enter {string}")
	public void i_want_to_enter(String string) {
		System.out.println(string);
	}

	@Then("the page is displayed")
	public void the_page_is_displayed() {
		System.out.println("page displayed");
	    
	}

}
