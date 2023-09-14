package com.AUtomatiom.Sep10_day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Undertanding_Webpage {

	public static void main(String[] args) {		
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		
		WebElement signinLink = driver.findElement(By.className("signin"));
		signinLink.click();
		
		WebElement usernameTextbox = driver.findElement(By.id("login"));
		usernameTextbox.sendKeys("seleniumpanda@rediff.com");
		
		WebElement passwordTextbox = driver.findElement(By.id("passwd"));
		passwordTextbox.sendKeys("selenium@123");
		
		WebElement loginButton = driver.findElement(By.id("signingbtn"));
		loginButton.click();
				
		
		
		driver.findElement(By.className("bmailicon relative")).click();
		
		
		
		WebElement createAccount = driver.findElement(By.linkText("createAccout"));
		createAccount.click();
		
		WebElement fullname = driver.findElement(By.linkText("Ramdane Hachour"));
		
		
		
		
		
		
	
		

	}

}
