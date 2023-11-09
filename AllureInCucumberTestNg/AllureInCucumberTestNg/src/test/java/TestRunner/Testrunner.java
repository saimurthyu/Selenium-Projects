package TestRunner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Browsers.Browser;
import io.cucumber.testng.AbstractTestNGCucumberTests;

 
@Test
@io.cucumber.testng.CucumberOptions(features = {
        "src/test/resources/Features" }, glue ="Step_Definition", plugin = {
                "pretty", "html:test-output", "json:target/cucumber-report/cucumber.json" })
public class Testrunner extends AbstractTestNGCucumberTests {
@BeforeClass
public void browser() {
	Browser.browser();
	Browser.driver.manage().window().maximize();
}
@AfterClass
public void closebrowser() {
	Browser.driver.close();
}
}
