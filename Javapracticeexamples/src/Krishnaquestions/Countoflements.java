package Krishnaquestions;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
//java.util;

public class Countoflements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "D:/eclipse/lib/IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		//WebDriver driver = new FirefoxDriver();

		
String URL = "https://www.vormetric.com/";
driver.get(URL);
driver.manage().window().maximize();
java.util.List<WebElement> boxes = driver.findElements(By.linkText("DOWNLOAD"));
int numberOfBoxes = boxes.size();

//Dimension io =  driver.findElement(By.id("Homeslider")).getSize();
System.out.println(numberOfBoxes);
	}

}
