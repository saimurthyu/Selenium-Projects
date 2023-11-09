package Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
public static	WebDriver driver;
public static void browser() {
	WebDriverManager.edgedriver().setup();
 driver=new EdgeDriver();
	
}
}
