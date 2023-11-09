package Step_Definition;

import java.io.File;

import org.testng.Assert;

import Browsers.Browser;
import Coman.ComanLocaters;
import Coman.ComanMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import properties.Datafeatch;

public class BookstoreApplication extends Browser {
	public static Datafeatch df;
	public static ComanMethods cm;
	public  static ComanLocaters cl;
	@When("Click on the BookstoreApplication link.")
	public void click_on_the_BookstoreApplication_link() {
	    // Write code here that turns the phrase above into concrete actions
		File f=new File("C:\\Users\\VamshidharReddyDevir\\eclipse-workspace\\Testngprograms\\AllureInCucumberTestNg\\src\\test\\java\\properties\\Widgets.properties");
	     // browser();
		  df=new Datafeatch(f);
	   //  driver.get(df.data("url"));
	      cm=new ComanMethods();
	      cl=new ComanLocaters();
	      cm.clcik_with_javascript(driver,cl.xpath("//*[text()='Book Store Application']"));
		
	   
	}

	@When("Click on the BookstoreApplication linktwotimes.")
	public void click_on_the_BookstoreApplication_linktwotimes() {
	    // Write code here that turns the phrase above into concrete actions
		 cm.clcik_with_javascript(driver,cl.xpath("//*[text()='Book Store Application']"));
		 cm.clcik_with_javascript(driver,cl.xpath("//*[text()='Book Store Application']"));
	}

	@Then("sublinks will be close")
	public void sublinks_will_be_close() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(cl.mxpath("//div[@class='element-list collapse show']/ul/li").size());
		Assert.assertEquals(cl.mxpath("//div[@class='element-list collapse show']/ul/li").size(),0);
		
	   
	}

}
