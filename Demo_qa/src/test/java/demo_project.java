import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo_project {

	public static void main(String[] args) throws InterruptedException {

		// webdrivermanager is class and chromedriver is a method and setup is also a
		// method used to setup particular browser
		WebDriverManager.chromedriver().setup();

		// webdriver is a interface and driver is reference varible and chromedriver is
		// a method
		WebDriver driver = new ChromeDriver();

		// this is used to give 10 implicitly wait for 10 seconds for every instruction
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// .get(); is method form web driver interface
		driver.get("https://demoqa.com/");

		// used to maximize the window
		driver.manage().window().maximize();

		// web element is a interface
		WebElement element = driver.findElement(By.xpath("//div[@class='card-up']"));
		element.click();

		// used to click the text box
		driver.findElement(By.id("item-0")).click();

		// used to enter the username
		driver.findElement(By.id("userName")).sendKeys("saimurthy");

		// used to enter the email
		driver.findElement(By.id("userEmail")).sendKeys("saimurthyu041@gmail.com");

		// used to enter the current address
		driver.findElement(By.xpath("//textarea[@class='form-control']"))
				.sendKeys("4-131,karmikanagar-2,poranki,vijayawada,521137");

		// entering the parement address
		driver.findElement(By.id("permanentAddress")).sendKeys("4-131,karmikanagar-2,poranki,vijayawada,521137");

		// clicking the submit button
		WebElement submit = driver.findElement(By.id("submit"));

		// creating for java script is an interface to access the particular web element
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Assigning the particular web element with clicking action
		js.executeScript("arguments[0].click();", submit);

		// moving into the check box
		driver.findElement(By.id("item-1")).click();
		// clicking the + symbol to expend all
		driver.findElement(By.xpath("//button[@class='rct-option rct-option-expand-all']")).click();

		// selecting the all the check box
		driver.findElement(By.xpath("//span[@class='rct-checkbox']")).click();

		// moving into the radio button
		driver.findElement(By.id("item-2")).click();

		// clicking the impressive button
		driver.findElement(By.xpath("//label[text()='Impressive']")).click();

		// clicking webtables
		driver.findElement(By.id("item-3")).click();

        //inserting the data in the search box
		driver.findElement(By.id("searchBox")).sendKeys("Gentry");

		Thread.sleep(3000);
		//clearing the data 
		driver.findElement(By.id("searchBox")).clear();
		
		//adding the data into the table
		driver.findElement(By.xpath("//div[@class='col-md-7']//button[@id='addNewRecordButton']")).click();
		
		//adding the first name
		driver.findElement(By.id("firstName")).sendKeys("sai");
		
		//entering the last name
		driver.findElement(By.id("lastName")).sendKeys("murthy");
		
		//entering the email
		driver.findElement(By.id("userEmail")).sendKeys("saimurthyu041@gmail.com");
		
		//entering the age
		driver.findElement(By.id("age")).sendKeys("26");
		
		//entering the salary
		driver.findElement(By.id("salary")).sendKeys("30000");
		
		//entering the department
		driver.findElement(By.id("department")).sendKeys("cse");
		
		//clicking the submit button
		driver.findElement(By.id("submit")).click();
		
		
		//clicking the button
		WebElement button=driver.findElement(By.id("item-4"));
		js.executeScript("arguments[0].click();", button);
		
		
		//double click the element
		WebElement doubleclick=driver.findElement(By.xpath("//button[text()='Double Click Me']"));
		
		//actions is a class to perform mouse and key board action 
		Actions act= new Actions(driver);
		
		//assigning the mouse double click using the actions class 
		//we can use by using build,perform
		act.doubleClick(doubleclick).build().perform();
	
		//finding the right click using id
		WebElement rightclick=driver.findElement(By.id("rightClickBtn"));
		
		//assigning the mouse right click using the actions class 
				//we can use by using build,perform
		act.contextClick(rightclick).build().perform();
		
		//finding the right click
		driver.findElement(By.xpath("//div[@class='mt-4']//button[text()='Click Me']")).click();
		
		//clicking the links
		WebElement link=driver.findElement(By.id("item-5"));
		js.executeScript("arguments[0].click();",link);
		//clicking the home link
		driver.findElement(By.linkText("Home")).click();
		
		//get window handles used for handling the windows
		//here we using the collection set is the one of the collection because it ignores the duplicates
		Set<String>handle=driver.getWindowHandles();
		
		//iterator is used to move from one data another data
		Iterator it=handle.iterator();
		
		//storing data of a windows 
		String parntid=(String) it.next();
		String childid=(String) it.next();
		
		//switching into the child window
		driver.switchTo().window(childid);
		
		
		
		//closing the current window i.e child window  
		driver.close();
		driver.switchTo().window(parntid);
		 driver.findElement(By.xpath("//div[text()='Elements']//span[@class='pr-1']")).click();
		
	Thread.sleep(3000);
	WebElement alert=driver.findElement(By.xpath("//*[text()='Alerts, Frame & Windows']"));
		js.executeScript("arguments[0].click();", alert);
		
		driver.findElement(By.xpath("//*[text()='Browser Windows']")).click();
		
		driver.findElement(By.id("tabButton")).click();
		
		Set<String>handle1=driver.getWindowHandles();
		Iterator it1=handle1.iterator();
	
		String parent=(String)it1.next();
		String child=(String) it1.next();
		
		driver.switchTo().window(child);
		WebElement text=driver.findElement(By.id("sampleHeading"));
		System.out.println(text.getText());
		driver.close();
		driver.switchTo().window(parent);
		
		driver.findElement(By.xpath("//*[text()='New Window']")).click();
		
		
		Set<String>handle2=driver.getWindowHandles();
		Iterator it2=handle2.iterator();
	
		String parent1=(String)it2.next();
		String child1=(String) it2.next();
		
		driver.switchTo().window(child1);
		WebElement text1=driver.findElement(By.id("sampleHeading"));
		System.out.println(text1.getText());
		driver.close();
		driver.switchTo().window(parent1);
		
		driver.findElement(By.id("messageWindowButton")).click();
		

		Set<String>handle3=driver.getWindowHandles();
		Iterator it3=handle3.iterator();
	
		String parent2=(String)it3.next();
		String child2=(String) it3.next();
		
		driver.switchTo().window(child2);
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(parent2);
		
		WebElement alert1=driver.findElement(By.xpath("//span[text()='Alerts']"));
		js.executeScript("arguments[0].click();", alert1);
		driver.findElement(By.id("alertButton")).click();
		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("confirmButton")).click();
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.id("promtButton")).click();
		driver.switchTo().alert().sendKeys("saimurthy");
		driver.switchTo().alert().accept();
		
		WebElement frame=driver.findElement(By.xpath("//span[text()='Frames']"));
		js.executeScript("arguments[0].click();",frame );
		driver.switchTo().frame("frame1");
		System.out.println(driver.findElement(By.id("sampleHeading")).getText());
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame2");
		System.out.println(driver.findElement(By.id("sampleHeading")).getText());
		driver.switchTo().defaultContent();
		
WebElement nested=driver.findElement(By.xpath("//span[text()='Nested Frames']"));
		js.executeScript("argumnets[0].click();", nested);
		
		driver.switchTo().frame("frame1");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@*='<p>Child Iframe</p>']")));
		System.out.println(driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText());
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//span[text()='Modal Dialogs']")).click();
		
		
		
	}
}
