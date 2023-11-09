package com.Utilites;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Datafeatch {

	public static String main(String s) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream(".//Resources//Keys.properties");
		Properties poj = new Properties();
		poj.load(fis);
		String url = poj.getProperty(s);
		// System.out.println(url);
		return url;

	}

	public static void main(String[] args) throws IOException {
		main("url");
	}

}
