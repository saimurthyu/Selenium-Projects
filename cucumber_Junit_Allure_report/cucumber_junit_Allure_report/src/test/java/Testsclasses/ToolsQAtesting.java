package Testsclasses;

import org.junit.Test;

import Pages.Auto_compleate_page;
import browsers.Browser;

public class ToolsQAtesting extends Browser {
@Test
public void testcasesrun() throws InterruptedException {
	browser();
	Auto_compleate_page ac=new Auto_compleate_page(driver);
	ac.test();
	String s=null;
}
}
