package StepDefinitions;

import io.cucumber.java.en.*;

public class LoginSteps {
	@Given("User is on Login Page")
	public void user_is_on_login_page() {
		System.out.println("Login");
	}

	@When("User Enters Username and Password")
	public void user_enters_username_and_password() {
		System.out.println("Entering User Name Password");
	}

	@And("Click on Login Button")
	public void click_on_login_button() {
		System.out.println("LoginButton");
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		System.out.println("Home Page");
	}

}
