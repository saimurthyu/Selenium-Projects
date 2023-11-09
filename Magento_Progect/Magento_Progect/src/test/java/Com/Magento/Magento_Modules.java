package Com.Magento;

import org.testng.annotations.Test;

import com.Utilites.Datafeatch;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.Reporter;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.Listeners;
import io.qameta.allure.Description;

@Listeners(com.Common_Methods.Listnersclass.class)
public class Magento_Modules extends MagentoBase_Class {
	@Description("Verifying the Shift address")
	@Test(priority = 8, groups = "smoke")
	public void Shift_addreas() throws InterruptedException, IOException {
		cm.Sent_txt_box(driver, cl.name(Datafeatch.main("search")), exldata.data(0, 0));
		cl.name("q").sendKeys(Keys.ENTER);
		// select perticular product
		cm.clcik_with_javascript(driver, cl.xpath(Datafeatch.main("2ndproduct")));

		// filter size
		cm.clcik_with_javascript(driver, cl.xpath(Datafeatch.main("size")));

		// filter color
		cm.clcik_with_javascript(driver, cl.xpath(Datafeatch.main("color")));

		// click on add to cart
		cm.move_to_element(driver, cl.xpath(Datafeatch.main("add_to_cart")));
		Thread.sleep(3000);
		cm.clcik_with_javascript(driver, cl.xpath(Datafeatch.main("add_to_cart")));

		Thread.sleep(3000);

		// TODO Auto-generated catch block
		cm.clcik_with_javascript(driver, cl.xpath(Datafeatch.main("cart")));
		// click on proceed to checkout
		cm.clcik_with_javascript(driver, cl.xpath(Datafeatch.main("check_out")));
		Thread.sleep(3000);
		// enter email address
		cm.Sent_txt_box(driver, cl.id(Datafeatch.main("cemail")), exldata.data(0, 1));
		// enter first name
		cm.Sent_txt_box(driver, cl.name(Datafeatch.main("fname")), exldata.data(1, 1));
		// enter last name
		cm.Sent_txt_box(driver, cl.name(Datafeatch.main("lname")), exldata.data(2, 1));
		Thread.sleep(3000);
		JavascriptExecutor jsv = (JavascriptExecutor) driver;
		jsv.executeScript("window.scrollBy(0,400)", "");
		// enter address
		cm.Sent_txt_box(driver, cl.xpath(Datafeatch.main("street")), exldata.data(3, 1));
		// enter city
		cm.Sent_txt_box(driver, cl.name(Datafeatch.main("city")), exldata.data(4, 1));
		// select state
		cm.selectByindex(cl.xpath(Datafeatch.main("region")), 3);
		// enter zip code
		cm.Sent_txt_box(driver, cl.name(Datafeatch.main("pincode")), exldata.data(5, 1));
		// select country
		cm.selectByindex(cl.xpath(Datafeatch.main("country")), 4);
		// enter number
		cm.Sent_txt_box(driver, cl.name(Datafeatch.main("phno")), exldata.data(6, 1));
		// enter shipping method
		cm.clcik_with_javascript(driver, cl.name(Datafeatch.main("unikecode")));
		// click on next
		cm.clcik_with_javascript(driver, cl.xpath(Datafeatch.main("next")));
		Thread.sleep(2000);
		cm.clcik_with_javascript(driver, cl.xpath(Datafeatch.main("next")));

	}

	// @Test(priority = 1, groups = "sanity")
	@Description("Verifying the Login function")
	public void login() throws Throwable {
		cm.clcik_with_javascript(driver, cl.xpath(Datafeatch.main("signin")));
		cm.Sent_txt_box(driver, cl.id(Datafeatch.main("email")), mail);
		cm.Sent_txt_box(driver, cl.id(Datafeatch.main("psw")), psw);

		cm.clcik_with_javascript(driver, cl.id(Datafeatch.main("login")));
		// cm.clcik_with_javascript(driver,

		cm.Sent_txt_box(driver, cl.id(Datafeatch.main("email")), mail);
		cm.Sent_txt_box(driver, cl.id(Datafeatch.main("psw")), psw);

		Thread.sleep(9000);

		cm.clcik_with_javascript(driver, cl.id(Datafeatch.main("login")));
	}

