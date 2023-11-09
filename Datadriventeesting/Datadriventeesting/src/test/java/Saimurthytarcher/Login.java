package Saimurthytarcher;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
static WebDriver driver=null;
/*
 * public static void main(String[] args) { // TODO Auto-generated method stub
 * WebDriverManager.edgedriver().setup(); driver=new EdgeDriver();
 * driver.get("https://www.saucedemo.com/v1/"); Examplefor_pom ob=new
 * Examplefor_pom(driver); ob.getusername("performance_glitch_user");
 * ob.getpass("secret_sauce"); }
 */
@BeforeClass
public void navigate() {
	WebDriverManager.edgedriver().setup(); 
	driver=new EdgeDriver();
}
@BeforeMethod
public void navigateurl() {
	 driver.get("https://www.saucedemo.com/v1/");
}
@Test
public void login() {
	Examplefor_pom ob=new
			  Examplefor_pom(driver);
	ob.getusername("performance_glitch_user");
	  ob.getpass("secret_sauce");
	
}
@AfterMethod
public void logout() {
	driver.close();
}
@AfterClass
public void close() {
	
}

}
