package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import test.MakeCodeModular;

public class PropertiesFile {
	
	static Properties prop = new Properties();
	
	public static void main(String[] args) {
		readPropertiesFile();
		writePropertiesFiles();
		readPropertiesFile();

	}
	
	/**
	 * Descriotion:
	 * @author ramonyain
	 * @date 15-10-2018
	 */
	public static void readPropertiesFile() {
		 
		try {
			InputStream input = new FileInputStream("C:\\Users\\ramonyain\\Documents\\Ddocuments\\Eclipse\\Workspace\\SeleniumTest\\src\\config\\config,properties");
		    prop.load(input);
		    System.out.println(prop.getProperty("browser"));  
		    //MakeCodeModular.browser = prop.getProperty("browser");
		    //System.out.println(MakeCodeModular.browser);
		
		
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * 
	 */
	public static void writePropertiesFiles() {
		
		try {
			
			OutputStream output = new FileOutputStream("C:\\Users\\ramonyain\\Documents\\Ddocuments\\Eclipse\\Workspace\\SeleniumTest\\src\\config\\config,properties");
		    prop.setProperty("browser","Chrome");
		    prop.store(output,"saved");  
		
		
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}