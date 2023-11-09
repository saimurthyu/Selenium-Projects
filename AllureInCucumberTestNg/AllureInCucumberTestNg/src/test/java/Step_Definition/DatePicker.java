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

public class DatePicker extends Browser {
	File f;
	 Datafeatch df;
	 ComanMethods cm;
	 ComanLocaters cl;
	@Given("I want to navigate to testtool")
	public void i_want_to_navigate_to_testtool() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		try {
			
		
		f=new File("C:\\Users\\VamshidharReddyDevir\\eclipse-workspace\\Testngprograms\\AllureInCucumberTestNg\\src\\test\\java\\properties\\DatePikker.properties");
		 df=new Datafeatch(f);
	     driver.get(df.data("url"));
	     cm=new ComanMethods();
	     cl=new ComanLocaters();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Given("Click on widgets")
	public void click_on_widgets() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		try {
			cm.move_to_element(driver,cl.xpath(df.data("widgetslink")));
		 cm.clcik_with_javascript(driver,cl.xpath(df.data("widgetslink")));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@When("Click on Date picker")
	public void click_on_Date_picker() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		try {
		 cm.clcik_with_javascript(driver,cl.xpath(df.data("Datepicker")));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Then("Verify Date picker page is open")
	public void verify_Date_picker_page_is_open() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		try {
		cl.xpath(df.data("Datepicker")).getText();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@When("Click on Select Date")
	public void click_on_Select_Date() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		try {
		 cm.clcik_with_javascript(driver, cl.id(df.data("MonthYearInput")));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Then("Calaender will be open")
	public void calaender_will_be_open() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("Select month from dropdown box.")
	public void select_month_from_dropdown_box() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		try {
		 cm.selectByvalue(cl.xpath(df.data("Monthselt")),"3");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Then("Month will be select")
	public void month_will_be_select() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("Slelct year from dropdown")
	public void slelct_year_from_dropdown() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		try {
		 cm.selectBytext(cl.xpath(df.data("yearselt")),"2000");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Then("year will be select")
	public void year_will_be_select() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("select date")
	public void select_date() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		try {
		cm.clcik_with_javascript(driver, cl.xpath(df.data("Dateslt")));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Then("date will be select")
	public void date_will_be_select() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("Click on select date and time")
	public void click_on_select_date_and_time() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		try {
		  cm.clcik_with_javascript(driver, cl.id(df.data("dateAndTimePickerInput")));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Then("calender open")
	public void calender_open() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("click on monthbox")
	public void click_on_monthbox() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		try {
		cm.clcik_with_javascript(driver, cl.xpath(df.data("monthbox")));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Then("list of month is display")
	public void list_of_month_is_display() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		try {
		System.out.println(cl.xpath(df.data("monthbox")).getText());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@When("select perticular month")
	public void select_perticular_month() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		try {
		cm.clcik_with_javascript(driver, cl.xpath(df.data("Smonth")));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Then("Selected month will be display")
	public void selected_month_will_be_display() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		try {
		
		System.out.println(cl.xpath(df.data("Smonth")).getText());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@When("click on yearbox")
	public void click_on_yearbox() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		try {
		cm.clcik_with_javascript(driver, cl.xpath(df.data("yearbox")));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Then("Display year box")
	public void display_year_box() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		try {
		System.out.println(cl.xpath(df.data("Myear")));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@When("click on year box")
	public void click_on_year_box() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		try {
		cm.clcik_with_javascript(driver, cl.xpath(df.data("Syear")));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Then("year will be display")
	public void year_will_be_display() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		try {
		System.out.println(cl.xpath(df.data("Syear")).getText());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@When("click on date")
	public void click_on_date() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		try {
		cm.clcik_with_javascript(driver, cl.xpath(df.data("Dateslt")));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Then("selected date will be display")
	public void selected_date_will_be_display() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		try {
		System.out.println(cl.xpath(df.data("Dateslt")).getText());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@When("Click on time")
	public void click_on_time() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		try {
		cm.clcik_with_javascript(driver, cl.xpath(df.data("time")));
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	@Then("selected time will be display")
	public void selected_time_will_be_display() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		try {
	System.out.println(cl.xpath(df.data("time")).getText());
		} catch (Exception e) {
			// TODO: handle exception
		}
		 
	}

}
