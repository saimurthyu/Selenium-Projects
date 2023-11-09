package Step_Definition;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.testng.Assert;

import Browsers.Browser;
import Coman.ComanLocaters;
import Coman.ComanMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import properties.Datafeatch;

public class Progressbar extends Browser {
	File f;
	Datafeatch df;
	ComanMethods cm;
	ComanLocaters cl;
	@Given("Launch demoQA site and click on widgets")
	public void launch_demoQA_site_and_click_on_widgets() throws IOException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		 f=new File("C:\\Users\\VamshidharReddyDevir\\eclipse-workspace\\Testngprograms\\AllureInCucumberTestNg\\src\\test\\java\\properties\\Progressbar.properties");
		  df=new Datafeatch(f);
		  
	     driver.get(df.data("url"));
	      cm=new ComanMethods();
	      cl=new ComanLocaters();
	      Thread.sleep(3000);
	      cm.move_to_element(driver,cl.xpath(df.data("widgetslink")));
	      cm.clcik_with_javascript(driver,cl.xpath(df.data("widgetslink")));
	    
	}

	@When("click on Progress bar")
	public void click_on_Progress_bar() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		cm.clcik_with_javascript(driver, cl.xpath(df.data("progressbar")));
	    
	}

	@Then("user at progress bar page")
	public void user_at_progress_bar_page() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertEquals(cl.xpath(df.data("progressbar")).getText(),"Progress Bar");
	}

	@When("user click on start button")
	public void user_click_on_start_button() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		cm.clcik_with_javascript(driver, cl.id(df.data("startid")));
	    
	}

	@Then("user view the progress of start")
	public void user_view_the_progress_of_start() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(cl.xpath(df.data("stop")).isDisplayed());
		assertTrue(cl.xpath(df.data("stop")).isDisplayed());
	    
	}

	@When("user click on stop button")
	public void user_click_on_stop_button() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
	    cm.clcik_with_javascript(driver,cl.xpath(df.data("stop")));
	}

	@Then("user view the progree to stop")
	public void user_view_the_progree_to_stop() {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(cl.xpath("//*[text()='Start']").isDisplayed());
	}

	@Then("validate progress reached it fully")
	public void validate_progress_reached_it_fully() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(cl.xpath("//*[@role='progressbar']").getText());
	    
	}

	@When("user click on reset button")
	public void user_click_on_reset_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(12000);
		cm.clcik_with_javascript(driver,cl.xpath("//*[text()='Reset']"));
	    
	}

	@Then("validate the Reset is enabeld")
	public void validate_the_Reset_is_enabeld() {
	    // Write code here that turns the phrase above into concrete actions
		try {
		Assert.assertTrue(cl.xpath("//*[text()='Start']").isEnabled());
		}
		catch (Exception e) {
			System.out.println(cl.xpath("//*[@role='progressbar']").getText());
		}
	    
	}

	@Then("validate the start and stop fun works perfect")
	public void validate_the_start_and_stop_fun_works_perfect() {
	    // Write code here that turns the phrase above into concrete actions
		cm.clcik_with_javascript(driver, cl.id("startStopButton"));
		Assert.assertTrue(cl.id("startStopButton").isEnabled());
	    
	}

}
