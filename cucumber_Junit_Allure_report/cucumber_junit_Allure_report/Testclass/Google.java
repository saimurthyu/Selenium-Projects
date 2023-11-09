package cucumberalure;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Google {
	public static WebDriver driver;
	@Given("User is on Home page1")
	public void user_is_on_Home_page1() {
	  driver=CommonDefinitions.driver;
	  driver.get("https://www.google.com/");
	}

	@When("User enters username as \"Admin\"{int}")
	public void user_enters_username_as_Admin(Integer int1) {
	   driver.findElement(By.name("q")).sendKeys("kgf");
	}

	@And("User enters password as \"admin123\"{int}")
	public void user_enters_password_as_admin123(Integer int1) {
	   driver.findElement(By.name("vamshi"));
	}

	@Then("User should be able to login sucessfully34")
	public void user_should_be_able_to_login_sucessfully34() {
	   driver.close();
	}

}
