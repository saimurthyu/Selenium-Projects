package Step_Definition;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDefinition {
	 @Given("User is on Home page")
	    public void userOnHomePage() {
	        Comanclass.driver.get("https://opensource-demo.orangehrmlive.com/");
	    }
	 
	    @When("User enters username as {string}")
	    public void entersUsername(String userName) throws InterruptedException {
	        System.out.println("Username Entered");
	        Comanclass.driver.findElement(By.name("txtUsername")).sendKeys(userName);
	    }
	 
	    @When("User enters password as {string}")
	    public void entersPassword(String passWord) throws InterruptedException {
	        System.out.println("Password Entered");
	        Comanclass.driver.findElement(By.name("txtPassword")).sendKeys(passWord);
	        Comanclass.driver.findElement(By.id("btnLogin")).submit();
	    }
	 
	    @Then("User should be able to login sucessfully")
	    public void sucessfulLogin() throws InterruptedException {
	        String newPageText = Comanclass.driver.findElement(By.id("welcome")).getText();
	        System.out.println("newPageText :" + newPageText);
	        //assertThat(newPageText, containsString("Welcome"));
	    }
	 
	    @Then("Error message {string} should be displayed")
	    public void unsucessfulLogin(String message) throws InterruptedException {
	        String errorMessage = Comanclass.driver.findElement(By.id("spanMessage")).getText();
	        System.out.println("Error Message :" + errorMessage);
	        Assert.assertEquals(errorMessage, message);
	    }
}
