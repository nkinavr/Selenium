package test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import config.PropertiesFile;

public class MakeCodeModular { 
		
		public static String browser;
		public static WebDriver driver;
		public static String projectLocation;
		
	public static void main(String[] args) {
	  setBrower(); //we gonna set this from the properties class
	  PropertiesFile.readPropertiesFile();
	  setBrowserConfig();
	  runTest();
	  PropertiesFile.writePropertiesFiles();
			
	}
	
	/**
	 * Description: sets browser 
	 * @author ramonyain
	 * @date 15-10-2018
	 */
	public static void setBrower() {
			
	    //browser = "Firefox";
		browser = "Chrome";
	}
	
	/**
	 * Description: sets browser configuration
	 * @author ramonyain
	 * @date 15-10-2018
	 */
	public static void setBrowserConfig() {
			
	    projectLocation = System.getProperty("user.dir");
			
	    //Firefox
	    if(browser.contains("Firefox")) {
			System.setProperty("webdriver.gecko.driver", projectLocation+"\\lib\\geckodriver\\geckodriver.exe");
			driver = new FirefoxDriver();
		 }
			
		 //Chrome
		 if(browser.contains("Chrome")) {
			 System.setProperty("webdriver.chrome.driver",projectLocation+"\\lib\\chromedriver\\chromedriver.exe");
			 driver = new ChromeDriver();
		  }
	}
			
	/**
	 * Description: runs and validates the test
	 * @author ramonyain
	 * @date 15-10-2018
	 */
	public static void runTest() {
			
		driver.get("http://seleniumhq.org/");
		driver.quit();
		System.out.println("Hello, World!");

		}
		
	}

