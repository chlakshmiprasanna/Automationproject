package Webdriverprogms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Drivercommands {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "D:/eclipse/lib/IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		//WebDriver driver = new FirefoxDriver();

		
String URL = "https://www.google.co.in/";
driver.get(URL);
driver.manage().window().maximize();
//driver.close();

String CurrentURL = driver.getCurrentUrl();
System.out.println("current page url is :- " + CurrentURL);

String PageTitle= driver.getTitle();
System.out.println("PageTitle is :- " + PageTitle);

String Pagesource = driver.getPageSource();
System.out.println("Pagesource is :- " + Pagesource);

/*String Getclass = driver.getClass();
System.out.println("Getclass is :- " + Getclass);

String CurrentURL = driver.getCurrentUrl();
System.out.println("current page url is :- " + CurrentURL);*/
//int conutsize = driver.findElement(By.className('test1')).getsize();
	}

}
