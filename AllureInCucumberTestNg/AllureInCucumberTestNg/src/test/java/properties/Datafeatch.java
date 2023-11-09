package properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Datafeatch {
	public static File f;
	
	
	public Datafeatch(File f2) {
		// TODO Auto-generated constructor stub
		this.f=f2;
	}

	

	public static String data(String data) throws IOException {
		FileInputStream fis=new FileInputStream(f);
		Properties poj=new Properties();
		poj.load(fis);
		String s=poj.getProperty(data);
		return s;
	}
	public static void main(String[] args) throws IOException {
		//System.out.println(data("url"));
	}
	

}
