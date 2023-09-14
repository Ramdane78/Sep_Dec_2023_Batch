package com.AUtomatiom.Sep10_day4;
 import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Understanding_HowseleniumWorks {

	public static void main(String[] args) {
		// every Laptop is a client
		//you write Selenium code with OOP language of your choice in the client
		//this code interact with server of application you want to use
		//the Application is in form of Website
		//so to interact with that application you need a browser
		//Selenium+OOP language code interacts with the driver of that browser which in turn interact with browser
		//finally we see the out come in browser at UI (user interface
		//Selenuim is an API library
		ChromeDriver driver = new ChromeDriver(); // Ctrl +shift +o import package from library
		//row no 18 opens a blank Chrome driver browser
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://google.com");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://amazone.com");
		
		
	}

}
