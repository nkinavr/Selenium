package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumTest {

	
	public static void main(String[] args) {
		String projectLocation = System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", projectLocation+"\\lib\\geckodriver\\geckodriver.exe");
		//System.setProperty("webdriver.firefox.bin","location of firefox executable");
		WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new MarionetteDriver();
		
		
		driver.get("http://seleniumhq.org/");
		//driver.get("http://www.seleniumhq.org/");
		//driver.get("https://www.facebook.com//");
		//driver.findElement(By.xpath(".//button")); //Maanda tricks
		
		//driver.quit();
		
		System.out.println("Hello, World!");
	}
}
