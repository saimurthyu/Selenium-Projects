package Runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
 
@RunWith(Cucumber.class)
@CucumberOptions(features = {
        "src/test/resources/feature" }, glue ="cucumberalure", plugin = {
                "pretty", "html:test-output", "json:target/cucumber-report/cucumber.json" })
public class Testrunner {

}
