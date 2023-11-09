 package Coman;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Browsers.Browser;

public class ComanLocaters extends Browser{

	public WebElement id(String s) {
		return driver.findElement(By.id(s));
	}
	public WebElement classname(String s) {
		return driver.findElement(By.className(s));
	}
	public WebElement name(String s) {
		return driver.findElement(By.name(s));
	}
	public WebElement cssname(String s) {
		return driver.findElement(By.cssSelector(s));
	}
	public WebElement linktext(String s) {
		return driver.findElement(By.linkText(s));
	}
	public WebElement partiallinktext(String s) {
		return driver.findElement(By.partialLinkText(s));
	}
	public WebElement xpath(String s) {
	return 	driver.findElement(By.xpath(s));
	}
	public List<WebElement> mxpath(String s) {
		
		return driver.findElements(By.xpath(s));
		
	}

}
