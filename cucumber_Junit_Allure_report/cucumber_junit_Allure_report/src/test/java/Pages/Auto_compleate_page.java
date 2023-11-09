package Pages;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Auto_compleate_page {
	public WebDriver driver;
	@FindBy(xpath ="//*[text()='Widgets']")
	public WebElement widgets;
	@FindBy(xpath = "//*[text()='Auto Complete']")
	public WebElement auto_compleate;
	@FindBy(xpath = "//input[@id='autoCompleteMultipleInput']")
	public WebElement typemclors;
	
	@FindBy(xpath = "//input[@id='autoCompleteSingleInput']")
	public WebElement singlecolor;
	
	@FindBy(xpath = "//span[text()='Menu']")
	public WebElement Menu; 
	@FindBy(linkText = "Main Item 1")
	public WebElement menu1;
	@FindBy(linkText = "Main Item 2")
	public WebElement menu2;
	
	@FindBy(xpath = "//*[text()='Main Item 2']/../ul/li")
	public WebElement submenu1;
	@FindBy(xpath = "//*[text()='Main Item 2']/../ul/li[2]")
	public WebElement submenu2;
	@FindBy(xpath = "//*[text()='Main Item 2']/../ul/li[3]")
	public WebElement submenu3;
	@FindBy(xpath = "//*[text()='SUB SUB LIST »']/../ul/li")
	public WebElement subsubmenu;

	public Auto_compleate_page(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	public void test() throws InterruptedException {
	
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", widgets);
		Thread.sleep(3000);
		
		  executor.executeScript("arguments[0].click();", auto_compleate);
		  Thread.sleep(3000); typemclors.sendKeys("red" + Keys.ENTER);
		  Thread.sleep(3000); typemclors.sendKeys("gre" + Keys.ENTER);
		  Thread.sleep(3000); typemclors.sendKeys("black" + Keys.ENTER);
		  typemclors.sendKeys(Keys.TAB); Thread.sleep(3000);
		  singlecolor.sendKeys("black" + Keys.ENTER); singlecolor.sendKeys(Keys.TAB);
		 
	}
		public void menu() throws InterruptedException {
			JavascriptExecutor executor1 = (JavascriptExecutor)driver;
			executor1.executeScript("arguments[0].click();", widgets);
			Thread.sleep(3000);
		executor1.executeScript("arguments[0].click();", Menu);
		Actions act=new Actions(driver);
		act.moveToElement(menu1).perform();
		Thread.sleep(3000);
		act.moveToElement(menu2).perform();
		Thread.sleep(3000);
		act.moveToElement(submenu1).perform();
		Thread.sleep(3000);
		act.moveToElement(submenu2).perform();
		Thread.sleep(3000);
		act.moveToElement(submenu3).perform();
		Thread.sleep(3000);
		act.moveToElement(subsubmenu).perform();
		
	}
		
	}
	
	


