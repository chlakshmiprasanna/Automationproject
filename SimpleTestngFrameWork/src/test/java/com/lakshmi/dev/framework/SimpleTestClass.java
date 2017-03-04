package com.lakshmi.dev.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SimpleTestClass {

	@BeforeClass
	public void launchApplication() {
		System.out.println("This is Before Class");
	}

	@BeforeMethod
	public void loginPage() {
		System.out.println("This is Before Method");
	}

	@Test
	public void testMethod() {
		System.setProperty("webdriver.ie.driver", "D:/eclipse/lib/IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://www.google.com");
	}
	
	@Test
	public void testMethod2() {
		System.out.println("This is Test Method2");
	}

	@AfterMethod
	public void logoutApplication() {
		System.out.println("This is After Method");
	}

	@AfterClass
	public void exitBrowser() {
		System.out.println("This is After Class");
	}

}
