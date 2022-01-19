package javaproject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//import java.io.FileNotFoundException;
import java.util.Properties;

public class corejava {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\workspace1\\TestNGWeb\\src\\javaproject\\data.properties");
		prop.load(fis);     // prop load for FIS
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		
		// update new browser in here, console window appear
		prop.setProperty("browser", "Firefox");
		System.out.println(prop.getProperty("browser"));
		
		prop.setProperty("url", "https://www.google.com/");
		System.out.println(prop.getProperty("url"));
		
		prop.setProperty("Uname", "Prakash");
		System.out.println(prop.getProperty("Uname"));
		
		prop.setProperty("Password", "vip@123");
		System.out.println(prop.getProperty("Password"));
		
		// update this new browser name in data properties file
		
		FileOutputStream fos = new FileOutputStream("C:\\workspace1\\TestNGWeb\\src\\javaproject\\data.properties");
         prop.store(fos, null);
         
         
				}

}