	@Description("Verify the Create new Account")
	@Test(priority = 2, groups = "sanity")
	public void Create_Account() throws IOException {
		cm.clcik_with_javascript(driver, cl.linktext(Datafeatch.main("Create_new_Account_link")));
		cm.Sent_txt_box(driver, cl.id(Datafeatch.main("fname")), exldata.data(0, 2));
		cm.Sent_txt_box(driver, cl.id(Datafeatch.main("lname")), exldata.data(1, 2));
		cm.Sent_txt_box(driver, cl.name(Datafeatch.main("email")), exldata.data(2, 2));
		cm.Sent_txt_box(driver, cl.id(Datafeatch.main("password")), exldata.data(3, 2));
		cm.Sent_txt_box(driver, cl.id(Datafeatch.main("cpassword")), exldata.data(4, 2));
		cm.clcik_with_javascript(driver, cl.xpath(Datafeatch.main("create_an_account")));

		String text = cl.xpath("//div[@class='message-error error message']").getText();
		if (text.contains("already an account with this email address"))
			assertTrue(true);
		else
			assertFalse(true);
		// refresh
		driver.navigate().refresh();
		// click on create account
		cm.clcik_with_javascript(driver, cl.xpath(Datafeatch.main("create_an_account")));
		// verifying error message
		Assert.assertEquals(cl.id(Datafeatch.main("psw_error")).getText(), "This is a required field.");

	}

	@Description("Verify the forgot password")
	@Test(priority = 3, groups = "smoke")
	public void forgot_password() throws InterruptedException, IOException {
		cl.xpath(Datafeatch.main("signin"));
		cm.clcik_with_javascript(driver, cl.xpath(Datafeatch.main("forgetpassword")));
		cm.Sent_txt_box(driver, cl.name(Datafeatch.main("email")), exldata.data(2, 2));

		Thread.sleep(9000);
		cm.clcik_with_javascript(driver, cl.xpath(Datafeatch.main("reset_psw")));
	}

	@Description("Verify the search function")
	@Test(priority = 4, groups = "smoke")
	public void search_box() throws IOException {

		cm.Sent_txt_box(driver, cl.name(Datafeatch.main("search")), exldata.data(0, 0));
		// verifying symbal is displaing or not
		AssertJUnit.assertTrue(cl.xpath(Datafeatch.main("search_btn")).isDisplayed());
		// cm.clcik_with_javascript(driver, cl.xpath(Datafeatch.main("search_btn")));
		cl.name("q").sendKeys(Keys.ENTER);
		String s = cl.xpath(Datafeatch.main("search_txt")).getText();
		Reporter.log(s, true);
		if (s.contains(exldata.data(0, 0))) {
			AssertJUnit.assertTrue(true);
		} else {
			AssertJUnit.assertTrue(false);
		}

		cm.Sent_txt_box(driver, cl.name(Datafeatch.main("search")), "p");
		// verifying symbal is displaing or not
		Reporter.log(s, cl.xpath(Datafeatch.main("search_btn")).isDisplayed());
		// cm.clcik_with_javascript(driver, cl.xpath(Datafeatch.main("search_btn")));
		cl.name("q").sendKeys(Keys.ENTER);
		s = cl.xpath(Datafeatch.main("search_txt")).getText();
		if (s.contains("p")) {
			AssertJUnit.assertTrue(true);
		} else {
			AssertJUnit.assertTrue(true);
		}

		// without enter text in serch text box
		cm.Sent_txt_box(driver, cl.name(Datafeatch.main("search")), "");
		// verifying symbal is displaing or
		Reporter.log(s, cl.xpath(Datafeatch.main("search_btn")).isDisplayed());
		// click on search symbol
		// cm.clcik_with_javascript(driver, cl.xpath(Datafeatch.main("search_btn")));
		cl.name("q").sendKeys(Keys.ENTER);
	}

