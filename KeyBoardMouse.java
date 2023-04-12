package com.selenium.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardMouse {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KPS\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/buttons");//// TODO Auto-generated method stub
		driver.manage().window().maximize();
		WebElement DoubleClick=driver.findElement(By.id("doubleClickBtn"));
		Actions obj=new Actions(driver);
		obj.doubleClick(DoubleClick).perform();//to double click at a specified locaion
		//obj.doubleClick().perform();// just for clicking anywhwere in screen
		WebElement rightClick=driver.findElement(By.id("rightClickBtn"));
		obj.contextClick(rightClick).perform();
		obj.moveToElement(rightClick).perform();// to move mouse 
		
		obj.sendKeys(Keys.ARROW_DOWN).perform();// to use keyboard keys
		
	}

}
