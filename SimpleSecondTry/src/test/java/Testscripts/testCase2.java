package Testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class testCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "D:/eclipse/lib/IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		String URL = "https://www.gigamon.com/";
		driver.get(URL);
		driver.manage().window().maximize();
	}

}
