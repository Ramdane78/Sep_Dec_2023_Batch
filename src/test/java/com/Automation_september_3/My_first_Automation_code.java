package com.Automation_september_3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class My_first_Automation_code {

	public static void main(String[] args)  {
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		driver.quit();
				
		WebDriver driver1 = new FirefoxDriver();
		driver1.manage().window().maximize();
		driver1.get("https://target.com");
		driver1.quit();
				
		WebDriver driver2 = new EdgeDriver(); 
		driver2.manage().window().maximize();
		driver2.get("https://google.com");
		driver2.quit();
	}

}
