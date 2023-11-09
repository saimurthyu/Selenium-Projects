package Step_Definition;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Browsers.Browser;
import Coman.ComanLocaters;
import Coman.ComanMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import properties.Datafeatch;

public class Slider extends Browser{
	static Datafeatch df;
	static ComanMethods cm;
	static  ComanLocaters cl;
	@Given("navigate to testtoolqa")
	public void navigate_to_testtoolqa() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		File f=new File("C:\\Users\\VamshidharReddyDevir\\eclipse-workspace\\Testngprograms\\AllureInCucumberTestNg\\src\\test\\java\\properties\\Slider.properties");
		  

		 df=new Datafeatch(f);
		 driver.get(df.data("url"));
		 cm=new ComanMethods();
		cl=new ComanLocaters();
	}

	@When("click on slider link")
	public void click_on_slider_link() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		cm.move_to_element(driver,cl.xpath(df.data("widgetslink")));
		cm.clcik_with_javascript(driver,cl.xpath(df.data("widgetslink")));
		cm.clcik_with_javascript(driver, cl.xpath(df.data("Slider")));
	    
	}

	@Then("Verify slider page is open")
	public void verify_slider_page_is_open() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(cl.xpath(df.data("Slider")).getText(),"Slider");
	}

	@When("slider point move to rightside")
	public void slider_point_move_to_rightside() throws InterruptedException, IOException {
	    // Write code here that turns the phrase above into concrete actions
		WebElement slide=cl.id(df.data("sliderContainerid"));
		Thread.sleep(3000);
		cm.Drag_and_drop_with_axis(driver, slide,100, 0);
	}

	@Then("verify slider position is visable")
	public void verify_slider_position_is_visable() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(cl.id(df.data("sliderValueid")).isDisplayed());
	}

	@When("slider point move to left side")
	public void slider_point_move_to_left_side() throws IOException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WebElement slide=cl.id(df.data("sliderContainerid"));
		Thread.sleep(3000);
		cm.Drag_and_drop_with_axis(driver, slide,-100, 0);
	}

	@When("slider point move to rightside and left")
	public void slider_point_move_to_rightside_and_left() throws IOException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WebElement slide=cl.id(df.data("sliderContainerid"));
		Thread.sleep(3000);
		cm.Drag_and_drop_with_axis(driver, slide,-100, 0);
		cm.Drag_and_drop_with_axis(driver, slide,100, 0);
	}

	@Then("slider move to left and right")
	public void slider_move_to_left_and_right() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println( cl.xpath(df.data("Stooltip")).getText());
	}
}
