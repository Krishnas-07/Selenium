package com.selenium.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KPS\\Downloads\\chromedriver_win32\\chromedriver.exe");	// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/javascript-alert.php");
		driver.manage().window().maximize();
			
		WebElement javaScript=driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		
		javaScript.click();
		//driver.switchTo().alert().accept();//to click ok
		String text=driver.switchTo().alert().getText();//to get text in the dialogue box
		System.out.println(text);//to print text
		driver.switchTo().alert().dismiss();// to click cancel button of dialogue box
		//driver.close();
			

	}

}
