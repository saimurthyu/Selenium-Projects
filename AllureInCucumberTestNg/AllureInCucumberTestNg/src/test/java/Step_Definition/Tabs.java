package Step_Definition;

import static org.testng.Assert.assertFalse;
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

public class Tabs extends Browser{
	static Datafeatch df;
	static ComanMethods cm;
	static  ComanLocaters cl;
	@Given("I want to navigate to testtoolqa")
	public void i_want_to_navigate_to_testtoolqa() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		File f=new File("C:\\Users\\VamshidharReddyDevir\\eclipse-workspace\\Testngprograms\\AllureInCucumberTestNg\\src\\test\\java\\properties\\Tabs.properties");
		 df=new Datafeatch(f);
		 driver.get(df.data("url"));
		 cm=new ComanMethods();
		cl=new ComanLocaters();
	}

	@Given("I want click on widgets")
	public void i_want_click_on_widgets() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		cm.move_to_element(driver,cl.xpath(df.data("widgetslink")));
		cm.clcik_with_javascript(driver,cl.xpath(df.data("widgetslink")));
	}

	@When("Click on tabs link")
	public void click_on_tabs_link() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		cm.clcik_with_javascript(driver, cl.xpath(df.data("Tabs")));
	}

	@Then("verify tabs page is open")
	public void verify_tabs_page_is_open() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(cl.xpath(df.data("Tabs")).getText(),"Tabs");
	}

	@When("click on whats")
	public void click_on_whats() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		cm.clcik_with_javascript(driver, cl.xpath(df.data("What")));
	}

	@Then("verify whats tabs page is open")
	public void verify_whats_tabs_page_is_open() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(cl.xpath(df.data("Whattab")).isDisplayed());
	}

	@When("click on Origin")
	public void click_on_Origin() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		cm.clcik_with_javascript(driver, cl.xpath(df.data("Orgin")));
	}

	@Then("Verify origin page tab is open")
	public void verify_origin_page_tab_is_open() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(cl.xpath(df.data("Origintab")).isDisplayed());
	}

	@When("click on use")
	public void click_on_use() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		cm.clcik_with_javascript(driver, cl.xpath(df.data("Use")));
	}

	@Then("Verify use page will be open")
	public void verify_use_page_will_be_open() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(cl.xpath(df.data("usetab")).isDisplayed());
	}

	@When("click on more")
	public void click_on_more() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		cm.clcik_with_javascript(driver, cl.xpath(df.data("More")));
	}

	@Then("Origin page will be close")
	public void origin_page_will_be_close() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		assertFalse(cl.xpath(df.data("Origintab")).isDisplayed());
	}

}
