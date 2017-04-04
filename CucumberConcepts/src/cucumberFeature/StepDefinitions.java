package cucumberFeature;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {

	

	@When("^I click on th adoption link$")
	public void ShouldClickOnAdoption() throws Throwable {
		System.out.println("executed the click on adoption link method");
 
	}

	@Then("^I check to see that no animals are available$")
	public void CheckAnimalStringVisible() throws Throwable {
		System.out.println("check that no animal string was visible or not");

	}

	
	
}
