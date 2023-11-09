package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
public static WebDriver driver;
public static void browser() {
	WebDriverManager.edgedriver().setup();
	driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/");
}

}
