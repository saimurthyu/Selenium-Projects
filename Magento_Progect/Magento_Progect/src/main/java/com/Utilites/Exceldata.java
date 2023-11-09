package com.Utilites;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exceldata {
	public String sheet;

	public Exceldata(String string) {
		sheet = string;
	}

	public String data(int row, int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(".//Resources//magento TestData.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet(sheet);
		DataFormatter df = new DataFormatter();
		return df.formatCellValue(sh.getRow(row).getCell(cell));
	}

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		Exceldata exldata = new Exceldata("testdata");
		System.out.println(exldata.data(0, 0));
	}
}
