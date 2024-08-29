package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Registerstepdefinitions {

	@Given("User is on the homepage")
	public void user_is_on_the_homepage() {
	    System.out.println("User is on the homepage");
	}

	@When("User click on signup")
	public void user_click_on_signup() {
		System.out.println("User click on signup");
	}

	@When("User enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("User enters username and password");
	}

	@Then("User click on signup button")
	public void user_click_on_signup_button() {
		System.out.println("User click on signup button");
	}



}
