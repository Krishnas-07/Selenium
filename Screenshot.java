package com.selenium.sample;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KPS\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/select-input.php");//// TODO Auto-generated method stub
		driver.manage().window().maximize();	// TODO Auto-generated method stub
		//Interface & method for Capture Screenshot 
		  TakesScreenshot scrShot =(TakesScreenshot)driver;
		  File screenShot = scrShot.getScreenshotAs(OutputType.FILE);//screenshot will store in temporary path
		  
		  
		  File finalDestination=new File("C:\\Users\\KPS\\Desktop\\Selenium\\ScreenshotImage.png");//creating a location for screenshot
		  FileHandler.copy(screenShot, finalDestination);//to save in our system file
		  
	}

}
