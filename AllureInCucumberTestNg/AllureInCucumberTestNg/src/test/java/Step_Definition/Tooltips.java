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

public class Tooltips extends Browser {
	static Datafeatch df;
	static ComanMethods cm;
	static  ComanLocaters cl;
	@Given("navigate to tooltestqa")
	public void navigate_to_tooltestqa() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		File f=new File("C:\\Users\\VamshidharReddyDevir\\eclipse-workspace\\Testngprograms\\AllureInCucumberTestNg\\src\\test\\java\\properties\\ToolTips.properties");
		  //browser();

		 df=new Datafeatch(f);
		 driver.get(df.data("url"));
		 cm=new ComanMethods();
		cl=new ComanLocaters();
	}

	@Given("click on widgets")
	public void click_on_widgets() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		cm.move_to_element(driver,cl.xpath(df.data("widgetslink")));
		cm.clcik_with_javascript(driver,cl.xpath(df.data("widgetslink")));
	}

	@When("click on tooltip link")
	public void click_on_tooltip_link() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		cm.clcik_with_javascript(driver, cl.xpath(df.data("Tooltips")));
	}

	@Then("verify tool tips page is open")
	public void verify_tool_tips_page_is_open() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(cl.xpath(df.data("Tooltips")).getText(),"Tool Tips");
	}

	@When("click on Hover me to see")
	public void click_on_Hover_me_to_see() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		cm.move_to_element(driver, cl.id(df.data("Hovertosemeid")));
	}

	@Then("Tool tip will be open")
	public void tool_tip_will_be_open() {
	    // Write code here that turns the phrase above into concrete actions
	    try {
	    	assertTrue(cl.xpath(df.data("Hovermetooltip")).isDisplayed());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@When("click on hover me to see text box")
	public void click_on_hover_me_to_see_text_box() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		cm.move_to_element(driver, cl.id(df.data("textfildid")));
	}

	@When("Click on contrary")
	public void click_on_contrary() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		cm.move_to_element(driver, cl.xpath(df.data("contrary")));
	}

}
