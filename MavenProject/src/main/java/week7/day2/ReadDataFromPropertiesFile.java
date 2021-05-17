package week7.day2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertiesFile {

	public static void main(String[] args) throws IOException {
		//set up path for the file to access
		FileInputStream obj=new FileInputStream("./src/main/resources/config.properties");
		//create object for the properties file
		Properties prop=new Properties();
		//load the property file
		prop.load(obj);
		System.out.println(prop.getProperty("username"));
		

	}

}
