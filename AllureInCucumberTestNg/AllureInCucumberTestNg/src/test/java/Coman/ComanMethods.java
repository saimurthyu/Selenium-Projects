package Coman;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ComanMethods {
	
	public static String mainwindow_id;
	public static ArrayList<String> copeyall;
	
	public void Sent_txt_box(WebDriver driver,WebElement element,String data) {
		WebDriverWait wait=new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
		element.clear();
		element.sendKeys(data);
		
	}
	public void Clear_text(WebElement element,WebDriver driver) {
		WebDriverWait wait=new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
		element.clear();

	}
	public void Click_function(WebElement element,WebDriver driver)  {
		WebDriverWait wait=new WebDriverWait(driver,5);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
		element.click();
	}
	public void Enter_with_Sendkeys(WebElement element,String s) {
		element.sendKeys(s,Keys.ENTER);
	}
	public void keysclass(WebElement element,Keys key) {
		element.sendKeys(key);
	}
	public void move_to_element(WebDriver driver,WebElement element) {
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	}
	public void  Rightclick(WebDriver driver,WebElement elemwnt) {
		Actions act=new Actions(driver);
		act.contextClick(elemwnt).build().perform();
	}
	public void  doubleclick(WebDriver driver,WebElement element) {
		Actions act=new Actions(driver);
		act.doubleClick(element).perform();
	}
	public void drag_drop(WebDriver driver,WebElement drag,WebElement drop) {
		Actions act=new Actions(driver);
		act.dragAndDrop(drag, drop).perform();
	}
	public void selectByindex(WebElement element,int index) {
		Select select=new Select(element);
		select.selectByIndex(index);
	}
	public void selectByvalue(WebElement element,String calue) {
		Select select=new Select(element);
		select.selectByValue(calue);
	}
	public void selectBytext(WebElement element,String text) {
		Select select=new Select(element);
		select.selectByVisibleText(text);
	}
	public void desselectByindex(WebElement element,int index) {
		Select select=new Select(element);
		select.deselectByIndex(index);
	}public void desselectByvalue(WebElement element,String calue) {
		Select select=new Select(element);
		select.deselectByValue(calue);
	}
	public void deselectBytext(WebElement element,String text) {
		Select select=new Select(element);
		select.deselectByVisibleText(text);
	}
	public void switch_to_frame_by_webelement(WebDriver driver,WebElement element) {
		driver.switchTo().frame(element);
	}
	public void switch_to_frame_by_index(WebDriver driver,int index) {
		driver.switchTo().frame(index);
	}
	public void Switch_out_from_frame(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	public void clcik_with_javascript(WebDriver driver,WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void Findwindowsids(WebDriver driver) {
		mainwindow_id=driver.getWindowHandle();
	Set<String> allids=driver.getWindowHandles();
	copeyall=new ArrayList<>(allids);
	
	}
	public WebDriver switch_to_window(WebDriver driver,int index) {
		driver.switchTo().window(copeyall.get(index));
		return driver;
	}
	public void alert_accept(WebDriver driver) {
		Alert alt=driver.switchTo().alert();
		alt.accept();
	}
	public void alert_dismiss(WebDriver driver) {
		Alert alt=driver.switchTo().alert();
		alt.dismiss();
	}
	public void alert_sendkeys(WebDriver driver,String text) {
		Alert alt=driver.switchTo().alert();
		alt.sendKeys(text);
	}
	public void Drag_and_drop_with_axis(WebDriver driver,WebElement slide,int  x_axis,int y_axis) {
		Actions act=new Actions(driver);
		act.dragAndDropBy(slide,x_axis,y_axis).build().perform();
	}
	

}
