package Step_Definition;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Browsers.Browser;
import Coman.ComanLocaters;
import Coman.ComanMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import properties.Datafeatch;

public class Widgets extends Browser {
	public  Datafeatch df;
	public  ComanMethods cm;
	public   ComanLocaters cl;
	@Given("I want to navigate to the testqatool")
	public void i_want_to_navigate_to_the_testqatool() throws IOException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		File f=new File("C:\\Users\\VamshidharReddyDevir\\eclipse-workspace\\Testngprograms\\AllureInCucumberTestNg\\src\\test\\java\\properties\\Widgets.properties");
	     // browser();
		  df=new Datafeatch(f);
		  Thread.sleep(2000);
	     driver.get(df.data("url"));
	     System.out.println(df.data("url"));
	      cm=new ComanMethods();
	      cl=new ComanLocaters();
	}

	@When("Click on the Widgets link.")
	public void click_on_the_Widgets_link() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		cm.move_to_element(driver,cl.xpath(df.data("widgetslink")));
		 cm.clcik_with_javascript(driver,cl.xpath(df.data("widgetslink")));
	}

	@Then("Sublinks will be open.")
	public void sublinks_will_be_open() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		 List<WebElement> el=cl.mxpath(df.data("Sublinksofwidgets"));
	     //find number of elements is find.
	     System.out.println(el.size());
	}

	@When("Click on the Widgets linktwotimes.")
	public void click_on_the_Widgets_linktwotimes() throws IOException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		try {
			
		
		for(int i=0;i<=1;i++) {
			Thread.sleep(3000);
			cm.clcik_with_javascript(driver,cl.xpath(df.data("widgetslink")));
		}
		} catch (Exception e) {
		Assert.assertEquals(cl.xpath(df.data("widgetslink")).isDisplayed(), true);
		}
	}

	@Then("sublinks will be close.")
	public void sublinks_will_be_close() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		 List<WebElement> el=cl.mxpath(df.data("Sublinksofwidgets"));
	     //find number of elements is find.
	     System.out.println(el.size());
	}

	@When("Open one sub link")
	public void open_one_sub_link() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		cm.clcik_with_javascript(driver,cl.xpath(df.data("Sublinksofwidgets")));
	}

	@When("Click on the interactions")
	public void click_on_the_interactions() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		cm.clcik_with_javascript(driver, cl.xpath(df.data("interactions")));
	}

	

}
