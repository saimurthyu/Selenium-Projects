package cucumberalure;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class test {
	@Given("User is on Home page")
	public void user_is_on_Home_page() {
	   System.out.println("givreen is print");
	}

	@When("User enters username as {string}")
	public void user_enters_username_as(String string) {
		System.out.println(string+" when vamshi2");
	}

	@And("User enters password as {string}")
	public void user_enters_password_as(String string) {
		System.out.println(string+" when and vamshi2");
	}

	@Then("User should be able to login sucessfully")
	public void user_should_be_able_to_login_sucessfully() {
		System.out.println(" then vamshi1");
	}

	@And("Error message {string} should be displayed")
	public void error_message_should_be_displayed(String string) {
	   System.out.println(string+" then vamshi2");
	}

}