	@Description("Product compare function")
	@Test(priority = 5, groups = "sanity")
	public void product_compare() throws IOException, InterruptedException {
		// search product
		cm.Sent_txt_box(driver, cl.name(Datafeatch.main("search")), exldata.data(0, 0));
		// verifying symbol is displaying or not
		Reporter.log(mail, cl.xpath(Datafeatch.main("search_btn")).isDisplayed());
		// click on search symbol
		cl.name("q").sendKeys(Keys.ENTER);
		// cl.xpath("//button[@title='Search']").click();
		// select perticular product
		cm.clcik_with_javascript(driver, cl.xpath(Datafeatch.main("2ndproduct")));
		// click on add to compare
		cm.move_to_element(driver, cl.xpath(Datafeatch.main("add_to_compare")));
		cm.clcik_with_javascript(driver, cl.xpath(Datafeatch.main("add_to_compare")));
		// verifying nummber of products add in add to compare
		String no_of_p = cl.xpath(Datafeatch.main("no_of_products_in_compare")).getText();
		if (no_of_p.contains("1")) {
			AssertJUnit.assertTrue(true);
		} else {
			AssertJUnit.assertTrue(false);
		}
		Reporter.log(cl.xpath(Datafeatch.main("no_of_products_in_compare")).getText(), true);

		// click on compare products
		cm.clcik_with_javascript(driver, cl.xpath(Datafeatch.main("no_of_products_in_compare")));
		// search product
		cm.Sent_txt_box(driver, cl.name(Datafeatch.main("search")), exldata.data(1, 0));

		cl.name("q").sendKeys(Keys.DOWN, Keys.ENTER);
		// select perticular product
		cm.clcik_with_javascript(driver, cl.xpath(Datafeatch.main("2ndproduct")));
		// click on add to compare
		cm.move_to_element(driver, cl.xpath(Datafeatch.main("add_to_compare")));
		cm.clcik_with_javascript(driver, cl.xpath(Datafeatch.main("add_to_compare")));
		Thread.sleep(3000);
		// click on compare product tab
		cm.clcik_with_javascript(driver, cl.xpath(Datafeatch.main("product_compare")));
		// verifying the number of products added
		String items = cl.xpath(Datafeatch.main("product_compare")).getText();

		if (items.contains("2")) {
			AssertJUnit.assertTrue(false);
		}
		cm.clcik_with_javascript(driver, cl.xpath(Datafeatch.main("remove_from_compare")));
		cm.clcik_with_javascript(driver, cl.xpath(Datafeatch.main("remove_ok")));
		items = cl.xpath(Datafeatch.main("product_compare")).getText();

		if (items.contains("2")) {
			AssertJUnit.assertFalse(true);
		} else {
			AssertJUnit.assertFalse(false);
		}
	}

