package com.selenium.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltip {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\KPS\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");//// TODO Auto-generated method stub
		driver.manage().window().maximize();//// TODO Auto-generated method stub
WebElement allToolTip=driver.findElement(By.id("searchDropdownBox"));
String title=allToolTip.getAttribute("title");
System.out.println(title);
	}

}
