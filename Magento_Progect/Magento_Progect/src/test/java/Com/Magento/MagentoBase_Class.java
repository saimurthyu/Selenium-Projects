package Com.Magento;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.Common_Methods.ComanLocaters;
import com.Common_Methods.ComanMethods;
import com.Driverfactory.Browser;
import com.Utilites.Datafeatch;
import com.Utilites.Exceldata;

import io.qameta.allure.Description;

public class MagentoBase_Class extends Browser {
	public ComanLocaters cl;
	public ComanMethods cm;
	public String url;
	public String mail;
	public String psw;
	public Exceldata exldata;

	@Description("Launch browser and navigate to url")
	@BeforeClass(groups = { "smoke", "sanity" })
	public void lunchurl() throws EncryptedDocumentException, IOException {
		browser();
		cl = new ComanLocaters();
		cm = new ComanMethods();
		url = null;
		mail = null;
		psw = null;
		try {
			url = Datafeatch.main("url");
			mail = Datafeatch.main("emai");
			psw = Datafeatch.main("pw");
		} catch (IOException e) {
		}
		exldata = new Exceldata("testdata");
		// System.out.println(exldata.data(0, 0));
		driver.get(url);
	}

	@BeforeMethod
	public void login() throws Throwable {

	}

	@AfterMethod
	public void logout() {

	}

	@AfterClass(groups = { "smoke", "sanity" })
	public void quit() {
		driver.quit();
	}

}
