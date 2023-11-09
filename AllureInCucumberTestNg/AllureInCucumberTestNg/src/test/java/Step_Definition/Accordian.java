package Step_Definition;

import java.io.File;
import java.io.IOException;

import Browsers.Browser;
import Coman.ComanLocaters;
import Coman.ComanMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import properties.Datafeatch;

public class Accordian extends Browser {
	File f;
	Datafeatch df;
	ComanMethods cm;
	ComanLocaters cl;
	@Given("I want navigate to url")
	public void i_want_navigate_to_url() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		 f=new File("C:\\Users\\VamshidharReddyDevir\\eclipse-workspace\\Testngprograms\\AllureInCucumberTestNg\\src\\test\\java\\properties\\Accordian.properties");
		  df=new Datafeatch(f);
	     driver.get(df.data("url"));
	      cm=new ComanMethods();
	      cl=new ComanLocaters();	    
	}

	@When("I click on Accordian")
	public void i_click_on_Accordian() throws IOException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		cm.move_to_element(driver,cl.xpath(df.data("widgetslink")));
		  cm.clcik_with_javascript(driver,cl.xpath(df.data("widgetslink")));
		     cm.clcik_with_javascript(driver, cl.xpath(df.data("Accordian")));
	    
	}

	@Then("accordian page is display or not")
	public void accordian_page_is_display_or_not() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(cl.xpath(df.data("Accordian")).getText());
	    
	}

	@When("user click one question")
	public void user_click_one_question() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		cm.clcik_with_javascript(driver, cl.id(df.data("section1Heading")));
	    
	}

	@Then("Answer page will be open")
	public void answer_page_will_be_open() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		 cm.clcik_with_javascript(driver, cl.id(df.data("section2Heading")));
	    
	}

	@When("accordian link click two times")
	public void accordian_link_click_two_times() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		 cm.clcik_with_javascript(driver, cl.xpath(df.data("Accordian")));
	    
	}

	@Then("accordian will not be close.")
	public void accordian_will_not_be_close() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		cm.clcik_with_javascript(driver, cl.id(df.data("section1Heading")));
	    
	}

	@When("question link click two times")
	public void question_link_click_two_times() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		 cm.clcik_with_javascript(driver, cl.id(df.data("section2Heading")));
		 cm.clcik_with_javascript(driver, cl.id(df.data("section2Heading")));
	    
	}

	@Then("question will not be close.")
	public void question_will_not_be_close() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		 cm.clcik_with_javascript(driver, cl.id(df.data("section2Heading")));
	    
	}

	@When("question link click")
	public void question_link_click() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		 cm.clcik_with_javascript(driver, cl.id(df.data("section2Heading")));
	}

	@When("click on whyde we use it")
	public void click_on_whyde_we_use_it() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(df.data("section2Heading"));
	}

}
