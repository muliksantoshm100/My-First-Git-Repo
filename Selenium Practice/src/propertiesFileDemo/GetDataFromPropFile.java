package propertiesFileDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GetDataFromPropFile {

	public static void main(String[] args) throws IOException {

		FileInputStream file = new FileInputStream(
				"C:\\Users\\Santosh\\Desktop\\New folder\\Automation Practice\\Selenium Practice\\src\\propertiesFileDemo\\imp_Data.properties");

		Properties prop = new Properties();

		prop.load(file);

		String browser = prop.getProperty("browserName");
		System.out.println(browser);

		System.out.println(prop.getProperty("url"));
		
		System.out.println(prop.getProperty("userName"));
		System.out.println(prop.getProperty("password"));

	}

}