	@Description("Verify the Product page")
	@Test(priority = 6, groups = "sanity")
	public void product_page() throws IOException {
		// search for product
		cm.Sent_txt_box(driver, cl.name(Datafeatch.main("search")), exldata.data(0, 0));
		cl.name("q").sendKeys(Keys.ENTER);
		// cm.clcik_with_javascript(driver,cl.xpath("//button[@title='Search']"));
		// cm.clcik_with_javascript(driver, cl.id("sorter"));
		// select price
		cm.selectByindex(cl.id(Datafeatch.main("sort_by")), 1);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}
		// filter product name
		cm.selectByindex(cl.id(Datafeatch.main("sort_by")), 0);
		// select perticular product
		cm.clcik_with_javascript(driver, cl.xpath(Datafeatch.main("2ndproduct")));
		// filter size
		String fsize = cl.xpath(Datafeatch.main("verifysize")).getText();
		// select the change
		cm.clcik_with_javascript(driver, cl.xpath(Datafeatch.main("size"))); // size
		String Changesize = cl.xpath(Datafeatch.main("verifysize")).getText();
		if (fsize.equals(Changesize)) {
			AssertJUnit.assertFalse(true);
		}
		// color
		// select first colour
		String fcolor = cl.xpath(Datafeatch.main("verifycolor")).getText();
		cm.clcik_with_javascript(driver, cl.xpath(Datafeatch.main("color")));
		String Changecolor = cl.xpath(Datafeatch.main("verifycolor")).getText();
		if (fcolor.equals(Changecolor)) {
			AssertJUnit.assertTrue(false);
		}
	}

	@Description("Verify the add to cart function")
	@Test(priority = 7, groups = "smoke")
	public void add_to_cart() throws IOException, InterruptedException {
		// search product
		cm.Sent_txt_box(driver, cl.name(Datafeatch.main("search")), exldata.data(0, 0));
		cl.name("q").sendKeys(Keys.ENTER);
		// select perticular product
		cm.clcik_with_javascript(driver, cl.xpath(Datafeatch.main("2ndproduct")));

		// filter size
		cm.clcik_with_javascript(driver, cl.xpath(Datafeatch.main("size")));

		// filter color
		cm.clcik_with_javascript(driver, cl.xpath(Datafeatch.main("color")));

		// click on add to cart
		cm.clcik_with_javascript(driver, cl.xpath(Datafeatch.main("add_to_cart")));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		}
		cm.clcik_with_javascript(driver, cl.xpath(Datafeatch.main("add_to_cart")));

		cm.Click_function(driver, cl.xpath(Datafeatch.main("cart_symbl")));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// click on my cart symbol
		cm.clcik_with_javascript(driver, cl.xpath(Datafeatch.main("cart")));
		String count = cl.xpath(Datafeatch.main("prdct_count")).getText();
		Reporter.log(count);

		try {
			cm.Click_function(driver, cl.xpath(Datafeatch.main("remove")));
			Thread.sleep(3000);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
		}
		// click on delete product from add to cart
		cm.clcik_with_javascript(driver, cl.xpath(Datafeatch.main("remove")));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cm.clcik_with_javascript(driver, cl.xpath(Datafeatch.main("ok")));

		// shirts

		cm.Sent_txt_box(driver, cl.name(Datafeatch.main("search")), exldata.data(1, 0));

		cl.name("q").sendKeys(Keys.DOWN, Keys.ENTER);

		cm.clcik_with_javascript(driver, cl.xpath(Datafeatch.main("2ndproduct")));
		// size adujest
		cm.clcik_with_javascript(driver, cl.xpath(Datafeatch.main("size")));

		// color
		Thread.sleep(2000);
		// cm.clcik_with_javascript(driver, cl.xpath(Datafeatch.main("color")));
		cm.clcik_with_javascript(driver, cl.xpath(Datafeatch.main("add_to_cart")));

		cm.Sent_txt_box(driver, cl.name(Datafeatch.main("search")), exldata.data(0, 0));
		cl.name("q").sendKeys(Keys.ENTER);
		cm.clcik_with_javascript(driver, cl.xpath(Datafeatch.main("2ndproduct")));

		// size adujest
		cm.clcik_with_javascript(driver, cl.xpath(Datafeatch.main("size")));

		cm.clcik_with_javascript(driver, cl.xpath(Datafeatch.main("color")));

		cm.clcik_with_javascript(driver, cl.xpath(Datafeatch.main("add_to_cart")));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cm.clcik_with_javascript(driver, cl.xpath(Datafeatch.main("add_to_cart")));
		Thread.sleep(3000);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cm.clcik_with_javascript(driver, cl.xpath(Datafeatch.main("cart")));
		String count1 = cl.xpath(Datafeatch.main("prdct_count")).getText();
		Reporter.log(count, true);
		if (count1.contains("4")) {
			AssertJUnit.assertTrue(true);
		}

	}

}
