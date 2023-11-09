package Coman;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComanLocatersWithPagefactory {
	public WebDriver driver;
	public  String s;
	@FindBy(id="")
	public WebElement id;
	ComanLocatersWithPagefactory(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement id(String s) {
	this.s=s;
	return id;
		
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


}
