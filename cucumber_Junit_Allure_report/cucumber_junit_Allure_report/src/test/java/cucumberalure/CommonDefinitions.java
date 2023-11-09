package cucumberalure;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Allure;
import io.qameta.allure.TmsLink;

public class CommonDefinitions {
	public static WebDriver driver;
	 
    @Before
    public void setup() {
       WebDriverManager.firefoxdriver().setup();
 
        driver = new FirefoxDriver();
 
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
 @TmsLink(value = "vamshi")
    @After
    public void tearDown(Scenario scenario) throws IOException {
       
            if (scenario.isFailed()) {
                TakesScreenshot ts = (TakesScreenshot) driver;
                byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
                File src=ts.getScreenshotAs(OutputType.FILE);
                File dsc=new File("C:\\Users\\VamshidharReddyDevir\\eclipse-workspace\\Testngprograms\\cucumberalure\\Screenshot"+scenario.getName()+".png");
Files.copy(src, dsc);
Allure.addAttachment(scenario.getName(),new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));
Allure.link("https://stackoverflow.com/questions/50941193/how-to-add-link-on-test-case-failure-in-allure-report");
            }
        driver.quit();
    
    }
}

