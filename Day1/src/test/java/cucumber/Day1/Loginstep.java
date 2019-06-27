package cucumber.Day1;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Loginstep {
	@Given("User enters username")
	public void user_enters_username() {
		System.out.println("user entered username");
	    
	}

	@And("User enters password")
	public void user_enters_password() {
		
		System.out.println("user entered password");
	}

	@When("Click on login button")
	public void click_on_login_button() {
		System.out.println("user entered login button");
	}

	@Then("Home page is displayed")
	public void home_page_is_displayed() {
		System.out.println("user on homepage");
	}
}
