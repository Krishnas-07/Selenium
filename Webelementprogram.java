package com.selenium.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelementprogram {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KPS\\Downloads\\chromedriver_win32\\chromedriver.exe");	// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.qabible.in/payrollapp/site/login");
		driver.manage().window().maximize();
		
		
		WebElement userName=driver.findElement(By.id("loginform-username"));
		userName.sendKeys("Krishna");//used for entering text into various field
		WebElement password=driver.findElement(By.id("loginform-password"));
		password.sendKeys("abc");
		WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();//used for clicking buttons 
		//userName.clear();// to clear Text field
		String text=login.getText();//used to get text in the buttons
		System.out.println(text);
		String property=login.getCssValue("background-color");// used to get properties of button
		System.out.println(property);
		String font=login.getCssValue("font-family");
		System.out.println(font);
		String tagname=login.getTagName();
		System.out.println(tagname);//to get tag name
	
	}

}
