package Coman;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.google.common.io.Files;


import Browsers.Browser;
import io.qameta.allure.Allure;

public class Listnersclass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log(result.getName()+" Test has started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log(result.getName()+" Test has success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log(result.getName()+" Test has fail");
		TakesScreenshot sh=(TakesScreenshot)Browser.driver;
		File src=sh.getScreenshotAs(OutputType.FILE);
		File  drs=new File("D:\\MyFramewok\\TestNgreports\\Screenshots\\"+result.getName()+".png");
		try {
			Files.copy(src, drs);
			Allure.addAttachment(result.getName(), new ByteArrayInputStream(((TakesScreenshot)Browser.driver).getScreenshotAs(OutputType.BYTES)));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log(result.getName()+" Test has Skipped");
	}

}
