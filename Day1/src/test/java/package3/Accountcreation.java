package package3;

import java.util.List;
import java.util.Map;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Accountcreation 
{
	@Given("I want to create an account")
	public void i_want_to_create_an_account() 
	{
	 System.out.println("Account creation");   
	}

	@When("I enter my data")
	public void i_enter_my_data(io.cucumber.datatable.DataTable dataTable) 
	{
	List<Map<String,String>>list=dataTable.asMaps(String.class,String.class);
	for(int i=0;i<list.size();i++)
	{
		
		System.out.println(list.get(i).get("username"));
		System.out.println(list.get(i).get("password"));
	}
	}

	@Then("I verify the account")
	public void i_verify_the_account() 
	{
		System.out.println("verifying");    
	}
}
