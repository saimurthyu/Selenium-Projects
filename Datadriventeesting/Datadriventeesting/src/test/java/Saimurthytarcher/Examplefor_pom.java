package Saimurthytarcher;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Examplefor_pom {
	public WebDriver driver;
	Examplefor_pom(WebDriver d){
		this.driver=d;
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath = "//input[@id='user-name']")
	public WebElement username;
	@FindBy(xpath="//input[@id='password']")
	public WebElement password;
	
	public WebElement getusername(String username) {
		this.username.sendKeys(username);
		return this.username;
	}
	public WebElement getpass(String pass) {
		this.password.sendKeys(pass);
		return password;
	}
}
