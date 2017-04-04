package cucumberFeature;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions2 {

	@Given("^I navigate to the zoo website$")
	public void ShouldNavigateToZoo() throws Throwable {
	    System.out.println("executed the navigate to zoo method");
	}


	@When("^I click on the above link$")
	public void ShouldClickOnAbove() throws Throwable {
		System.out.println("executed the lonk to above method");

	}
	
}
