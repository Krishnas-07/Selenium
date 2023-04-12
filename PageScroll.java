package com.selenium.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageScroll {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KPS\\Downloads\\chromedriver_win32\\chromedriver.exe");	// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;//interface to trigger javascript
		js.executeScript("window.scrollBy(0,1500)", "");// for scrolling page
		WebElement dummy=driver.findElement(By.id("aaa"));
		js.executeScript("arguments[0].click();",dummy);

	}

}
