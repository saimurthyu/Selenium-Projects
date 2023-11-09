import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataromExcel {
	public static String[][] data() throws EncryptedDocumentException, IOException {
		//ArrayList<String> s=new ArrayList();
		String s[][]=new String[4][2];
		FileInputStream fis=new FileInputStream("D:\\MyFramewok\\Datadriventeesting\\Testdata\\Certifications - Updated list.xls");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet("certificates");
		for(int i=0;i<2;i++) {
			Row ro=sh.getRow(i);
			//int lastcell=ro.getLastCellNum();
			for(int j=0;j<2;j++) {
				System.out.print(ro.getCell(j).getStringCellValue());
				 s[i][j]=ro.getCell(j).getStringCellValue();
			}
		}
		return s;
	}
	@DataProvider(name= "vamshi")
	public static String[][] geting() throws EncryptedDocumentException, IOException{
		/* return new String [][] {{"vamshi","shiva","devi"},{"123","3455","678"}}; */
		String s[][]=data();
		return s;
	
		
	}
	@Test(dataProvider = "vamshi")
	public void test(String s,String s2) {
		System.out.println(s);
	
	}

}
