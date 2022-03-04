package com.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {

		public static WebDriver driver;
	public static String baseURL="";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vpunyama\\Documents\\Selenium_Jar\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		//driver.manage().maximize();
		/*driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		baseURL="https://web.whatsapp.com/";
		driver.get("https://web.whatsapp.com/");
		
		if(driver.getTitle().equals("web.whatsapp.com"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}*/
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		baseURL = "http://demo.automationtesting.in/Index.html";
		driver.get(baseURL);

		if (driver.getTitle().equals("Index")) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		
		driver.quit();
		

	}

}
