package com.selenium.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\KPS\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");//// TODO Auto-generated method stub
		driver.manage().window().maximize();// TODO Auto-generated method stub
		//driver.switchTo().frame("frame1");//switch to frame
		WebElement frameUsingIndex=driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frameUsingIndex);//switch to frame using index but it is not recommended
		
		/*WebElement element=driver.findElement(By.id("frame1"));
		driver.switchTo().frame(element);//switch to frame using element*/
		
		WebElement text=driver.findElement(By.id("sampleHeading"));
		String sampleText=text.getText();
		System.out.println(sampleText);
		
		driver.switchTo().parentFrame();//switch from frame to main page
	//	driver.switchTo().defaultContent()
		
	}

}
